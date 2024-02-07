package com.hibernate.hibernatelesson.DAOs;

import com.hibernate.hibernatelesson.entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
}
