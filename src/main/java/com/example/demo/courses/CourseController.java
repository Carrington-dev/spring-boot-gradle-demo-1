package com.example.demo.courses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/courses")
    public List<Course> getCourses(){
        return courseService.getAllCourses();
    }

    @GetMapping("/courses/{id}")
    public Course getCourse(@PathVariable int id){
        return courseService.getCourse(id);
    }


    @PostMapping("/courses")
    public Course addCourse(@PathVariable Course myCourse){
        System.out.println(myCourse);
        courseService.addCourse(myCourse);
        return courseService.getCourse(myCourse.getId());
    }
}
