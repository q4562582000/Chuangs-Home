package pract.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import pract.model.MemberBean;

@RestController
public class MemberController {
	
		@Autowired
		MemberBean memberBean;
		
//		@Autowired
//		MemberService memberService;
		
//	    @RequestMapping("/addMember")
//	    public String hello(){
//	    	memberBean = new MemberBean();
//	    	memberBean.setPassword("1234");
//	    	memberBean.setEmail("email@email.com");
//	    	memberBean.setPhone("22334455");
//	    	memberBean.setPosition("Manager");
//	    	memberService.addMember(memberBean);
//	        return "New Member added";
//	    }


}
