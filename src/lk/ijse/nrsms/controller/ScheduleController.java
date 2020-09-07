
package lk.ijse.nrsms.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import lk.ijse.nrsms.DB.DBConnection;
import lk.ijse.nrsms.model.Schedule;


public class ScheduleController {

    public boolean saveSchedule(Schedule s1) throws SQLException, ClassNotFoundException {
        
        Connection conn = DBConnection.getInstance().getConnection();
        
        PreparedStatement stm = conn.prepareStatement("INSERT INTO Schedule VALUES(?,?,?,?,?)");
        
        stm.setString(1, s1.getSCHD());
        stm.setString(2, s1.getSCHID());
        stm.setString(3, s1.getSHDate());
        stm.setString(4, s1.getSHStart());
        stm.setString(5, s1.getSHEnd());
        
        return stm.executeUpdate()>0;
    }

    public Schedule getSchedule(String requestSCHD) throws SQLException, ClassNotFoundException {
        Connection conn = DBConnection.getInstance().getConnection();
        ResultSet set =  conn.prepareStatement("SELECT * FROM Schedule WHERE SCHD =+'"+requestSCHD+"'").executeQuery();

        if(set.next()){
        return new Schedule(
                set.getString(1),
                set.getString(2),
                set.getString(3),
                set.getString(4),
                set.getString(5)
        );
        }
        return null;
    }

    public boolean dropSchedule(String requestSCHD) throws SQLException, ClassNotFoundException {
        Connection conn = DBConnection.getInstance().getConnection();
        return conn.prepareStatement("DELETE FROM Schedule WHERE SCHD ='"+requestSCHD+"'").executeUpdate()>0;
        
    }
    
    
    
}
