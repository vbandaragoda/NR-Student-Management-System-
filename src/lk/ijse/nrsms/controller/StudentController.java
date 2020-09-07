
package lk.ijse.nrsms.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import lk.ijse.nrsms.DB.DBConnection;
import lk.ijse.nrsms.model.Student;


public class StudentController {

    public boolean saveStudent(Student s1) throws SQLException, ClassNotFoundException {
        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement stm = conn.prepareStatement("INSERT INTO Student VALUES(?,?,?,?,?,?,?)");
        stm.setString(1, s1.getSID());
        stm.setString(2, s1.getName());
        stm.setString(3, s1.getAddress());
        stm.setString(4, s1.getSchool());
        stm.setString(5, s1.getTClass());
        stm.setString(6, s1.getTeleM());
        stm.setString(7, s1.getTeleH());
        
        return stm.executeUpdate()>0;
    }

    public Student getStudent(String requestSID) throws SQLException, ClassNotFoundException {
       Connection conn = DBConnection.getInstance().getConnection();
       
        ResultSet set = conn.prepareStatement("SELECT * FROM Student WHERE sid =+'"+requestSID+"'").executeQuery();
       
       if(set.next()){
       return new Student(
            set.getString(1),
            set.getString(2),
            set.getString(3),
            set.getString(4),
            set.getString(5),
            set.getString(6),
            set.getString(7)
       );  
       }
       return null;
    } 

    public boolean dropStudent(String requestSID) throws SQLException, ClassNotFoundException {
        Connection conn = DBConnection.getInstance().getConnection();
        return conn.prepareStatement("DELETE FROM Student WHERE SID =+'"+requestSID+"'").executeUpdate()>0;
    }

    public boolean updateState(Student s1) throws SQLException, ClassNotFoundException {
        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement stm = conn.prepareStatement("UPDATE Student SET Name=?,Address=?,School=?,Class=?,TeleM=?,TeleH=? WHERE SID=?");
        
        stm.setObject(1, s1.getName());
        stm.setObject(2, s1.getAddress());
        stm.setObject(3, s1.getSchool());
        stm.setObject(4, s1.getTClass());
        stm.setObject(5, s1.getTeleM());
        stm.setObject(6, s1.getTeleH());
        stm.setObject(7, s1.getSID());
        
        return stm.executeUpdate()>0;
}
}
