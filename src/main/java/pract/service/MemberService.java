package pract.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import pract.model.MemberBean;

@Service
public class MemberService {

	@Autowired
	JdbcTemplate jdbcTemplate;
	public void addMember(MemberBean memberBean) {
		System.out.println("EXCUTE INSERT MEMBER");
		jdbcTemplate.update("INSERT INTO MEMBER(PASSWORD, EMAIL, POSITION, PHONE) VALUES (?,?,?,?)",
				memberBean.getPassword(), memberBean.getEmail(), memberBean.getPosition(),memberBean.getPhone());
	}
	
	
}
