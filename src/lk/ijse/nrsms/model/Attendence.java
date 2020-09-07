
package lk.ijse.nrsms.model;


public class Attendence {
    	private String AID;
	private String SID;
	private String ADate;
	private String AStatus;

    public Attendence() {
    }

    public Attendence(String AID, String SID, String ADate, String AStatus) {
        this.AID = AID;
        this.SID = SID;
        this.ADate = ADate;
        this.AStatus = AStatus;
    }


    /**
     * @return the AID
     */
    public String getAID() {
        return AID;
    }

    /**
     * @param AID the AID to set
     */
    public void setAID(String AID) {
        this.AID = AID;
    }

    /**
     * @return the SID
     */
    public String getSID() {
        return SID;
    }

    /**
     * @param SID the SID to set
     */
    public void setSID(String SID) {
        this.SID = SID;
    }

    /**
     * @return the ADate
     */
    public String getADate() {
        return ADate;
    }

    /**
     * @param ADate the ADate to set
     */
    public void setADate(String ADate) {
        this.ADate = ADate;
    }

    /**
     * @return the AStatus
     */
    public String getAStatus() {
        return AStatus;
    }

    /**
     * @param AStatus the AStatus to set
     */
    public void setAStatus(String AStatus) {
        this.AStatus = AStatus;
    }
    }

