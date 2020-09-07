
package lk.ijse.nrsms.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import lk.ijse.nrsms.DB.DBConnection;
import lk.ijse.nrsms.model.Center;


public class VCentersController {

    public List<Center> getAllCenters() throws SQLException, ClassNotFoundException {
        Connection conn = DBConnection.getInstance().getConnection();
        
        ResultSet set = conn.prepareStatement("SELECT * FROM Center").executeQuery();
        
        List<Center> tempList = new ArrayList();
        
        while(set.next()){
        
            tempList.add(new Center(
                    set.getString(1), 
                    set.getString(2), 
                    set.getString(3)
            ));
        }
    return tempList;
    }  
}
