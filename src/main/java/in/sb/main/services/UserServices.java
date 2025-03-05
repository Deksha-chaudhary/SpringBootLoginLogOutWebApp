package in.sb.main.services;

import in.sb.main.entity.User1;

public interface UserServices {
	public boolean userRegister(User1 user);
	public User1 userLogin(String email,String password);

}
