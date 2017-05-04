package org.sch.issecurity.iam.tools.PSContractorLoader.reader;

import org.sch.issecurity.iam.tools.PSContractorLoader.model.Contractor;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Builds a Contractor from a row in the CSV file (as a set of fields)
 */
public class ContractorFieldSetMapper implements FieldSetMapper<Contractor>
{
    private SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
    private SimpleDateFormat dateTimeFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm");

    @Override
    public Contractor mapFieldSet(FieldSet fieldSet) throws BindException {
        Contractor contractor = new Contractor();

        contractor.setPersonID( fieldSet.readString( "Person ID" ) );
        String effectiveDate = fieldSet.readString("Effective Date");
        try {
            contractor.setEffectiveDate(new java.sql.Date(dateFormat.parse(effectiveDate).getTime()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        contractor.setFirstName( fieldSet.readString( "First Name" ) );
        contractor.setMiddleName( fieldSet.readString( "Middle Name" ) );
        contractor.setLastName( fieldSet.readString( "Last Name" ) );
        contractor.setStatus( fieldSet.readString( "Status" ) );
        contractor.setPhone( fieldSet.readString( "Phone" ) );
        contractor.setAddress1( fieldSet.readString( "Address 1" ) );
        contractor.setAddress2( fieldSet.readString( "Address 2" ) );
        contractor.setCity( fieldSet.readString( "City" ) );
        contractor.setState( fieldSet.readString( "State" ) );
        contractor.setPostal( fieldSet.readString( "Postal" ) );
        contractor.setCountry( fieldSet.readString( "Country" ) );
        contractor.setManagerID( fieldSet.readString( "Manager ID" ) );
        contractor.setManagerName( fieldSet.readString( "Manager Name" ) );
        contractor.setDepartmentID( fieldSet.readString( "Department" ) );
        contractor.setDepartmentDesc( fieldSet.readString( "Department Descr" ) );
        contractor.setLocationID( fieldSet.readString( "Location" ) );
        contractor.setLocationDesc( fieldSet.readString( "Location Descr" ) );
        contractor.setEmailID( fieldSet.readString( "Email ID" ) );
        contractor.setPurchaseOrder( fieldSet.readString( "Purchase Order" ) );
        contractor.setJobTitle( fieldSet.readString( "Job Title" ) );

        String contractBeginDate = fieldSet.readString("Contract Begin Date");
        try {
            contractor.setContractBeginDate(new java.sql.Date(dateFormat.parse(contractBeginDate).getTime()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String contractEndDate = fieldSet.readString("Contract End Date");
        try {
            contractor.setContractEndDate(new java.sql.Date(dateFormat.parse(contractEndDate).getTime()));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        contractor.setVendorID( fieldSet.readString( "Vendor ID" ) );
        contractor.setVendorName( fieldSet.readString( "Vendor Name" ) );
        contractor.setPreviouslyEmployed( fieldSet.readString( "Previously Employed by Company" ) );
        contractor.setADID( fieldSet.readString( "AD ID" ) );
        contractor.setCreatedBy( fieldSet.readString( "Created By" ) );

        String createdDTTM = fieldSet.readString("Created DTTM");
        try {
            contractor.setCreatedDTTM(new java.sql.Timestamp(dateTimeFormat.parse(createdDTTM).getTime()));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        contractor.setLastUpdatedBy( fieldSet.readString( "Last updated By" ) );
        contractor.setComment( fieldSet.readString( "Comment" ) );
        return contractor;
    }
}
