package com.nia.services.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="EXAM")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Exam {

	@Id
	@Column(name = "EXAM_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "exam_description")
	private String examDescription;
	
	@Column(name = "exam_date")
	private Date examDate;
	
	@Column(name = "exam_name")
	private Date examName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getExamDescription() {
		return examDescription;
	}

	public void setExamDescription(String examDescription) {
		this.examDescription = examDescription;
	}

	public Date getExamDate() {
		return examDate;
	}

	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}

	public Date getExamName() {
		return examName;
	}

	public void setExamName(Date examName) {
		this.examName = examName;
	}
	
	
	
}
