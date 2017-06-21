package org.sch.issecurity.iam.tools.ACMetricsLoader.reader;

import org.sch.issecurity.iam.tools.ACMetricsLoader.model.WorkItem;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Builds a WorkItem from a row in the CSV file (as a set of fields)
 */
public class WorkItemFieldSetMapper implements FieldSetMapper<WorkItem>
{
    private SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
    private SimpleDateFormat dateTimeFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm");

    @Override
    public WorkItem mapFieldSet(FieldSet fieldSet) throws BindException {
        WorkItem workItem = new WorkItem();

        String tranDate = fieldSet.readString("tranDate");
        try {
            workItem.setTranDate(new java.sql.Date(dateFormat.parse(tranDate).getTime()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        workItem.setAnalystFirstName(fieldSet.readString( "analystFirstName" ));
        workItem.setSNOWID(fieldSet.readString( "SNOWID" ));

        workItem.setAD_UC(fieldSet.readString( "AD_UC" ));
        workItem.setExchange_UC(fieldSet.readString( "exchange_UC" ));
        workItem.setLync_UC(fieldSet.readString( "lync_UC" ));
        workItem.setBox_UC(fieldSet.readString( "box_UC" ));
        workItem.setShareDrive_UC(fieldSet.readString( "shareDrive_UC" ));
        workItem.setShareMailbox_UC(fieldSet.readString( "shareMailbox_UC" ));
        workItem.setEPIC_UC(fieldSet.readString( "EPIC_UC" ));
        workItem.setCerner_UC(fieldSet.readString( "cerner_UC" ));
        workItem.setKronos_UC(fieldSet.readString( "kronos_UC" ));
        workItem.setAccessHR_UC(fieldSet.readString( "accessHR_UC" ));
        workItem.setFSCM_UC(fieldSet.readString( "FSCM_UC" ));
        workItem.setOnBase_UC(fieldSet.readString( "onBase_UC" ));
        workItem.setMDPortal_UC(fieldSet.readString( "MDPortal_UC" ));
        workItem.setHaiku_UC(fieldSet.readString( "haiku_UC" ));
        workItem.setVoalte_UC(fieldSet.readString( "voalte_UC" ));
        workItem.setGRASP_UC(fieldSet.readString( "GRASP_UC" ));
        workItem.setPassport_UC(fieldSet.readString( "passport_UC" ));
        workItem.setPayor_UC(fieldSet.readString( "payor_UC" ));
        workItem.setAnalytics_UC(fieldSet.readString( "analytics_UC" ));
        workItem.setFundsFlow_UC(fieldSet.readString( "fundsFlow_UC" ));
        workItem.setLane_UC(fieldSet.readString( "lane_UC" ));
        workItem.setFANSOS_UC(fieldSet.readString( "FANSOS_UC" ));
        workItem.setZirmed_UC(fieldSet.readString( "zirmed_UC" ));
        workItem.setEmdeon_UC(fieldSet.readString( "emdeon_UC" ));
        workItem.setLogMeIn_UC(fieldSet.readString( "logMeIn_UC" ));
        workItem.setResQ_UC(fieldSet.readString( "resQ_UC" ));
        workItem.setVersusRTLS_UC(fieldSet.readString( "versusRTLS_UC" ));
        workItem.setMeditech_UC(fieldSet.readString( "meditech_UC" ));
        workItem.setMCCM_UC(fieldSet.readString( "MCCM_UC" ));
        workItem.setExercisePro_UC(fieldSet.readString( "exercisePro_UC" ));
        workItem.setiCares_UC(fieldSet.readString( "iCares_UC" ));
        workItem.setConnexall_UC(fieldSet.readString( "connexall_UC" ));
        workItem.setVocera_UC(fieldSet.readString( "vocera_UC" ));
        workItem.setMyChild_UC(fieldSet.readString( "myChild_UC" ));
        workItem.setQualtrics_UC(fieldSet.readString( "qualtrics_UC" ));
        workItem.setSyngo_UC(fieldSet.readString( "syngo_UC" ));
        workItem.setTeamsite_UC(fieldSet.readString( "teamsite_UC" ));
        workItem.setWordpress_UC(fieldSet.readString( "wordpress_UC" ));
        workItem.setServer_UC(fieldSet.readString( "server_UC" ));
        workItem.setTrackCore_UC(fieldSet.readString( "trackCore_UC" ));
        workItem.setVHI_UC(fieldSet.readString( "VHI_UC" ));
        workItem.setSharePoint_UC(fieldSet.readString( "sharePoint_UC" ));
        workItem.setTSI_UC(fieldSet.readString( "TSI_UC" ));
        workItem.setEPSi_UC(fieldSet.readString( "EPSi_UC" ));
        workItem.setTableau_UC(fieldSet.readString( "tableau_UC" ));
        workItem.setGetwell_UC(fieldSet.readString( "getwell_UC" ));
        workItem.setGotoMeeting_UC(fieldSet.readString( "gotoMeeting_UC" ));
        workItem.setSNOW_UC(fieldSet.readString( "SNOW_UC" ));
        workItem.setAD_OPER(fieldSet.readString( "AD_OPER" ));
        workItem.setExchange_OPER(fieldSet.readString( "exchange_OPER" ));
        workItem.setLync_OPER(fieldSet.readString( "lync_OPER" ));
        workItem.setBox_OPER(fieldSet.readString( "box_OPER" ));
        workItem.setShareDrive_OPER(fieldSet.readString( "shareDrive_OPER" ));
        workItem.setShareMailbox_OPER(fieldSet.readString( "shareMailbox_OPER" ));
        workItem.setEPIC_OPER(fieldSet.readString( "EPIC_OPER" ));
        workItem.setCerner_OPER(fieldSet.readString( "cerner_OPER" ));
        workItem.setKronos_OPER(fieldSet.readString( "kronos_OPER" ));
        workItem.setAccessHR_OPER(fieldSet.readString( "accessHR_OPER" ));
        workItem.setFSCM_OPER(fieldSet.readString( "FSCM_OPER" ));
        workItem.setOnBase_OPER(fieldSet.readString( "onBase_OPER" ));
        workItem.setMDPortal_OPER(fieldSet.readString( "MDPortal_OPER" ));
        workItem.setHaiku_OPER(fieldSet.readString( "haiku_OPER" ));
        workItem.setVoalte_OPER(fieldSet.readString( "voalte_OPER" ));
        workItem.setGRASP_OPER(fieldSet.readString( "GRASP_OPER" ));
        workItem.setPassport_OPER(fieldSet.readString( "passport_OPER" ));
        workItem.setPayor_OPER(fieldSet.readString( "payor_OPER" ));
        workItem.setAnalytics_OPER(fieldSet.readString( "analytics_OPER" ));
        workItem.setFundsFlow_OPER(fieldSet.readString( "fundsFlow_OPER" ));
        workItem.setLane_OPER(fieldSet.readString( "lane_OPER" ));
        workItem.setFANSOS_OPER(fieldSet.readString( "FANSOS_OPER" ));
        workItem.setZirmed_OPER(fieldSet.readString( "zirmed_OPER" ));
        workItem.setEmdeon_OPER(fieldSet.readString( "emdeon_OPER" ));
        workItem.setLogMeIn_OPER(fieldSet.readString( "logMeIn_OPER" ));
        workItem.setResQ_OPER(fieldSet.readString( "resQ_OPER" ));
        workItem.setVersusRTLS_OPER(fieldSet.readString( "versusRTLS_OPER" ));
        workItem.setMeditech_OPER(fieldSet.readString( "meditech_OPER" ));
        workItem.setMCCM_OPER(fieldSet.readString( "MCCM_OPER" ));
        workItem.setExercisePro_OPER(fieldSet.readString( "exercisePro_OPER" ));
        workItem.setiCares_OPER(fieldSet.readString( "iCares_OPER" ));
        workItem.setConnexall_OPER(fieldSet.readString( "connexall_OPER" ));
        workItem.setVocera_OPER(fieldSet.readString( "vocera_OPER" ));
        workItem.setMyChild_OPER(fieldSet.readString( "myChild_OPER" ));
        workItem.setQualtrics_OPER(fieldSet.readString( "qualtrics_OPER" ));
        workItem.setSyngo_OPER(fieldSet.readString( "syngo_OPER" ));
        workItem.setTeamsite_OPER(fieldSet.readString( "teamsite_OPER" ));
        workItem.setWordpress_OPER(fieldSet.readString( "wordpress_OPER" ));
        workItem.setServer_OPER(fieldSet.readString( "server_OPER" ));
        workItem.setTrackCore_OPER(fieldSet.readString( "trackCore_OPER" ));
        workItem.setVHI_OPER(fieldSet.readString( "VHI_OPER" ));
        workItem.setSharePoint_OPER(fieldSet.readString( "sharePoint_OPER" ));
        workItem.setTSI_OPER(fieldSet.readString( "TSI_OPER" ));
        workItem.setEPSi_OPER(fieldSet.readString( "EPSi_OPER" ));
        workItem.setTableau_OPER(fieldSet.readString( "tableau_OPER" ));
        workItem.setGetwell_OPER(fieldSet.readString( "getwell_OPER" ));
        workItem.setGotoMeeting_OPER(fieldSet.readString( "gotoMeeting_OPER" ));
        workItem.setSNOW_OPER(fieldSet.readString( "SNOW_OPER" ));

        return workItem;
    }
}
