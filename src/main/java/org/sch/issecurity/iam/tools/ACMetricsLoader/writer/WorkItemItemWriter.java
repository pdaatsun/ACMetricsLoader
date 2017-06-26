package org.sch.issecurity.iam.tools.ACMetricsLoader.writer;

import org.sch.issecurity.iam.tools.ACMetricsLoader.model.ACMetrics;
import org.sch.issecurity.iam.tools.ACMetricsLoader.model.WorkItem;
import org.sch.issecurity.iam.tools.ACMetricsLoader.utility.ReflectionTool;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;

/**
 * Writes workItems to a database
 */
public class WorkItemItemWriter implements ItemWriter<WorkItem>
{
    private static final String GET_ANALYSTID = "select analystID from Analyst where UPPER(firstName) = ?";
    private static final String GET_ALL_APPLICATIONCODES = "select distinct appCode from Application";
    private static final String GET_APPID = "select appID from Application where appCode = ?";
    private static final String GET_OPERATIONID = "select operationID from Operation where operationType = ?";
    private static final String GET_ACMETRICS = "select tranDate, analystID, SNOWID, appID, operationID, numOfUsers, uploadDate from ACMetrics where tranDate = ? and analystID = ? and SNOWID = ? and appID = ? and operationID = ?";
    private static final String INSERT_ACMETRICS = "insert into ACMetrics (tranDate, analystID, SNOWID, appID, operationID, numOfUsers, uploadDate) values (?,?,?,?,?,?,?)";
    private static final String UPDATE_ACMETRICS = "update ACMetrics set numOfUsers = ?, uploadDate = ? where tranDate = ? and analystID = ? and SNOWID = ? and appID = ? and operationID = ?";
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void write(List<? extends WorkItem> workItems) throws Exception
    {
        List<String> appCodeList = jdbcTemplate.query(GET_ALL_APPLICATIONCODES, new RowMapper() {
            public Object mapRow(ResultSet resultSet, int i) throws SQLException {
                return resultSet.getString(1);
            }
        });

        Date tranDate = null;
        String analystFirstName = null;
        String SNOWID = null;
        int analystID, appID, operationID;
        String getAppUCMethodName = null;
        String getAppOPERMethodName = null;
        String appUC = null;
        int appUCint;
        String appOPER = null;

        Date uploadDate = new java.sql.Date(Calendar.getInstance().getTime().getTime());

        for( WorkItem workItem : workItems )
        {
            if (((workItem.getTranDate()!=null) && (workItem.getTranDate().toString().length()>0)) && ((workItem.getAnalystFirstName()!=null) && (workItem.getAnalystFirstName().length()>0))&& ((workItem.getSNOWID()!=null) && (workItem.getSNOWID().length()>0))) {
                tranDate = workItem.getTranDate();
                analystFirstName = workItem.getAnalystFirstName().trim();
                analystID = jdbcTemplate.queryForObject(GET_ANALYSTID, new Object[]{analystFirstName.toUpperCase()}, Integer.class);
                SNOWID = workItem.getSNOWID().trim();

                for (String appCode : appCodeList) {
                    appID = jdbcTemplate.queryForObject(GET_APPID, new Object[]{appCode}, Integer.class);
                    getAppUCMethodName = "get" + appCode + "_UC";
                    getAppOPERMethodName = "get" + appCode + "_OPER";

                    appUC = (String) ReflectionTool.reflectionCall(workItem, "org.sch.issecurity.iam.tools.ACMetricsLoader.model.WorkItem", getAppUCMethodName, new Class[]{}, new Object[]{});
                    appOPER = (String) ReflectionTool.reflectionCall(workItem, "org.sch.issecurity.iam.tools.ACMetricsLoader.model.WorkItem", getAppOPERMethodName, new Class[]{}, new Object[]{});

                    if (((appUC != null) && (appUC.length() > 0)) && ((appOPER != null) && (appOPER.length() > 0))) {
                        appUCint = Integer.parseInt(appUC);
                        operationID = jdbcTemplate.queryForObject(GET_OPERATIONID, new Object[]{appOPER}, Integer.class);

                        List<ACMetrics> acMetricsList = jdbcTemplate.query(GET_ACMETRICS, new Object[]{tranDate, analystID, SNOWID, appID, operationID}, new BeanPropertyRowMapper(ACMetrics.class));

                        if (acMetricsList.size() > 0) {
                            jdbcTemplate.update(UPDATE_ACMETRICS, appUCint, uploadDate, tranDate, analystID, SNOWID, appID, operationID);
                        } else {
                            jdbcTemplate.update(INSERT_ACMETRICS, tranDate, analystID, SNOWID, appID, operationID, appUCint, uploadDate);
                        }
                    }
                }
            }
        }
    }
}
