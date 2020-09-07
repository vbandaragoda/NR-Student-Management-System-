
package lk.ijse.nrsms.controller;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import lk.ijse.nrsms.DB.DBConnection;
import lk.ijse.nrsms.model.Exam;


public class VExamsController {

    public List<Exam> getAllExams() throws SQLException, ClassNotFoundException {
        Connection conn = DBConnection.getInstance().getConnection();
        
        ResultSet set = conn.prepareStatement("SELECT * FROM ExamDetails").executeQuery();
        
        List<Exam> tempList = new ArrayList();
       while(set.next()){
           tempList.add(new Exam(
                   
                   set.getString(1),
                   set.getString(2),
                   set.getString(3),
                   set.getString(4)
           ));
       }
       return tempList;
    }  
}
