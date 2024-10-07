package br.com.fiap.checkpoint.dois.repository;

import br.com.fiap.checkpoint.dois.model.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
