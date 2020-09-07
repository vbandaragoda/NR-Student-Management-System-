
package lk.ijse.nrsms.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import lk.ijse.nrsms.DB.DBConnection;
import lk.ijse.nrsms.model.Exam;


public class ExamController {

    public boolean SaveExam(Exam e1) throws SQLException, ClassNotFoundException {
        
        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement stm = conn.prepareStatement("INSERT INTO ExamDetails values(?,?,?,?)");
        
        stm.setString(1, e1.getEDID());
        stm.setString(2, e1.getSID());
        stm.setString(3, e1.getEID());
        stm.setString(4, e1.getMarks());
        
        return stm.executeUpdate()>0;
    }

    public Exam getExam(String requestEDID) throws SQLException, ClassNotFoundException {
        Connection conn = DBConnection.getInstance().getConnection();
        ResultSet set = conn.prepareStatement("SELECT * FROM ExamDetails WHERE EDID=+'"+requestEDID+"'").executeQuery();
        
        if(set.next()){return new Exam(
                set.getString(1),
                set.getString(2),
                set.getString(3),
                set.getString(4)
        
        );
        }
    return null;
    }   

        public Exam getExam1(String requestSID) throws SQLException, ClassNotFoundException {
        Connection conn = DBConnection.getInstance().getConnection();
        ResultSet set = conn.prepareStatement("SELECT * FROM ExamDetails WHERE SID=+'"+requestSID+"'").executeQuery();
        
        if(set.next()){return new Exam(
                set.getString(1),
                set.getString(2),
                set.getString(3),
                set.getString(4)
        
        );
        }
    return null;
    } 
        
    public boolean updateState(Exam e1) throws SQLException, ClassNotFoundException {
        
        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement stm = conn.prepareStatement("UPDATE ExamDetails SET SID=?,EID=?,Marks=? WHERE EID=?,SID=?");
        
        
        stm.setString(1, e1.getSID());
        stm.setString(2, e1.getEID());
        stm.setString(3, e1.getMarks());
        stm.setString(4, e1.getEDID());
        
        
        return stm.executeUpdate()>0;
    }

    public boolean dropAttendence(String requestEDID) throws SQLException, ClassNotFoundException {
        Connection conn = DBConnection.getInstance().getConnection();
       return conn.prepareStatement("DELETE FROM ExamDetails WHERE EDID =+'"+requestEDID+"'").executeUpdate()>0;
    }
}
