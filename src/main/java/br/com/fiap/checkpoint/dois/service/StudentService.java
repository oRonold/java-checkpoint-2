package br.com.fiap.checkpoint.dois.service;

import br.com.fiap.checkpoint.dois.model.student.FormerStudent;
import br.com.fiap.checkpoint.dois.model.student.Student;
import br.com.fiap.checkpoint.dois.model.student.StudentStatus;
import br.com.fiap.checkpoint.dois.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student registerStudent(Student student) {
        student.setFormerStudent(FormerStudent.FRESHMAN);
        student.setStudentStatus(StudentStatus.ACTIVE);
        return studentRepository.save(student);
    }

    public Optional<Student> findStudentId(Long id){
        return studentRepository.findById(id);
    }

    public List<Student> getAllStudentsActive() {
        return studentRepository.findAllByStudentStatusActive();
    }

    public List<Student> getAllStudentsInactive() {
        return studentRepository.findAllByStudentStatusInactive();
    }

    public void editStudent(Student student) {
        studentRepository.save(student);
    }

    public void removeStudent(Long id){
        var student = studentRepository.getReferenceById(id);
        student.setStudentStatus(StudentStatus.INACTIVE);
        student.setFormerStudent(FormerStudent.VETERAN);
        studentRepository.save(student);
    }

    public void delete(Long id){
        studentRepository.deleteById(id);
    }
}
