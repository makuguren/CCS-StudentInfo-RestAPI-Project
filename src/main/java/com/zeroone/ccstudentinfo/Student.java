package com.zeroone.ccstudentinfo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "Student_DB")
@NoArgsConstructor
@AllArgsConstructor

public class Student {

	@Id
	@Column(name = "STUDENT_ID")
	public String student_id;

	@Column(name = "STUDENT_NAME")
	public String student_name;

	@Column(name = "COURSE_SECTION")
	public String course_section;

	@Column(name = "STUDENT_EMAIL")
	public String student_email;
	
	
	//Setter and Getter - No need to add this line in Netbeans IDE
	public String getStudent_id() {
		return student_id;
	}
	
	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}
	
	public String getStudent_name() {
		return student_name;
	}
	
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	
	public String getCourse_section() {
		return course_section;
	}
	
	public void setCourse_section(String course_section) {
		this.course_section = course_section;
	}
	
	public String getStudent_email() {
		return student_email;
	}
	
	public void setStudent_email(String student_email) {
		this.student_email = student_email;
	}
}