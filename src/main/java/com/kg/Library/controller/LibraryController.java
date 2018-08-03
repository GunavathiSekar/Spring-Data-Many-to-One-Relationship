package com.kg.Library.controller;

import java.util.List;
import com.kg.Library.model.Department;
import com.kg.Library.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/library")
public class LibraryController {
    @Autowired
    LibraryRepository libraryRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Department> find() {
        return libraryRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Department findOneDepartment(@PathVariable Long id) {
        return libraryRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Department addDepartment(@RequestBody Department department) {
        return libraryRepository.saveAndFlush(department);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Department updateDepartment(@RequestBody Department updateDepartment,@PathVariable Long id) {
        updateDepartment.setBookcatId(id);
    return libraryRepository.saveAndFlush(updateDepartment);
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteDepartment(@PathVariable Long id) {
        libraryRepository.delete(id);
    }

}