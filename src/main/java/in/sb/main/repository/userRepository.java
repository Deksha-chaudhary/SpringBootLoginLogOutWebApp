package in.sb.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sb.main.entity.User1;

public interface userRepository extends JpaRepository<User1,Integer>{
User1 findByEmail(String email);
}
