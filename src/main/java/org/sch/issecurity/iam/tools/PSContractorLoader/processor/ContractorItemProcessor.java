package org.sch.issecurity.iam.tools.PSContractorLoader.processor;

import org.sch.issecurity.iam.tools.PSContractorLoader.model.Contractor;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Processor that finds existing contractors and updates a contractor quantity appropriately
 */
public class ContractorItemProcessor implements ItemProcessor<Contractor,Contractor>
{
    private static final String GET_CONTRACTOR = "select personID, effectiveDate, firstName, middleName, lastName, status, phone, address1, address2, city, state, postal, country, managerID, managerName, departmentID, departmentDesc, locationID, locationDesc, emailID, purchaseOrder, jobTitle, contractBeginDate, contractEndDate, vendorID, vendorName, previouslyEmployed, ADID, createdBy, createdDTTM, lastUpdatedBy, comment from PS_Contractor where personID = ?";
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Contractor process(Contractor contractor) throws Exception
    {
        // Retrieve the contractor from the database
        List<Contractor> contractorList = jdbcTemplate.query(GET_CONTRACTOR, new Object[] {contractor.getPersonID()}, new RowMapper<Contractor>() {
            @Override
            public Contractor mapRow( ResultSet resultSet, int rowNum ) throws SQLException {
                Contractor contractor = new Contractor();
                contractor.setPersonID( resultSet.getString( 1 ) );
                contractor.setEffectiveDate( resultSet.getDate( 2 ) );
                contractor.setFirstName( resultSet.getString( 3 ) );
                contractor.setMiddleName( resultSet.getString( 4 ) );
                contractor.setLastName( resultSet.getString( 5 ) );
                contractor.setStatus( resultSet.getString( 6 ) );
                contractor.setPhone( resultSet.getString( 7 ) );
                contractor.setAddress1( resultSet.getString( 8 ) );
                contractor.setAddress2( resultSet.getString( 9 ) );
                contractor.setCity( resultSet.getString( 10 ) );
                contractor.setState( resultSet.getString( 11 ) );
                contractor.setPostal( resultSet.getString( 12 ) );
                contractor.setCountry( resultSet.getString( 13 ) );
                contractor.setManagerID( resultSet.getString( 14 ) );
                contractor.setManagerName( resultSet.getString( 15 ) );
                contractor.setDepartmentID( resultSet.getString( 16 ) );
                contractor.setDepartmentDesc( resultSet.getString( 17 ) );
                contractor.setLocationID( resultSet.getString( 18 ) );
                contractor.setLocationDesc( resultSet.getString( 19 ) );
                contractor.setEmailID( resultSet.getString( 20 ) );
                contractor.setPurchaseOrder( resultSet.getString( 21 ) );
                contractor.setJobTitle( resultSet.getString( 22 ) );
                contractor.setContractBeginDate( resultSet.getDate( 23 ) );
                contractor.setContractEndDate( resultSet.getDate( 24 ) );
                contractor.setVendorID( resultSet.getString( 25 ) );
                contractor.setVendorName( resultSet.getString( 26 ) );
                contractor.setPreviouslyEmployed( resultSet.getString( 27 ) );
                contractor.setADID( resultSet.getString( 28 ) );
                contractor.setCreatedBy( resultSet.getString( 29 ) );
                contractor.setCreatedDTTM( resultSet.getTimestamp( 30 ) );
                contractor.setLastUpdatedBy( resultSet.getString( 31 ) );
                contractor.setComment( resultSet.getString( 32 ) );
                return contractor;
            }
        });
        if( contractorList.size() > 0 )
        {
            // Add the new quantity to the existing quantity
            Contractor existingContractor = contractorList.get( 0 );
        }
        // Return the (possibly) update contractor
        return contractor;
    }
}
