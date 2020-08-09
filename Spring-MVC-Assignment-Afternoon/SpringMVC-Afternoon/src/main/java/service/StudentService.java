package service;

import java.util.ArrayList;
import java.util.List;

import models.Student;

public class StudentService 
{
	 static List<Student> ls=new ArrayList<Student>();
	
	public boolean addStudent(Student newStudent)
	{
		for(Student s: ls)
		{
			if(s.getId()==newStudent.getId())
			{
				return false;
			}
		}
		ls.add(newStudent);
		return true;
	}
	
	public boolean deleteStudent(Student newStudent)
	{
		for(Student s: ls)
		{
			if(s.getId()==newStudent.getId())
			{
				ls.remove(newStudent);
				return true;
			}
		}
		return false;
	}
	
	
	public boolean updateStudent(Student newStudent)
	{
		for(Student s: ls)
		{
			if(s.getId()==newStudent.getId())
			{
				ls.remove(s);
				ls.add(newStudent);
				return true;
			}
		}
		return false;
	}
	
	public List<Student> viewStudent()
	{
		return ls;
	}
}
