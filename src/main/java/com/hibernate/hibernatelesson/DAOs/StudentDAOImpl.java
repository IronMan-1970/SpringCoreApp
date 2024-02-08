package com.hibernate.hibernatelesson.DAOs;

import com.hibernate.hibernatelesson.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Repository // дозволяє спрінгу сканувати цей клас, такж додає підтримку для логерізації дждбс помилок
public class StudentDAOImpl implements StudentDAO{

    // визначаю ентіті менеджер
    private EntityManager entityManager;
    // виконую депенденсі інджекш з ентіті менеджером
    @Autowired//кажуть що ця анотація є опціональною допоки є лише один об'єк для депенденсі інджекшна не впевнений чому.
    public StudentDAOImpl (EntityManager entityManager)
    {
        this.entityManager = entityManager;
    }
    // реалізую сейв метод
    @Override
    @Transactional// кажуть що ця анотація є необхідною дя збереження змін  в таблицю поки поняття не маю чому і як воно працює
    public void save(Student student) {
        entityManager.persist(student);
    }

    @Override
    public Student findById(Integer id) {
       return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        // створити запит
        TypedQuery theQuery = entityManager.createQuery("FROM Student where name='Vasyl' or email like 'lokh%' order by name asc ", Student.class); // - це JPQL (JPA Query Language) - вона подібна до ск'юл запитів але звертатися треба аме до ентіті класу та його зімнних
//        TypedQuery theQuery = entityManager.createQuery("FROM Student where surname=:theData", Student.class); - можна вводити данні ззовнішнього джерела а не хардкодінгом
//        theQuery.setParameter("theData","Havryliuk");
        // повернути результат запиту
        return theQuery.getResultList();
    }
}