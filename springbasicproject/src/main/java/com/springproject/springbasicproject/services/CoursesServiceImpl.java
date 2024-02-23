package com.springproject.springbasicproject.services;

import com.springproject.springbasicproject.entities.Courses;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service             // this class works as service layer so, we have to define that using @Service
public class CoursesServiceImpl implements Services{
    List <Courses>list;

    // creting the constructor
    public CoursesServiceImpl(){
        // creating the list
        list = new ArrayList<>();
        list.add(new Courses(123,"JAVA core","This course is Awesome!"));
        list.add(new Courses(456,"CPP OOPS","This the Very Helpful Porject!"));
    }
    @Override
    public List<Courses> getCourses(){
        return  list;
    }

    @Override
    public Courses getCourse(long courseId){

        Courses c = null;
        // now to find that course on id we traverse whole list
        for(Courses course:list){
            if(course.getId()==courseId){
                c = course;
                break;
            }
        }
        return c;
    }

    @Override
    public Courses addCourse(Courses course){
        // to add the course we have to add in list
        list.add(course);
        return course;
    }
}
