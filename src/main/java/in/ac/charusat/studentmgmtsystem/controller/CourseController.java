package in.ac.charusat.studentmgmtsystem.controller;

import in.ac.charusat.studentmgmtsystem.model.Course;
import in.ac.charusat.studentmgmtsystem.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="https://app-dummy123.herokuapp.com")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping("/listcourse")
    public List<Course> getAllcourse() {
        return courseRepository.findAll();
    }

    // Get the student information
    @GetMapping("/course/{id}")
    public Course getCourse(@PathVariable Integer id) {
        return courseRepository.findById(id).get();
    }

    // Delete the student
    @DeleteMapping("/course/{id}")
    public List<Course> deleteCourse(@PathVariable Integer id) {
        courseRepository.delete(courseRepository.findById(id).get());
        return courseRepository.findAll();
    }

    // Add new student
    @PostMapping("/course")
    public List<Course> addCourse(@RequestBody Course course) {
        courseRepository.save(course);
        return courseRepository.findAll();
    }

    // Update the student information
    @PutMapping("/course/{id}")
    public List<Course> updateCourse(@RequestBody Course course, @PathVariable Integer id) {
        Course courseObj = courseRepository.findById(id).get();
        courseObj.setTitle(course.getTitle());
        courseObj.setAddress(course.getAddress());
        courseRepository.save(courseObj);
        return courseRepository.findAll();
    }

}
