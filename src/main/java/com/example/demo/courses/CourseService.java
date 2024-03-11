package com.example.demo.courses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    private List<Course> courses = new ArrayList<>(Arrays.asList(
        new Course(
            1,
            "Html Course For Beginners",
            "Html Course For Beginners "
        ),
        new Course(
            2,
            "Html Course For Beginners",
            "Html Course For Beginners "
        ),
        new Course(
            3,
            "Html Course For Beginners",
            "Html Course For Beginners "
        ),
        new Course(
            4,
            "Html Course For Beginners",
            "Html Course For Beginners "
        )
    ));

    public List<Course> getAllCourses(){
        return courses;
    }

    public Course getCourse(int id) {
        // return courses.get(id);
        return courses.stream().filter(item -> item.getId() == (id)).findFirst().get();
    }

    public void addCourse(Course course) {
        System.out.println(course);
        courses.add(course);
    }

    public static ResponseEntity<Void> postForEntity(Course newCashCard) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'postForEntity'");
    }

    
}
