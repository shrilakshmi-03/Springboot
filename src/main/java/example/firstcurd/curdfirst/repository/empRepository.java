package example.firstcurd.curdfirst.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import example.firstcurd.curdfirst.user.UserEmp;
import jakarta.persistence.Id;



@Repository
public interface empRepository extends JpaRepository<UserEmp, Integer>{

	
}
