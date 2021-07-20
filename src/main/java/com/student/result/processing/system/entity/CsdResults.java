package com.student.result.processing.system.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="csd_results_table")
public class CsdResults implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name="student_id")
	private String studentId;
	@Column(name="student_name")
	private String studentName;
	@Column(name="course_level")
	private String courseLevel;
	private String course;
	@Column(name="html_css")
	private Integer htmlCss;
	private Integer javascript;
	@Column(name="software_engineering")
	private Integer softwareEngineering;
	@Column(name="oracle_database")
	private Integer oracleDatabase;
	private Integer python;
	@Column(name="registration_date")
	private String registrationDate;
	@Column(name="update_time")
	private String updateTime;
	
	
	public CsdResults(Long id, String studentId, String studentName, String courseLevel, String course, Integer htmlCss,
			Integer javascript, Integer softwareEngineering, Integer oracleDatabase, Integer python,
			String registrationDate, String updateTime) {
		super();
		this.id = id;
		this.studentId = studentId;
		this.studentName = studentName;
		this.courseLevel = courseLevel;
		this.course = course;
		this.htmlCss = htmlCss;
		this.javascript = javascript;
		this.softwareEngineering = softwareEngineering;
		this.oracleDatabase = oracleDatabase;
		this.python = python;
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
	public String getCourseLevel() {
		return courseLevel;
	}
	public void setCourseLevel(String courseLevel) {
		this.courseLevel = courseLevel;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Integer getHtmlCss() {
		return htmlCss;
	}
	public void setHtmlCss(Integer htmlCss) {
		this.htmlCss = htmlCss;
	}
	public Integer getJavascript() {
		return javascript;
	}
	public void setJavascript(Integer javascript) {
		this.javascript = javascript;
	}
	public Integer getSoftwareEngineering() {
		return softwareEngineering;
	}
	public void setSoftwareEngineering(Integer softwareEngineering) {
		this.softwareEngineering = softwareEngineering;
	}
	public Integer getOracleDatabase() {
		return oracleDatabase;
	}
	public void setOracleDatabase(Integer oracleDatabase) {
		this.oracleDatabase = oracleDatabase;
	}
	public Integer getPython() {
		return python;
	}
	public void setPython(Integer python) {
		this.python = python;
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
		return "CsdResults [id=" + id + ", studentId=" + studentId + ", studentName=" + studentName + ", courseLevel="
				+ courseLevel + ", course=" + course + ", htmlCss=" + htmlCss + ", javascript=" + javascript
				+ ", softwareEngineering=" + softwareEngineering + ", oracleDatabase=" + oracleDatabase + ", python="
				+ python + ", registrationDate=" + registrationDate + ", updateTime=" + updateTime + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
