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
            Employee employee = new Employee("Victor","Ivanov", "sales", 670);
            session.beginTransaction(); // Начинаем транзакцию
            session.save(employee);
            session.getTransaction().commit(); // Подтверждаем транзакцию
            System.out.println("done");
            System.out.println(employee.getId());
        }finally {
            factory.close(); // Закрываем фабрику
        }
    }
}
