package peaksoft.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "courses")
@Getter
@Setter
@NoArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String duration;

    private String description;

//    @ManyToOne(cascade = {CascadeType.REFRESH, CascadeType.DETACH, CascadeType.MERGE},fetch = FetchType.LAZY)
//    private Company company;
//
//    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "courses")
//    private List<Group> groups;
//
//    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "course")
//    private List<Instructor> instructor;
//
//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "course")
//    private List<Lesson> lessons;

}
