package com.hibernate.hibernatelesson.entity;

import jakarta.persistence.*;
import org.springframework.context.annotation.Configuration;

@Entity //обов'язкова анотація після якої звичайний java class перетворюється на entity class яка мапиться в базу данних
@Table(name="student")//необовязкова анотація (можна визнвчити ім'я таблиці)
public class Student {


    // Визначаю поля
    @Id //я не впевнений чи ця анотація є обовязковою деякі фреймворки навчилися самі визначати айді
    @GeneratedValue(strategy = GenerationType.IDENTITY)// по суті ця анотація не обов'язкова проте вона дозволяє всільнитися від потреби визначати айті в ручну і передає всю роботу самій sql де вона методом інкпементації призначає нові айдіхи новим записам
    @Column(name="id") //необовязкова анотація (мона визнвчити ім'я поля в sql таблиці)
    private int id;
    @Column(name="first_name") //необовязкова анотація (мона визнвчити ім'я поля в sql таблиці)
    private String name;
    @Column(name="last_name") //необовязкова анотація (мона визнвчити ім'я поля в sql таблиці)
    private String surname;
    private String email;

    // Визначаю Конструктори
    public Student() {

    }


    public Student(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    // Визначаю гетери/сетери

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Визначаю ту стрінг методи

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
