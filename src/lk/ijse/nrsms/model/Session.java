
package lk.ijse.nrsms.model;


public class Session {
    
    	private String SEID;
	private String Name;
	private String STime;
	private String Day;
	private String Center;

    public Session() {
    }

    public Session(String SEID, String Name, String STime, String Day, String Center) {
        this.SEID = SEID;
        this.Name = Name;
        this.STime = STime;
        this.Day = Day;
        this.Center = Center;
    }

    /**
     * @return the SEID
     */
    public String getSEID() {
        return SEID;
    }

    /**
     * @param SEID the SEID to set
     */
    public void setSEID(String SEID) {
        this.SEID = SEID;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the STime
     */
    public String getSTime() {
        return STime;
    }

    /**
     * @param STime the STime to set
     */
    public void setSTime(String STime) {
        this.STime = STime;
    }

    /**
     * @return the Day
     */
    public String getDay() {
        return Day;
    }

    /**
     * @param Day the Day to set
     */
    public void setDay(String Day) {
        this.Day = Day;
    }

    /**
     * @return the Center
     */
    public String getCenter() {
        return Center;
    }

    /**
     * @param Center the Center to set
     */
    public void setCenter(String Center) {
        this.Center = Center;
    }
        
    
}
