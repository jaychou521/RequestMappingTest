package com.hemuyi.nice;




import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestAction {
     
   @RequestMapping("/user/login.do")  
   public ModelAndView login(String username,String password,HttpServletRequest request){
	   
	   if("admin".equals(username) && "admin".equals(password)){  
           request.setAttribute("username", username); 
           return new ModelAndView("/user/Success");  
       }  
       return new ModelAndView("/user/Error");
   }
}
