package br.com.fiap.checkpoint.dois.repository;

import br.com.fiap.checkpoint.dois.model.student.Student;
import br.com.fiap.checkpoint.dois.model.student.StudentStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("select s from Student s where s.studentStatus = 'ACTIVE'")
    List<Student> findAllByStudentStatusActive();

    @Query("select s from Student s where s.studentStatus = 'INACTIVE'")
    List<Student> findAllByStudentStatusInactive();
}
