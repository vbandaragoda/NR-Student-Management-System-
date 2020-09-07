
package lk.ijse.nrsms.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import lk.ijse.nrsms.DB.DBConnection;
import lk.ijse.nrsms.model.Homework;


public class HomeworkController {

    public boolean saveHomework(Homework h1) throws SQLException, ClassNotFoundException {
        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement stm = conn.prepareStatement("INSERT INTO Homework VALUES(?,?,?,?)");
        
        stm.setString(1, h1.getHWID());
        stm.setString(2, h1.getHID());
        stm.setString(3, h1.getSID());
        stm.setString(4, h1.getStatus());
        
        
        return stm.executeUpdate()>0;   
    }

    public Homework getHomework(String requestHWID) throws SQLException, ClassNotFoundException {
        Connection conn = DBConnection.getInstance().getConnection();
        ResultSet set = conn.prepareStatement("SELECT * FROM Homework WHERE HWID=+'"+requestHWID+"'").executeQuery();
        
        if(set.next()){
        return new Homework(
                set.getString(1),
                set.getString(2),
                set.getString(3),
                set.getString(4)
                
        );
        }
        return null;
    }   

    public boolean dropHomework(String requestHWID) throws SQLException, ClassNotFoundException {
        Connection conn = DBConnection.getInstance().getConnection();
        return conn.prepareStatement("DELETE FROM Homework WHERE HWID =+'"+requestHWID+"'").executeUpdate()>0;
    }

    public boolean updateState(Homework h1) throws SQLException, ClassNotFoundException {
       
        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement stm = conn.prepareStatement("UPDATE Homework SET HID=?,SID=?,Status=? WHERE HWID=?");
        
        
        stm.setString(1, h1.getHID());
        stm.setString(2, h1.getSID());
        stm.setString(3, h1.getStatus());
        stm.setString(4, h1.getHWID());
        
        return stm.executeUpdate()>0;  
    
    }  
}
