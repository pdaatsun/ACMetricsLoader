package org.sch.issecurity.iam.tools.ACMetricsLoader.model;

import java.sql.Date;

/**
 * Created by XiChen on 6/19/2017.
 */
public class ACMetrics {

    Date tranDate;
    int analystID;
    String SNOWID;
    int appID;
    int operationID;
    int numOfUsers;
    Date uploadDate;

    public ACMetrics(Date tranDate, int analystID, String SNOWID, int appID, int operationID, int numOfUsers, Date uploadDate) {
        this.tranDate = tranDate;
        this.analystID = analystID;
        this.SNOWID = SNOWID;
        this.appID = appID;
        this.operationID = operationID;
        this.numOfUsers = numOfUsers;
        this.uploadDate = uploadDate;
    }

    public Date getTranDate() {
        return tranDate;
    }

    public void setTranDate(Date tranDate) {
        this.tranDate = tranDate;
    }

    public int getAnalystID() {
        return analystID;
    }

    public void setAnalystID(int analystID) {
        this.analystID = analystID;
    }

    public String getSNOWID() {
        return SNOWID;
    }

    public void setSNOWID(String SNOWID) {
        this.SNOWID = SNOWID;
    }

    public int getAppID() {
        return appID;
    }

    public void setAppID(int appID) {
        this.appID = appID;
    }

    public int getOperationID() {
        return operationID;
    }

    public void setOperationID(int operationID) {
        this.operationID = operationID;
    }

    public int getNumOfUsers() {
        return numOfUsers;
    }

    public void setNumOfUsers(int numOfUsers) {
        this.numOfUsers = numOfUsers;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }


}
