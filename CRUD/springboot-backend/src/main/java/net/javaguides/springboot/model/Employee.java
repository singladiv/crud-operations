package net.javaguides.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

//    @Column(name = "first_name")
//    private String firstName;

    @Column(name = "name")
    private String Name;

    @Column(name = "email_id")
    private String emailId;

    @Column(name = "Age")
    private String age;
}
