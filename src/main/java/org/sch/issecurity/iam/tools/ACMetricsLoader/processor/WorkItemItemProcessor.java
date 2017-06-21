package org.sch.issecurity.iam.tools.ACMetricsLoader.processor;

import org.sch.issecurity.iam.tools.ACMetricsLoader.model.WorkItem;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Processor that finds existing workItems and updates a workItem quantity appropriately
 */
public class WorkItemItemProcessor implements ItemProcessor<WorkItem,WorkItem>
{
    @Override
    public WorkItem process(WorkItem workItem) throws Exception
    {
        // Return the (possibly) update workItem
        return workItem;
    }
}
