package am.nuaca.app.controller;

import am.nuaca.app.model.Student;
import am.nuaca.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Student save(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public Optional<Student> update(@PathVariable int id, @RequestBody Student student) {
        return studentService.updateStudent(student, id);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable int id) {
        studentService.deleteStudentById(id);
    }


}
