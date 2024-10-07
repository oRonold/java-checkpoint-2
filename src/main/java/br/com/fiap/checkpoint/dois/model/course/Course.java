package br.com.fiap.checkpoint.dois.model.course;

import br.com.fiap.checkpoint.dois.model.student.Student;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "tb_java_course")

@Getter @Setter @NoArgsConstructor
public class Course {

    @Id
    @Column(name = "course_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_java_course")
    @SequenceGenerator(name = "sq_java_course", sequenceName = "sq_java_course", allocationSize = 1)
    private Long id;

    @Column(name = "course_nm", nullable = false)
    private String name;

    @Column(name = "course_dscp", nullable = false)
    private String description;

    @Column(name = "course_degree", nullable = false)
    private String degree;

    @Column(name = "course_price", nullable = false, precision = 7, scale = 2)
    private BigDecimal price;

    @Column(name = "course_hours", nullable = false)
    private Integer amountHours;

    @OneToMany(mappedBy = "course")
    private List<Student> students;

}
