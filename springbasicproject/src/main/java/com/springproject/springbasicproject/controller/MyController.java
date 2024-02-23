package com.springproject.springbasicproject.controller;

import com.springproject.springbasicproject.entities.Courses;
import com.springproject.springbasicproject.services.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController          // we are creating the rest-api so we write RestController
// long form of REST = representational state transfer
public class MyController {

    // creating the object for services to access here
    @Autowired                        // mostly it is used for to create object of child class of interface
                                      // @Autowired is an annotation used in Spring Framework for automatic dependency injection.
    private Services service;        /// we can make this private or public

    @GetMapping("/home")              // @GetMapping is an annotation used in Spring Framework for defining HTTP GET requests handled by a controller method.
    public String home(){
        return "This is home page!";
    }

    @GetMapping("/courses")
    public List<Courses>getCourses(){
        return this.service.getCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Courses getCourse(@PathVariable String courseId){
        return this.service.getCourse(Long.parseLong(courseId));
    }

    // now we are adding the course int the data so here @PostMapping required
    @PostMapping("/courses")
    public Courses addCourse(@RequestBody Courses course){     // we require here the object of course so, RequestBody required
        return this.service.addCourse(course);
    }
}
