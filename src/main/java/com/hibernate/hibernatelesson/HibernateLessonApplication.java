package com.hibernate.hibernatelesson;

import com.hibernate.hibernatelesson.DAOs.StudentDAO;
import com.hibernate.hibernatelesson.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HibernateLessonApplication {

    public static void main(String[] args) {
        SpringApplication.run(HibernateLessonApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
     return runner ->{
        createStudent(studentDAO);
     };

    }

    private void createStudent(StudentDAO studentDAO) {

        // створюємо студента
        System.out.println("creating student...");
        Student student = new Student("Pasha-maks","Havryliuk","idi@nakhuj.io");
        // зберігаємо студєнта
        System.out.println("Saving student");
        studentDAO.save(student);
        //виводими студєнта
        System.out.println("There is our student!!!!" + student.getId());

    }
}
