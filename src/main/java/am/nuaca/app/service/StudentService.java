package am.nuaca.app.service;

import am.nuaca.app.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    List<Student> getAllStudents();

    Student createStudent(Student student);

    Optional<Student> updateStudent (Student student, int id);

    void deleteStudentById(Integer id);

}
