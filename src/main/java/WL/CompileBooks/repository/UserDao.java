package WL.CompileBooks.repository;

import org.springframework.beans.factory.annotation.Autowired;

import WL.CompileBooks.model.User;

public class UserDao {
	@Autowired
	private User user;
	
	public User getAdmin(){
		user.setName("admin");
		user.setPassword("123456");
		return user;
	}
}
