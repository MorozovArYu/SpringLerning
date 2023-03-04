package com.gmail.morozowau.hibernate.lesson18;

import com.gmail.morozowau.hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CruidTestDelete {
    public static void main(String[] args) {
        SessionFactory factory =
                new Configuration()
                        .configure()
                        .addAnnotatedClass(Employee.class)
                        .buildSessionFactory(); // Создаем фабрику сессий одну на проект
        try {
            Session currentSession = factory.getCurrentSession();
            currentSession.beginTransaction();

            /*Employee emp = currentSession.get(Employee.class,1);
            currentSession.delete(emp);*/

            currentSession
                    .createQuery("DELETE Employee WHERE name = 'Elena'")
                    .executeUpdate();


            currentSession.getTransaction().commit();

        } finally {
            factory.close(); // Закрываем фабрику
        }
    }
}
