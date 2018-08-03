package com.kg.Library.model;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import  java.util.List;

/**
 * Student
 */
@Entity
public class Department {  
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long bookcatId;
	
    @Column
    private String name;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
	@JoinColumn(name = "bookcatId")
    private List<Book> book;

    public Long getBookcatId() {
		return bookcatId;
	}

	public void setBookcatId(Long bookcatId) {
		this.bookcatId = bookcatId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}
    

}