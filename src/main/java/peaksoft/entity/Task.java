package peaksoft.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

import static javax.persistence.CascadeType.*;

@Entity
@Table(name = "tasks")
@Getter
@Setter
@NoArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String taskTest;

    private LocalDate deadline;
//
//    @ManyToOne(cascade = {REFRESH, DETACH, MERGE},fetch = FetchType.LAZY)
//    private Lesson lesson;
}
