package com.gmail.morozowau.hibernate.lesson17;

import com.gmail.morozowau.hibernate.entity.Employee;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class CruidTest {
    public static void main(String[] args) {
        SessionFactory factory =
                new Configuration()
                        .configure()
                        .addAnnotatedClass(Employee.class)
                        .buildSessionFactory(); // Создаем фабрику сессий одну на проект
        try{
            Session session = factory.getCurrentSession(); // Создаем сессию
            Employee employee = new Employee("Artem","Morozov", "it", 500);
            session.beginTransaction(); // Начинаем транзакцию
            session.save(employee);
            session.getTransaction().commit(); // Подтверждаем транзакцию
        }finally {
            factory.close(); // Закрываем фабрику
        }
    }
}
