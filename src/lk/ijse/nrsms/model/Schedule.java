
package lk.ijse.nrsms.model;


public class Schedule {
    
    	private String SCHD;
        private String SCHID;
        private String SHDate;
	private String SHStart;
	private String SHEnd;

    public Schedule() {
    }

    public Schedule(String SCHD, String SCHID, String SHDate, String SHStart, String SHEnd) {
        this.SCHD = SCHD;
        this.SCHID = SCHID;
        this.SHDate = SHDate;
        this.SHStart = SHStart;
        this.SHEnd = SHEnd;
    }

    /**
     * @return the SCHD
     */
    public String getSCHD() {
        return SCHD;
    }

    /**
     * @param SCHD the SCHD to set
     */
    public void setSCHD(String SCHD) {
        this.SCHD = SCHD;
    }

    /**
     * @return the SCHID
     */
    public String getSCHID() {
        return SCHID;
    }

    /**
     * @param SCHID the SCHID to set
     */
    public void setSCHID(String SCHID) {
        this.SCHID = SCHID;
    }

    /**
     * @return the SHDate
     */
    public String getSHDate() {
        return SHDate;
    }

    /**
     * @param SHDate the SHDate to set
     */
    public void setSHDate(String SHDate) {
        this.SHDate = SHDate;
    }

    /**
     * @return the SHStart
     */
    public String getSHStart() {
        return SHStart;
    }

    /**
     * @param SHStart the SHStart to set
     */
    public void setSHStart(String SHStart) {
        this.SHStart = SHStart;
    }

    /**
     * @return the SHEnd
     */
    public String getSHEnd() {
        return SHEnd;
    }

    /**
     * @param SHEnd the SHEnd to set
     */
    public void setSHEnd(String SHEnd) {
        this.SHEnd = SHEnd;
    }

 
    
}
