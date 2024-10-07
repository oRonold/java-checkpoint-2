package br.com.fiap.checkpoint.dois.model.subject;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

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

}
