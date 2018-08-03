package com.kg.Library.repository;

import com.kg.Library.model.Department;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepository extends JpaRepository<Department,Long> {

	// Object addStudent(Student student3);

	// Object updateStudent(Student student1);
    
	
}