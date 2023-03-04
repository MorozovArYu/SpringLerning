package com.gmail.morozowau.hibernate.lesson17;

import com.gmail.morozowau.hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CruidTestSelect {
    public static void main(String[] args) {
        SessionFactory factory =
                new Configuration()
                        .configure()
                        .addAnnotatedClass(Employee.class)
                        .buildSessionFactory(); // Создаем фабрику сессий одну на проект
        try {
            Session session = factory.getCurrentSession(); // Создаем сессию
            Employee employee = new Employee("Oleg", "Sidorov", "hr", 700);
            session.beginTransaction(); // Начинаем транзакцию
            session.save(employee);
            /*session.getTransaction().commit(); // Подтверждаем транзакцию и закрывает ее*/

            int id = employee.getId();
            /*Session currentSession = factory.getCurrentSession(); // Начинаем новую сессию*/
            /*currentSession.beginTransaction(); // Открываем сессию*/
            Employee emp = session.get(Employee.class, id); // Получаем по id сотрудника
            session.getTransaction().commit(); // Подтверждаем и закрываем транзакцию
            System.out.println("done");
            System.out.println(emp);
        } finally {
            factory.close(); // Закрываем фабрику
        }
    }
}
