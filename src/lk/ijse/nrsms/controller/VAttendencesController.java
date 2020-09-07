
package lk.ijse.nrsms.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import lk.ijse.nrsms.DB.DBConnection;
import lk.ijse.nrsms.model.Attendence;


public class VAttendencesController {

    public List<Attendence> getAllAttendences() throws SQLException, ClassNotFoundException {
        
        Connection conn = DBConnection.getInstance().getConnection();
        
        ResultSet set = conn.prepareStatement("SELECT * FROM Attendence").executeQuery();
        
       List<Attendence> tempList = new ArrayList();
       
       while(set.next()){
           tempList.add(new Attendence(
                   set.getString(1), 
                   set.getString(2), 
                   set.getString(3), 
                   set.getString(4)
           ));
       }
       return tempList;
    }
    
    
}
