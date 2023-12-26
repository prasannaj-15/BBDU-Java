package Dao;

import java.util.List;

import com.exception.StudentException;
import com.model.Student;

public interface StudentDao {

	public String insertStudent(int roll,String name,int marks) throws StudentException;
	
	public String updateStudentMarks(int roll, int marks) throws StudentException;
	
	public List<Student> getAllStudents() throws StudentException;
	
	
}
