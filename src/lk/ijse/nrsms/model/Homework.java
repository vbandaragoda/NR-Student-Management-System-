
package lk.ijse.nrsms.model;


public class Homework {
    
    	private String HWID;
        private String HID;
	private String SID;
	private String Status;

    public Homework() {
    }

    public Homework(String HWID, String HID, String SID, String Status) {
        this.HWID = HWID;
        this.HID = HID;
        this.SID = SID;
        this.Status = Status;
    }

    /**
     * @return the HWID
     */
    public String getHWID() {
        return HWID;
    }

    /**
     * @param HWID the HWID to set
     */
    public void setHWID(String HWID) {
        this.HWID = HWID;
    }

    /**
     * @return the HID
     */
    public String getHID() {
        return HID;
    }

    /**
     * @param HID the HID to set
     */
    public void setHID(String HID) {
        this.HID = HID;
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
     * @return the Status
     */
    public String getStatus() {
        return Status;
    }

    /**
     * @param Status the Status to set
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

}
