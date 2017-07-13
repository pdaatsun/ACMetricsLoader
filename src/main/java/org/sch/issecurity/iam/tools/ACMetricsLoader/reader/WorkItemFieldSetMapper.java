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
        workItem.setExchange_UC(fieldSet.readString( "Exchange_UC" ));
        workItem.setLync_UC(fieldSet.readString( "Lync_UC" ));
        workItem.setBox_UC(fieldSet.readString( "Box_UC" ));
        workItem.setShareDrive_UC(fieldSet.readString( "ShareDrive_UC" ));
        workItem.setShareMailbox_UC(fieldSet.readString( "ShareMailbox_UC" ));
        workItem.setEPIC_UC(fieldSet.readString( "EPIC_UC" ));
        workItem.setCerner_UC(fieldSet.readString( "Cerner_UC" ));
        workItem.setKronos_UC(fieldSet.readString( "Kronos_UC" ));
        workItem.setAccessHR_UC(fieldSet.readString( "AccessHR_UC" ));
        workItem.setFSCM_UC(fieldSet.readString( "FSCM_UC" ));
        workItem.setOnBase_UC(fieldSet.readString( "OnBase_UC" ));
        workItem.setMDPortal_UC(fieldSet.readString( "MDPortal_UC" ));
        workItem.setHaiku_UC(fieldSet.readString( "Haiku_UC" ));
        workItem.setVoalte_UC(fieldSet.readString( "Voalte_UC" ));
        workItem.setGRASP_UC(fieldSet.readString( "GRASP_UC" ));
        workItem.setPassport_UC(fieldSet.readString( "Passport_UC" ));
        if ((fieldSet.readString("Payor_UC") != null) && (fieldSet.readString("Payor_UC").length() > 0)) {
            if ((fieldSet.readString("Payor_SC") != null) && (fieldSet.readString("Payor_SC").length() > 0)) {
                try {
                    int payorUC = Integer.parseInt(fieldSet.readString("Payor_UC"));
                    int payorSC = Integer.parseInt(fieldSet.readString("Payor_SC"));
                    workItem.setPayor_UC(String.valueOf(payorUC * payorSC));
                } catch (Exception e) {
                    workItem.setPayor_UC(null);
                }
            } else {
                workItem.setPayor_UC(fieldSet.readString( "Payor_UC" ));
            }
        }
        workItem.setAnalytics_UC(fieldSet.readString( "Analytics_UC" ));
        workItem.setFundsFlow_UC(fieldSet.readString( "FundsFlow_UC" ));
        workItem.setLane_UC(fieldSet.readString( "Lane_UC" ));
        workItem.setFANSOS_UC(fieldSet.readString( "FANSOS_UC" ));
        workItem.setZirmed_UC(fieldSet.readString( "Zirmed_UC" ));
        workItem.setEmdeon_UC(fieldSet.readString( "Emdeon_UC" ));
        workItem.setLogMeIn_UC(fieldSet.readString( "LogMeIn_UC" ));
        workItem.setResQ_UC(fieldSet.readString( "ResQ_UC" ));
        workItem.setVersusRTLS_UC(fieldSet.readString( "VersusRTLS_UC" ));
        workItem.setMeditech_UC(fieldSet.readString( "Meditech_UC" ));
        workItem.setMCCM_UC(fieldSet.readString( "MCCM_UC" ));
        workItem.setExercisePro_UC(fieldSet.readString( "ExercisePro_UC" ));
        workItem.setiCares_UC(fieldSet.readString( "iCares_UC" ));
        workItem.setConnexall_UC(fieldSet.readString( "Connexall_UC" ));
        workItem.setVocera_UC(fieldSet.readString( "Vocera_UC" ));
        workItem.setMyChild_UC(fieldSet.readString( "MyChild_UC" ));
        workItem.setQualtrics_UC(fieldSet.readString( "Qualtrics_UC" ));
        workItem.setSyngo_UC(fieldSet.readString( "Syngo_UC" ));
        workItem.setTeamsite_UC(fieldSet.readString( "Teamsite_UC" ));
        workItem.setWordpress_UC(fieldSet.readString( "Wordpress_UC" ));
        workItem.setServer_UC(fieldSet.readString( "Server_UC" ));
        workItem.setTrackCore_UC(fieldSet.readString( "TrackCore_UC" ));
        workItem.setVHI_UC(fieldSet.readString( "VHI_UC" ));
        workItem.setSharePoint_UC(fieldSet.readString( "SharePoint_UC" ));
        workItem.setTSI_UC(fieldSet.readString( "TSI_UC" ));
        workItem.setEPSi_UC(fieldSet.readString( "EPSi_UC" ));
        workItem.setTableau_UC(fieldSet.readString( "Tableau_UC" ));
        workItem.setGetwell_UC(fieldSet.readString( "Getwell_UC" ));
        workItem.setGotoMeeting_UC(fieldSet.readString( "GotoMeeting_UC" ));
        workItem.setSNOW_UC(fieldSet.readString( "SNOW_UC" ));
        workItem.setAD_OPER(fieldSet.readString( "AD_OPER" ));
        workItem.setExchange_OPER(fieldSet.readString( "Exchange_OPER" ));
        workItem.setLync_OPER(fieldSet.readString( "Lync_OPER" ));
        workItem.setBox_OPER(fieldSet.readString( "Box_OPER" ));
        workItem.setShareDrive_OPER(fieldSet.readString( "ShareDrive_OPER" ));
        workItem.setShareMailbox_OPER(fieldSet.readString( "ShareMailbox_OPER" ));
        workItem.setEPIC_OPER(fieldSet.readString( "EPIC_OPER" ));
        workItem.setCerner_OPER(fieldSet.readString( "Cerner_OPER" ));
        workItem.setKronos_OPER(fieldSet.readString( "Kronos_OPER" ));
        workItem.setAccessHR_OPER(fieldSet.readString( "AccessHR_OPER" ));
        workItem.setFSCM_OPER(fieldSet.readString( "FSCM_OPER" ));
        workItem.setOnBase_OPER(fieldSet.readString( "OnBase_OPER" ));
        workItem.setMDPortal_OPER(fieldSet.readString( "MDPortal_OPER" ));
        workItem.setHaiku_OPER(fieldSet.readString( "Haiku_OPER" ));
        workItem.setVoalte_OPER(fieldSet.readString( "Voalte_OPER" ));
        workItem.setGRASP_OPER(fieldSet.readString( "GRASP_OPER" ));
        workItem.setPassport_OPER(fieldSet.readString( "Passport_OPER" ));
        workItem.setPayor_OPER(fieldSet.readString( "Payor_OPER" ));
        workItem.setAnalytics_OPER(fieldSet.readString( "Analytics_OPER" ));
        workItem.setFundsFlow_OPER(fieldSet.readString( "FundsFlow_OPER" ));
        workItem.setLane_OPER(fieldSet.readString( "Lane_OPER" ));
        workItem.setFANSOS_OPER(fieldSet.readString( "FANSOS_OPER" ));
        workItem.setZirmed_OPER(fieldSet.readString( "Zirmed_OPER" ));
        workItem.setEmdeon_OPER(fieldSet.readString( "Emdeon_OPER" ));
        workItem.setLogMeIn_OPER(fieldSet.readString( "LogMeIn_OPER" ));
        workItem.setResQ_OPER(fieldSet.readString( "ResQ_OPER" ));
        workItem.setVersusRTLS_OPER(fieldSet.readString( "VersusRTLS_OPER" ));
        workItem.setMeditech_OPER(fieldSet.readString( "Meditech_OPER" ));
        workItem.setMCCM_OPER(fieldSet.readString( "MCCM_OPER" ));
        workItem.setExercisePro_OPER(fieldSet.readString( "ExercisePro_OPER" ));
        workItem.setiCares_OPER(fieldSet.readString( "iCares_OPER" ));
        workItem.setConnexall_OPER(fieldSet.readString( "Connexall_OPER" ));
        workItem.setVocera_OPER(fieldSet.readString( "Vocera_OPER" ));
        workItem.setMyChild_OPER(fieldSet.readString( "MyChild_OPER" ));
        workItem.setQualtrics_OPER(fieldSet.readString( "Qualtrics_OPER" ));
        workItem.setSyngo_OPER(fieldSet.readString( "Syngo_OPER" ));
        workItem.setTeamsite_OPER(fieldSet.readString( "Teamsite_OPER" ));
        workItem.setWordpress_OPER(fieldSet.readString( "Wordpress_OPER" ));
        workItem.setServer_OPER(fieldSet.readString( "Server_OPER" ));
        workItem.setTrackCore_OPER(fieldSet.readString( "TrackCore_OPER" ));
        workItem.setVHI_OPER(fieldSet.readString( "VHI_OPER" ));
        workItem.setSharePoint_OPER(fieldSet.readString( "SharePoint_OPER" ));
        workItem.setTSI_OPER(fieldSet.readString( "TSI_OPER" ));
        workItem.setEPSi_OPER(fieldSet.readString( "EPSi_OPER" ));
        workItem.setTableau_OPER(fieldSet.readString( "Tableau_OPER" ));
        workItem.setGetwell_OPER(fieldSet.readString( "Getwell_OPER" ));
        workItem.setGotoMeeting_OPER(fieldSet.readString( "GotoMeeting_OPER" ));
        workItem.setSNOW_OPER(fieldSet.readString( "SNOW_OPER" ));

        return workItem;
    }
}
