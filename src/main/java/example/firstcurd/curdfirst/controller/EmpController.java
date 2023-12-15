package example.firstcurd.curdfirst.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.firstcurd.curdfirst.service.EmpService;
import example.firstcurd.curdfirst.user.UserEmp;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/UserEmp")
public class EmpController {
	
	
//@PostMapping("/api/emp")
//	public UserEmp saveEmp(@RequestBody UserEmp useremp) {
//		return useremp;
//	}

	@Autowired
     private EmpService empservice;
	
	
	@PostMapping("/employee/emp")
public UserEmp saveEmp(@RequestBody UserEmp useremp) {
		return empservice.saveUserEmp(useremp);
}
	
	@GetMapping("/employee/{empid}")
	public UserEmp getUserById(@PathVariable("empid") int empId) {
		UserEmp useremp = empservice.getUserEmpById(empId);
		return useremp;
	}
	
	@PutMapping("/employee/{empid}")
    public UserEmp updateEmployee(@PathVariable("empid") int empId, @RequestBody UserEmp useremp) {
        return empservice.saveUserEmp(empId, useremp);
    }
	
	 @DeleteMapping("/employee/{empid}")
	    public String deleteEmployee(@PathVariable("empid") int empId) {
	        return empservice.deleteEmpById(empId);
	    }
}
