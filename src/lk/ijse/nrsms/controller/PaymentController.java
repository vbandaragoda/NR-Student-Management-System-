
package lk.ijse.nrsms.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import lk.ijse.nrsms.DB.DBConnection;
import lk.ijse.nrsms.model.Payment;


public class PaymentController {

    

    public boolean savePayment(Payment p1) throws SQLException, ClassNotFoundException {
        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement stm = conn.prepareStatement("INSERT INTO Payment VALUES(?,?,?,?)");
        
        stm.setString(1, p1.getPID());
        stm.setString(2, p1.getSID());
        stm.setString(3, p1.getMonth());
        stm.setString(4, p1.getPStatus());
        
        return stm.executeUpdate()>0;
    
    }

    public Payment getPayment(String requestPID) throws SQLException, ClassNotFoundException {
         Connection conn = DBConnection.getInstance().getConnection();
         ResultSet set = conn.prepareStatement("SELECT * FROM Payment WHERE PID =+ '"+requestPID+"'").executeQuery();
         
         if(set.next()){
         return new Payment(
                 set.getString(1),
                 set.getString(2),
                 set.getString(3),
                 set.getString(4)
         );
         }
         return null;
    }

    public boolean dropPayment(String requestPID) throws SQLException, ClassNotFoundException {
       Connection conn = DBConnection.getInstance().getConnection();
       return conn.prepareStatement("DELETE FROM Payment WHERE PID=+'"+requestPID+"'").executeUpdate()>0;
    }
}
