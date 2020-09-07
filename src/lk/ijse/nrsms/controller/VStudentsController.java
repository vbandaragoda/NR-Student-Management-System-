
package lk.ijse.nrsms.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import lk.ijse.nrsms.DB.DBConnection;
import lk.ijse.nrsms.model.Student;


public class VStudentsController {

    public List<Student> getAllStudents() throws SQLException, ClassNotFoundException {
        Connection conn = DBConnection.getInstance().getConnection();
        ResultSet set = conn.prepareStatement("SELECT * FROM Student").executeQuery();
        
        List <Student> tempList = new ArrayList();
        
        while(set.next()){
            tempList.add(new Student(
                    set.getString(1),
                    set.getString(2),
                    set.getString(3),
                    set.getString(4),
                    set.getString(5),
                    set.getString(6),
                    set.getString(7)
            ));
        }
        return tempList;
    }
    
    
    
}
