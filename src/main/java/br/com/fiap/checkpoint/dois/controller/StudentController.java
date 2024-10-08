package br.com.fiap.checkpoint.dois.controller;

import br.com.fiap.checkpoint.dois.model.student.CoursesList;
import br.com.fiap.checkpoint.dois.model.student.Student;
import br.com.fiap.checkpoint.dois.model.student.StudentStatus;
import br.com.fiap.checkpoint.dois.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("register")
    public String studentRegistrations(Student student, Model model){
        model.addAttribute("courses", CoursesList.values());
        return "students/student-enroll";
    }

    @PostMapping("register")
    @Transactional
    public String studentEnroll(@ModelAttribute Student student, RedirectAttributes redirectAttributes){
        studentService.registerStudent(student);
        redirectAttributes.addFlashAttribute("message", "Student enrolled!");
        return "redirect:/students/register";
    }

    @GetMapping("courses-list")
    public String coursesList(Model model){
        model.addAttribute("courses", CoursesList.values());
        return "students/courses-list";
    }

    @GetMapping("active-or-inactive")
    public String searchActiveOrInactiveStudents(){
        return "students/active-inactive-students";
    }

    @GetMapping("active")
    public String studentsActive(Model model){
        model.addAttribute("students", studentService.getAllStudentsActive());
        return "students/active-students";
    }

    @GetMapping("inactive")
    public String studentsInactive(Model model){
        model.addAttribute("students", studentService.getAllStudentsInactive());
        return "students/inactive-students";
    }

    @GetMapping("edit/{id}")
    public String edit(Model model, @PathVariable("id") Long id){
        model.addAttribute("courses", CoursesList.values());
        model.addAttribute("student", studentService.findStudentId(id));
        return "students/edit-student";
    }

    @PostMapping("edit")
    @Transactional
    public String editStudent(Student student, RedirectAttributes redirectAttributes){
        studentService.editStudent(student);
        redirectAttributes.addFlashAttribute("message", "Student edited!");
        if(student.getStudentStatus() == StudentStatus.ACTIVE){
            return "redirect:/students/active";
        } else {
            return "redirect:/students/inactive";
        }
    }

}
