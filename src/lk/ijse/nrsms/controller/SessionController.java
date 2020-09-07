
package lk.ijse.nrsms.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import lk.ijse.nrsms.DB.DBConnection;
import lk.ijse.nrsms.model.Session;


public class SessionController {

    public boolean saveSession(Session s1) throws SQLException, ClassNotFoundException {
        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement stm = conn.prepareStatement("INSERT INTO Session VALUES(?,?,?,?,?)");
        
        stm.setString(1, s1.getSEID());
        stm.setString(2, s1.getName());
        stm.setString(3, s1.getSTime());
        stm.setString(4, s1.getDay());
        stm.setString(5, s1.getCenter());
        
        return stm.executeUpdate()>0;
    }

    public Session getSession(String requestSEID) throws SQLException, ClassNotFoundException {
      Connection conn = DBConnection.getInstance().getConnection();
        ResultSet set = conn.prepareStatement("SELECT * FROM Session WHERE SEID=+'"+requestSEID+"'").executeQuery();
      
        if(set.next()){
        return new Session(
                set.getString(1),
                set.getString(2),
                set.getString(3),
                set.getString(4),
                set.getString(5)
        );
        }
        return null;
    }
}
