package com.springproject.springbasicproject.services;

import com.springproject.springbasicproject.entities.Courses;

import java.util.List;

public interface Services {
    public List<Courses> getCourses();

    public Courses getCourse(long courseId);

    public Courses addCourse(Courses course);
}
