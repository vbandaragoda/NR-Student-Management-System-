
package lk.ijse.nrsms.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class StudentDetailsController {

    public int getStudentCount() throws ClassNotFoundException, SQLException {
        //load the class
        Class.forName("com.mysql.jdbc.Driver");
        //create a connection
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nrsms","root","1234");
        //create sql quary
        String sql = "SELECT COUNT(*) FROM Student";
        //create prepared statement
        PreparedStatement stm = conn.prepareStatement(sql);
        //execute statement
        ResultSet rst = stm.executeQuery();
        
        if(rst.next()){
            return rst.getInt(1);
        }
        return 0;
        
    }
    
    
    
}
