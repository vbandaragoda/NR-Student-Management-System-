
package lk.ijse.nrsms.model;


public class Payment {
    
    	private String PID;
	private String SID;
	private String Month;
	private String PStatus;

    public Payment() {
    }

    public Payment(String PID, String SID, String Month, String PStatus) {
        this.PID = PID;
        this.SID = SID;
        this.Month = Month;
        this.PStatus = PStatus;
    }

    /**
     * @return the PID
     */
    public String getPID() {
        return PID;
    }

    /**
     * @param PID the PID to set
     */
    public void setPID(String PID) {
        this.PID = PID;
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
     * @return the Month
     */
    public String getMonth() {
        return Month;
    }

    /**
     * @param Month the Month to set
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    /**
     * @return the PStatus
     */
    public String getPStatus() {
        return PStatus;
    }

    /**
     * @param PStatus the PStatus to set
     */
    public void setPStatus(String PStatus) {
        this.PStatus = PStatus;
    }

   
    
}
