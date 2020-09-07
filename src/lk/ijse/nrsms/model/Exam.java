
package lk.ijse.nrsms.model;


public class Exam {
    
   	private String EDID;
        private String EID;
	private String SID;
	private String Marks;

    public Exam() {
    }

    public Exam(String EDID, String EID, String SID, String Marks) {
        this.EDID = EDID;
        this.EID = EID;
        this.SID = SID;
        this.Marks = Marks;
    }

    /**
     * @return the EDID
     */
    public String getEDID() {
        return EDID;
    }

    /**
     * @param EDID the EDID to set
     */
    public void setEDID(String EDID) {
        this.EDID = EDID;
    }

    /**
     * @return the EID
     */
    public String getEID() {
        return EID;
    }

    /**
     * @param EID the EID to set
     */
    public void setEID(String EID) {
        this.EID = EID;
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
     * @return the Marks
     */
    public String getMarks() {
        return Marks;
    }

    /**
     * @param Marks the Marks to set
     */
    public void setMarks(String Marks) {
        this.Marks = Marks;
    }
    
}
