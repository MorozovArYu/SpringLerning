package com.gmail.morozowau.hibernate.lesson18;

import com.gmail.morozowau.hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CruidTest {
    public static void main(String[] args) {
        SessionFactory factory =
                new Configuration()
                        .configure()
                        .addAnnotatedClass(Employee.class)
                        .buildSessionFactory(); // Создаем фабрику сессий одну на проект
        try{
            Session currentSession = factory.getCurrentSession();
            currentSession.beginTransaction();

/*            Employee emp = currentSession.get(Employee.class,1);
            emp.setSalary(1500);*/

            currentSession
                    .createQuery("UPDATE Employee SET salary = 1000 WHERE name = 'Elena'")
                    .executeUpdate();

            currentSession.getTransaction().commit();

        }finally {
            factory.close(); // Закрываем фабрику
        }
    }
}
