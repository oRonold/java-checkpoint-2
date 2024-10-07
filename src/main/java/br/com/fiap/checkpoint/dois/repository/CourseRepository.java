package br.com.fiap.checkpoint.dois.repository;

import br.com.fiap.checkpoint.dois.model.subject.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
