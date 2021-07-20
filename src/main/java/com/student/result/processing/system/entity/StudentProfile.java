package com.student.result.processing.system.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admission_table")
public class StudentProfile implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name="student_id")
	private String studentId;
	@Column(name="student_name")
	private String studentName;
	private String course;
	@Column(name="course_level")
	private String courseLevel;
	@Column(name="date_of_birth")
	private String dateOfBirth;
	private String email;
	@Column(name="phone")
	private Integer phoneNumber;
	private String gender;
	private String address;
	@Column(name="course_start_date")
	private String courseStartDate;
	@Column(name="course_end_date")
	private String courseEndDate;
	@Column(name="date_of_issue")
	private String dateOfIssue;
	@Column(name="registration_date")
	private String registrationDate;
	@Column(name="update_time")
	private String updateTime;
	
	
	
	
	
	public StudentProfile(Long id, String studentId, String studentName, String course, String courseLevel,
			String dateOfBirth, String email, Integer phoneNumber, String gender, String address,
			String courseStartDate, String courseEndDate, String dateOfIssue, String registrationDate,
			String updateTime) {
		super();
		this.id = id;
		this.studentId = studentId;
		this.studentName = studentName;
		this.course = course;
		this.courseLevel = courseLevel;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.address = address;
		this.courseStartDate = courseStartDate;
		this.courseEndDate = courseEndDate;
		this.dateOfIssue = dateOfIssue;
		this.registrationDate = registrationDate;
		this.updateTime = updateTime;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getCourseLevel() {
		return courseLevel;
	}
	public void setCourseLevel(String courseLevel) {
		this.courseLevel = courseLevel;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCourseStartDate() {
		return courseStartDate;
	}
	public void setCourseStartDate(String courseStartDate) {
		this.courseStartDate = courseStartDate;
	}
	public String getCourseEndDate() {
		return courseEndDate;
	}
	public void setCourseEndDate(String courseEndDate) {
		this.courseEndDate = courseEndDate;
	}
	public String getDateOfIssue() {
		return dateOfIssue;
	}
	public void setDateOfIssue(String dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}
	public String getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	@Override
	public String toString() {
		return "StudentProfile [id=" + id + ", studentId=" + studentId + ", studentName=" + studentName + ", course="
				+ course + ", courseLevel=" + courseLevel + ", dateOfBirth=" + dateOfBirth + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", gender=" + gender + ", address=" + address + ", courseStartDate="
				+ courseStartDate + ", courseEndDate=" + courseEndDate + ", dateOfIssue=" + dateOfIssue
				+ ", registrationDate=" + registrationDate + ", updateTime=" + updateTime + "]";
	}
	
	
	
	}
