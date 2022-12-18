package org.nlt.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.nlt.model.Persons;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class TestController2 implements Controller {
	//InternalResourceViewResolver
	//DispatcherServlet

	private ArrayList<Persons> personList=new ArrayList();
	
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		Map m=new HashMap();
		String name=req.getParameter("name");
		String age=req.getParameter("age");
		String phone=req.getParameter("phone");
		m.put("nameValue", name);
		m.put("ageValue", age);
		m.put("phoneValue", phone);
		String message="";
		if(name.isEmpty())
		{
			message="Please Enter Name";
		}
		
		else if(age.isEmpty())
		{
			message="Please Enter Age";
		}
		
		else if(phone.isEmpty())
		{
			message="Please Enter Phone No.";
		}
		else
		{
			Persons p1=new Persons();
			p1.setName(name);
			p1.setAge(Integer.parseInt(age));
			p1.setPhone(phone);
			personList.add(p1);
			
			message="Record Submited Successfully";
			
			m.put("nameValue", "");
			m.put("ageValue", "");
			m.put("phoneValue", "");
		}
		m.put("msg", message);
		m.put("personArrayList", personList);
		return new ModelAndView("index",m);
	}

}
