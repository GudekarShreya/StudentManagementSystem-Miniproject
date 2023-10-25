package com.jspiders.jdbc.operations;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		StudentJDBC jdbc = new StudentJDBC();
		
		boolean condition=true;
		
		while(condition) {
		
		System.out.println("---WELCOME TO STUDENT MANAGEMENT SYSTEM---");
		System.out.println("Enter 1 to add student.\nEnter 2 to remove student by Id.\nEnter 3 to update student details.\nEnter 4 to get all student info.\nEnter 5 to get info of student by id.\nEnter 6 to exit.");
		System.out.println("------------------------------------------");
		
		System.out.println("Enter your choice");
		int choice = scanner.nextInt();
		
		switch (choice) {
		case 1:
			Student student =  new Student();
			System.out.println("Enter student id-->");
			student.setId(scanner.nextInt());
			scanner.nextLine();
			System.out.println("Enter student name-->");
			student.setName(scanner.nextLine());
			System.out.println("Enter student email-->");
			student.setEmail(scanner.nextLine());
			System.out.println("Enter student age-->");
			student.setAge(scanner.nextInt());
			System.out.println("Enter student fees-->");
			student.setFees(scanner.nextDouble());
			jdbc.addStudent(student);
			break;
			
		case 2:
			System.out.println("Enter student id-->");
			jdbc.removeStudent(scanner.nextInt());
			break;

		case 3:
			System.out.println("Enter student id to update details-->");
			jdbc.updateStudent(scanner.nextInt(), scanner);
			break;
			
		case 4:
			ArrayList<Student> list = jdbc.getAllStudents();
			//System.out.println(list); -->IT WILL PRINT ALL STUDENT OBJECTS INSIDE ONE ARRAY
			
			for (Student s : list) {
				System.out.println(s);
			}
			break;
			
		case 5:
			System.out.println("Enter student id-->");
			Student s = jdbc.getStudentById(scanner.nextInt());
			System.out.println(s);
			break;
			
		case 6:
			System.out.println("Thank you..!!!");
			condition=false;
			break;
			
		default:
			System.out.println("Invalid choice... Please enter right choice.");
			break;
			
		}
		
		System.out.println();
	
	}
		scanner.close();
		
	}
}
