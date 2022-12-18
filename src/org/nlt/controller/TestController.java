package org.nlt.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.jar.Attributes.Name;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

public class TestController implements Controller {
	//InternalResourceViewResolver
	//DispatcherServlet

	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		Map m=new HashMap();
		String name=req.getParameter("name");
		if(name.equals(""))
		{
			m.put("msg", "Please Enter Name");
		}
		
		else
		{
			m.put("msg", "Your Name is: "+name);
		}
		return new ModelAndView("index2",m);
	}

}
