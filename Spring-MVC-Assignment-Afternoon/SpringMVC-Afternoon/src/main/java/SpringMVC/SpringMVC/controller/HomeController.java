package SpringMVC.SpringMVC.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import models.Student;
import service.StudentService;

@Controller
public class HomeController {

	@Autowired
	StudentService ss;
	
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("index");
	}

	@RequestMapping(value = "/back")
	public ModelAndView backRequest()
	{
		return new ModelAndView("index");
	}
	
	@RequestMapping(value = "/add" , method =RequestMethod.POST)
	public ModelAndView addStudent(@RequestParam("id") int id,@RequestParam("firstname") String firstname,@RequestParam("lastname") String lastname,@RequestParam("dept") String dept)
	{
		boolean flag=ss.addStudent(new Student(id,firstname,lastname,dept));
		if(flag)
		{
			return new ModelAndView("Success");
		}
			return new ModelAndView("error");
	}
	
	
	@RequestMapping(value = "/delete")
	public ModelAndView deleteStudent(@RequestParam("id") int id,@RequestParam("firstname") String firstname,@RequestParam("lastname") String lastname,@RequestParam("dept") String dept)
	{
		boolean flag=ss.deleteStudent(new Student(id,firstname,lastname,dept));
		if(flag)
		{
			return new ModelAndView("Success");
		}
     	return new ModelAndView("error");
	}
	
	@RequestMapping(value = "/view")
	public ModelAndView viewStudent()
	{
		ArrayList<Student> list= (ArrayList<Student>) ss.viewStudent();
		ModelAndView model = new ModelAndView("View");
		model.addObject("list", list);
		return model;
	}
	
	@RequestMapping(value = "/update")
	public ModelAndView updateStudent(@RequestParam("id") int id,@RequestParam("firstname") String firstname,@RequestParam("lastname") String lastname,@RequestParam("dept") String dept)
	{
		boolean flag=ss.updateStudent(new Student(id,firstname,lastname,dept));
		if(flag)
		{
			return new ModelAndView("Success");
		}
			return new ModelAndView("error");
	}
}
