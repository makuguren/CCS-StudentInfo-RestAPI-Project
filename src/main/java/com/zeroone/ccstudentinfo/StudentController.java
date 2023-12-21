package com.zeroone.ccstudentinfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@CrossOrigin(origins = "http://localhost:8000") // Allow requests from this origin DJango Python
public class StudentController {

	@Autowired
	private StudentService studentService;

	// Save Details to the Database
	@PostMapping("/addStudent")
	public String postDetails(@RequestBody Student student) {
		studentService.saveDetails(student);
		return "POSTED";
	}

	// Fetch all Student Details from the Database
	@GetMapping("/getStudent")
	public List<Student> getDetails() {
		return studentService.getAllDetails();
	}

	// Fetch Student Details by ID from the Database
	@GetMapping("/getStudentById/{student_id}")
	public Student fetchDetailsById(@PathVariable String student_id) {
		return studentService.getStudentDetailsById(student_id);
	}

	// Update Details to the Database by ID
	@PutMapping("/updateStudent")
	public String updateStudentDetails(@RequestBody Student student) {
		studentService.updateDetail(student);
		return "Updated";
	}

	// Delete Student Details by ID
	@DeleteMapping("/deleteStudent/{student_id}")
	public String deletefunction(@PathVariable String student_id) {
		return studentService.deleteStudent(student_id);
	}
}