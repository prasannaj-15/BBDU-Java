package com.usecase;

import java.util.List;

import com.exception.StudentException;
import com.model.Student;

import Dao.StudentDao;
import Dao.StudentDaoImpl;

public class GetAllStudent {

	public static void main(String[] args) {
		
		StudentDao sdao = new StudentDaoImpl();
		
		try {
			
			List<Student> slist = sdao.getAllStudents();
			
			for(Student s : slist) {
				
				System.out.println(s);
				
			}
			
			
			
			
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
