package br.com.fiap.checkpoint.dois.controller;

import br.com.fiap.checkpoint.dois.model.student.CoursesList;
import br.com.fiap.checkpoint.dois.model.student.Student;
import br.com.fiap.checkpoint.dois.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

}
