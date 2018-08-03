package com.kg.Library.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity
public class Book{
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bookId;

	@Column
	private String bookname;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "bookcatId", updatable = false, insertable = true)
	private Department department;

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

}