package in.sb.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sb.main.entity.User1;
import in.sb.main.repository.userRepository;

@Service
public class ServicesImpl implements UserServices {
  
	@Autowired
	private userRepository userRepo;
	
	@Override
	public boolean userRegister(User1 user) {
		try {
			userRepo.save(user);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		
	
	}

	@Override
	public User1 userLogin(String email, String password) {
		User1 user=userRepo.findByEmail(email);
		if(user!=null && user.getPassword().equals(password)) {
			return user;
		}else {
		return null;
		}
	}

}
