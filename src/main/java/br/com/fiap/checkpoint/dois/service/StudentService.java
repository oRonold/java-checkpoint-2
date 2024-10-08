package br.com.fiap.checkpoint.dois.service;

import br.com.fiap.checkpoint.dois.model.student.FormerStudent;
import br.com.fiap.checkpoint.dois.model.student.Student;
import br.com.fiap.checkpoint.dois.model.student.StudentStatus;
import br.com.fiap.checkpoint.dois.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student registerStudent(Student student) {
        student.setFormerStudent(FormerStudent.FRESHMAN);
        student.setStudentStatus(StudentStatus.ACTIVE);
        return studentRepository.save(student);
    }
}
