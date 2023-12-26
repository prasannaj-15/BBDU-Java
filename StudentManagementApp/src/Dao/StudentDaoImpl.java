package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.exception.StudentException;
import com.model.Student;
import com.utility.DBUtil;

public class StudentDaoImpl implements StudentDao{

	@Override
	public String insertStudent(int roll, String name, int marks) throws StudentException {
		
		String message = "Record not inserted....";
		
		
		try(Connection conn = DBUtil.provideConnection()){
			
			// insert query
			
			PreparedStatement ps = conn.prepareStatement("insert into student values(?,?,?)");
			
			ps.setInt(1, roll);
			ps.setString(2, name);
			ps.setInt(3, marks);
			
			// DML
			
			int x = ps.executeUpdate();
			
			if(x > 0) {
				message = "Record inserted sucessfully...";
			}
			else
				throw new StudentException("Student record not inserted....");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		return message;
	}

	@Override
	public String updateStudentMarks(int roll, int marks) throws StudentException {
		
		String message = "Student marks not updated sucessfully....";
		
		
		try(Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("update student set marks = ? where roll = ?");
			
			ps.setInt(1, marks);
			ps.setInt(2, roll);
			
			// DML
			
			int x = ps.executeUpdate();
			
			if(x > 0)
				message = "Student marks updated sucessfully...";
			else
				throw new StudentException("Student marks not updated sucessfully....");
			
		} catch (SQLException e) {
				e.printStackTrace();
		}
		
		
		return message;
	}

	@Override
	public List<Student> getAllStudents() throws StudentException {
	
		List<Student> studentList = new ArrayList<Student>();
		
		
		try(Connection conn = DBUtil.provideConnection()){
			
			
			PreparedStatement ps= conn.prepareStatement("select * from student");
			
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()) {
				
				int roll = rs.getInt("roll");
				String name = rs.getString("name");
				int marks = rs.getInt("marks");
				
				Student s = new Student(roll,name,marks);
				
				studentList.add(s);
				
				
			}
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		if(studentList.size() == 0)
			throw new StudentException("There is no record found...");
		
		
		
		return studentList;
	}

}
