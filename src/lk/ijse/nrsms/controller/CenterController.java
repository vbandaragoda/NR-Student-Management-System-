
package lk.ijse.nrsms.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import lk.ijse.nrsms.DB.DBConnection;
import lk.ijse.nrsms.model.Center;


public class CenterController {

    public boolean saveCenter(Center c1) throws SQLException, ClassNotFoundException {
        
        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement stm = conn.prepareStatement("INSERT INTO Center VALUES(?,?,?)");
        
        stm.setString(1, c1.getCID());
        stm.setString(2, c1.getCenter());
        stm.setString(3, c1.getCDate());
        
        return stm.executeUpdate()>0;
                
    }

    public Center getCenter(String requestCID) throws SQLException, ClassNotFoundException {
       Connection conn = DBConnection.getInstance().getConnection();
       
        ResultSet set = conn.prepareStatement("SELECT * FROM Center WHERE CID = + '"+requestCID+"'").executeQuery();
    
        if(set.next()){
        return new Center(
                set.getString(1),
                set.getString(2),
                set.getString(3)
            );
        }
    return null;
    }

    public boolean dropCenter(String requestCID) throws SQLException, ClassNotFoundException {
        Connection conn = DBConnection.getInstance().getConnection();
        return conn.prepareStatement("DELETE FROM Center WHERE CID=+'"+requestCID+"'").executeUpdate()>0;
    }

    public boolean updateState(Center a1) throws SQLException, ClassNotFoundException {
        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement stm = conn.prepareStatement("UPDATE Center SET Center=?,CDay=? WHERE CID=?");
        
        
        
        stm.setString(1, a1.getCenter());
        stm.setString(2, a1.getCDate());
        stm.setString(3, a1.getCID());
        
        
        return stm.executeUpdate()>0;  
    }
}
