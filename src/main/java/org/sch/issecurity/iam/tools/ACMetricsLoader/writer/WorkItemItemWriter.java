package org.sch.issecurity.iam.tools.ACMetricsLoader.writer;

import org.sch.issecurity.iam.tools.ACMetricsLoader.model.WorkItem;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Writes workItems to a database
 */
public class WorkItemItemWriter implements ItemWriter<WorkItem>g
{
    private static final String GET_ANALYSTID = "select analystID from Analyst where UPPER(firstName) = ?";
    private static final String GET_ALL_APPLICATIONCODES = "select appCode from Application";
    private static final String GET_APPID = "select appID from Application where appCode = ?";
    private static final String GET_OPERATIONID = "select operationID from Operation where operationType = ?";
    private static final String GET_ACMETRICS = "select personID, effectiveDate, firstName, middleName, lastName, status, phone, address1, address2, city, state, postal, country, managerID, managerName, departmentID, departmentDesc, locationID, locationDesc, emailID, purchaseOrder, jobTitle, contractBeginDate, contractEndDate, vendorID, vendorName, previouslyEmployed, ADID, createdBy, createdDTTM, lastUpdatedBy, comment from PS_WorkItem where personID = ?";
    private static final String INSERT_ACMETRICS = "insert into PS_WorkItem (personID, effectiveDate, firstName, middleName, lastName, status, phone, address1, address2, city, state, postal, country, managerID, managerName, departmentID, departmentDesc, locationID, locationDesc, emailID, purchaseOrder, jobTitle, contractBeginDate, contractEndDate, vendorID, vendorName, previouslyEmployed, ADID, createdBy, createdDTTM, lastUpdatedBy, comment) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    private static final String UPDATE_ACMETRICS = "update PS_WorkItem set effectiveDate = ?, firstName = ?, middleName = ?, lastName = ?, status = ?, phone = ?, address1 = ?, address2 = ?, city = ?, state = ?, postal = ?, country = ?, managerID = ?, managerName = ?, departmentID = ?, departmentDesc = ?, locationID = ?, locationDesc = ?, emailID = ?, purchaseOrder = ?, jobTitle = ?, contractBeginDate = ?, contractEndDate = ?, vendorID = ?, vendorName = ?, previouslyEmployed = ?, ADID = ?, createdBy = ?, createdDTTM = ?, lastUpdatedBy = ?, comment = ? where personID = ?";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void write(List<? extends WorkItem> workItems) throws Exception
    {
        List<String> appCodeList = jdbcTemplate.query(GET_ALL_APPLICATIONCODES);
        for( WorkItem workItem : workItems )
        {
            List<WorkItem> workItemList = jdbcTemplate.query(GET_CONTRACTOR, new Object[] {workItem.getPersonID()}, new RowMapper<WorkItem>() {
                @Override
                public WorkItem mapRow( ResultSet resultSet, int rowNum ) throws SQLException {
                    WorkItem workItem = new WorkItem();
                    workItem.setPersonID( resultSet.getString( 1 ) );
                    workItem.setEffectiveDate( resultSet.getDate( 2 ) );
                    workItem.setFirstName( resultSet.getString( 3 ) );
                    workItem.setMiddleName( resultSet.getString( 4 ) );
                    workItem.setLastName( resultSet.getString( 5 ) );
                    workItem.setStatus( resultSet.getString( 6 ) );
                    workItem.setPhone( resultSet.getString( 7 ) );
                    workItem.setAddress1( resultSet.getString( 8 ) );
                    workItem.setAddress2( resultSet.getString( 9 ) );
                    workItem.setCity( resultSet.getString( 10 ) );
                    workItem.setState( resultSet.getString( 11 ) );
                    workItem.setPostal( resultSet.getString( 12 ) );
                    workItem.setCountry( resultSet.getString( 13 ) );
                    workItem.setManagerID( resultSet.getString( 14 ) );
                    workItem.setManagerName( resultSet.getString( 15 ) );
                    workItem.setDepartmentID( resultSet.getString( 16 ) );
                    workItem.setDepartmentDesc( resultSet.getString( 17 ) );
                    workItem.setLocationID( resultSet.getString( 18 ) );
                    workItem.setLocationDesc( resultSet.getString( 19 ) );
                    workItem.setEmailID( resultSet.getString( 20 ) );
                    workItem.setPurchaseOrder( resultSet.getString( 21 ) );
                    workItem.setJobTitle( resultSet.getString( 22 ) );
                    workItem.setContractBeginDate( resultSet.getDate( 23 ) );
                    workItem.setContractEndDate( resultSet.getDate( 24 ) );
                    workItem.setVendorID( resultSet.getString( 25 ) );
                    workItem.setVendorName( resultSet.getString( 26 ) );
                    workItem.setPreviouslyEmployed( resultSet.getString( 27 ) );
                    workItem.setADID( resultSet.getString( 28 ) );
                    workItem.setCreatedBy( resultSet.getString( 29 ) );
                    workItem.setCreatedDTTM( resultSet.getTimestamp( 30 ) );
                    workItem.setLastUpdatedBy( resultSet.getString( 31 ) );
                    workItem.setComment( resultSet.getString( 32 ) );
                    return workItem;
                }
            });

            if( workItemList.size() > 0 )
            {
                jdbcTemplate.update( UPDATE_CONTRACTOR, workItem.getEffectiveDate(), workItem.getFirstName(), workItem.getMiddleName(), workItem.getLastName(), workItem.getStatus(), workItem.getPhone(), workItem.getAddress1(), workItem.getAddress2(), workItem.getCity(), workItem.getState(), workItem.getPostal(), workItem.getCountry(), workItem.getManagerID(), workItem.getManagerName(), workItem.getDepartmentID(), workItem.getDepartmentDesc(), workItem.getLocationID(), workItem.getLocationDesc(), workItem.getEmailID(), workItem.getPurchaseOrder(), workItem.getJobTitle(), workItem.getContractBeginDate(), workItem.getContractEndDate(), workItem.getVendorID(), workItem.getVendorName(), workItem.getPreviouslyEmployed(), workItem.getADID(), workItem.getCreatedBy(), workItem.getCreatedDTTM(), workItem.getLastUpdatedBy(), workItem.getComment(), workItem.getPersonID() );
            }
            else
            {
                jdbcTemplate.update( INSERT_CONTRACTOR, workItem.getPersonID(), workItem.getEffectiveDate(), workItem.getFirstName(), workItem.getMiddleName(), workItem.getLastName(), workItem.getStatus(), workItem.getPhone(), workItem.getAddress1(), workItem.getAddress2(), workItem.getCity(), workItem.getState(), workItem.getPostal(), workItem.getCountry(), workItem.getManagerID(), workItem.getManagerName(), workItem.getDepartmentID(), workItem.getDepartmentDesc(), workItem.getLocationID(), workItem.getLocationDesc(), workItem.getEmailID(), workItem.getPurchaseOrder(), workItem.getJobTitle(), workItem.getContractBeginDate(), workItem.getContractEndDate(), workItem.getVendorID(), workItem.getVendorName(), workItem.getPreviouslyEmployed(), workItem.getADID(), workItem.getCreatedBy(), workItem.getCreatedDTTM(), workItem.getLastUpdatedBy(), workItem.getComment() );
            }
        }
    }
}
