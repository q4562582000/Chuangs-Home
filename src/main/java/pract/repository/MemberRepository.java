package pract.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pract.model.MemberBean;

@Repository
public class MemberRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void addMember(MemberBean member){
		System.out.println("EXCUTE INSERT MEMBER");
	  jdbcTemplate.update("INSERT INTO member (PASSWORD, EMAIL, POSITION, PHONE) "
	  		+ "VALUES (?,?,?,?)",member.getPassword(), member.getEmail(),
	  		member.getPosition(),member.getPhone());
  }


}
