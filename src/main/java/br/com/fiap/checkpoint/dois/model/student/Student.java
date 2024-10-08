package br.com.fiap.checkpoint.dois.model.student;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "tb_java_student")

@Getter @Setter @NoArgsConstructor
public class Student {

    @Id
    @Column(name = "student_cd")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_student")
    @SequenceGenerator(name = "sq_student", sequenceName = "sq_student", allocationSize = 1)
    private Long id;

    @Column(name = "student_name", nullable = false)
    private String name;

    @Column(name = "student_birth", nullable = false)
    private LocalDate birthdate;

    @Column(name = "student_id_card", nullable = false, unique = true, length = 10)
    private String identityNumber;

    @Column(name = "student_email", nullable = false, unique = true)
    private String email;

    @Column(name = "student_password", nullable = false)
    private String password;

    @Column(name = "student_phone", nullable = false, unique = true, length = 15)
    private String phone;

    @Column(name = "student_status", nullable = false)
    @Enumerated(EnumType.STRING)
    private StudentStatus studentStatus;

    @Column(name = "former_student", nullable = false)
    @Enumerated(EnumType.STRING)
    private FormerStudent formerStudent;

   @Column(name = "course_name", nullable = false)
   @Enumerated(EnumType.STRING)
    private CoursesList course;

}
