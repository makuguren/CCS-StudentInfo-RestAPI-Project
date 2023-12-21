package com.zeroone.ccstudentinfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;
    
    //Save Details to the Database
    public Student saveDetails(Student student) {
        return studentRepo.save(student);
    }
    
    //Fetch all Student Details from the Database
    public List<Student> getAllDetails(){
        return studentRepo.findAll();
    }
    
    //Fetch Student Details by ID from the Database
    public Student getStudentDetailsById(String student_id){
        return studentRepo.findById(student_id).orElse(null);
    }
    
    //Update Details to the Database by ID
    public Student updateDetail(Student student) {
        Student updateStudent = studentRepo.findById(student.getStudent_id()).orElse(null);
        if (updateStudent != null){
              updateStudent.setStudent_name(student.getStudent_name());
              updateStudent.setCourse_section(student.getCourse_section());
              updateStudent.setStudent_email(student.getStudent_email());
            studentRepo.save(updateStudent);
            return updateStudent;
        }
        return null;
    }
    
    //Delete Student Details by ID
    public String deleteStudent(String student_id) {
        if(studentRepo.existsById(student_id)){
            studentRepo.deleteById(student_id);
            return "Deleted " + student_id;
        } else {
            return "ID Not There";
        }
    }
}