package com.havryliuk.springemployeeserver.Entityes;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="employee")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Employee {
//визначаю поля
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;

}
