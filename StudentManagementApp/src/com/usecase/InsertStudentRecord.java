package com.usecase;

import java.util.Scanner;

import com.exception.StudentException;

import Dao.StudentDao;
import Dao.StudentDaoImpl;

public class InsertStudentRecord {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student roll no :");
		int roll = sc.nextInt();
		
		System.out.println("Enter Student name : ");
		String name = sc.next();
		
		System.out.println("Enter Student Marks");
		int mark = sc.nextInt();
		
		
		StudentDao sdao = new StudentDaoImpl();
		
		String res = "";
		try {
			res = sdao.insertStudent(roll, name, mark);
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(res);

	}

}
