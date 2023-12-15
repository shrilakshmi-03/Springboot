package example.firstcurd.curdfirst.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.firstcurd.curdfirst.repository.empRepository;
import example.firstcurd.curdfirst.user.UserEmp;


@Service
public class EmpService{

	@Autowired
	private empRepository emprepository;

	public UserEmp saveUserEmp(int empId, UserEmp useremp) {
		return emprepository.save(useremp);
	}

	public UserEmp getUserEmpById(int empId) {
		//Optional<UserEmp> optional = emprepository.findById(id);
		return emprepository.findById(empId).orElse(null);
	}

public String deleteEmpById(int empId) {
	emprepository.deleteById(empId);
	return "Employee Removed" + empId;
}

public UserEmp updateUserEmpById(int empId, UserEmp useremp) {
	UserEmp emp = emprepository.findById(empId).get();
     emp.setEmpName(useremp.getEmpName());
     emp.setEmpId(useremp.getEmpId());
     return emprepository.save(emp);
}

public UserEmp saveUserEmp(UserEmp useremp) {
return emprepository.save(useremp);
	
}

}


