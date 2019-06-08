package am.nuaca.app.service;

import am.nuaca.app.model.Student;
import am.nuaca.app.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Optional<Student> updateStudent(Student student, int id) {
        Optional<Student> mystudent  = studentRepository.findById(id);
        student.setId(id);
        studentRepository.save(student);
        return mystudent;
    }

    @Override
    public void deleteStudentById(Integer id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student findStudent(String name) {
        return studentRepository.findByFname(name);
    }
}
