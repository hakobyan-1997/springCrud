package am.nuaca.app.repository;

import am.nuaca.app.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository <Student, Integer> {
    @Override
    List<Student> findAll();


    @Override
    void deleteById(Integer integer);
}
