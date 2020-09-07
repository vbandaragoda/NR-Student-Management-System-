
package lk.ijse.nrsms.model;

public class Center {
    	private String CID;
	private String Center;
	private String CDate;

    public Center() {
    }

    public Center(String CID, String Center, String CDate) {
        this.CID = CID;
        this.Center = Center;
        this.CDate = CDate;
    }

    /**
     * @return the CID
     */
    public String getCID() {
        return CID;
    }

    /**
     * @param CID the CID to set
     */
    public void setCID(String CID) {
        this.CID = CID;
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

    /**
     * @return the CDate
     */
    public String getCDate() {
        return CDate;
    }

    /**
     * @param CDate the CDate to set
     */
    public void setCDate(String CDate) {
        this.CDate = CDate;
    }
    
    
}
