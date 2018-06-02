package com.nia.services.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="QUESTION")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Question {
	
	@Id
	@Column(name = "question_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="question_desc")
	private String questionDesc;
	
	@OneToMany(
			cascade = CascadeType.ALL, 
			orphanRemoval = true,
			mappedBy="question"
    )
	private Set<QuestionOption> options = new HashSet<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getQuestionDesc() {
		return questionDesc;
	}

	public void setQuestionDesc(String questionDesc) {
		this.questionDesc = questionDesc;
	}

	public Set<QuestionOption> getOptions() {
		return options;
	}

	public void setOptions(Set<QuestionOption> options) {
		this.options = options;
	}

	
}
