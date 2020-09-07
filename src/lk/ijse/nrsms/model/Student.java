
package lk.ijse.nrsms.model;


public class Student {
    	private String SID;
	private String Name;
	private String Address;
	private String School;
	private String TClass;
	private String TeleM;
	private String TeleH;

    public Student() {
    }

    public Student(String SID, String Name, String Address, String School, String TClass, String TeleM, String TeleH) {
        this.SID = SID;
        this.Name = Name;
        this.Address = Address;
        this.School = School;
        this.TClass = TClass;
        this.TeleM = TeleM;
        this.TeleH = TeleH;
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
     * @return the Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * @return the School
     */
    public String getSchool() {
        return School;
    }

    /**
     * @param School the School to set
     */
    public void setSchool(String School) {
        this.School = School;
    }

    /**
     * @return the TClass
     */
    public String getTClass() {
        return TClass;
    }

    /**
     * @param TClass the TClass to set
     */
    public void setTClass(String TClass) {
        this.TClass = TClass;
    }

    /**
     * @return the TeleM
     */
    public String getTeleM() {
        return TeleM;
    }

    /**
     * @param TeleM the TeleM to set
     */
    public void setTeleM(String TeleM) {
        this.TeleM = TeleM;
    }

    /**
     * @return the TeleH
     */
    public String getTeleH() {
        return TeleH;
    }

    /**
     * @param TeleH the TeleH to set
     */
    public void setTeleH(String TeleH) {
        this.TeleH = TeleH;
    }
}


