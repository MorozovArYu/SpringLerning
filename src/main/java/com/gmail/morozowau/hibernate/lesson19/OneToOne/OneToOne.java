package com.gmail.morozowau.hibernate.lesson19.OneToOne;


import com.gmail.morozowau.hibernate.lesson19.OneToOne.entity.Detail;
import com.gmail.morozowau.hibernate.lesson19.OneToOne.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToOne {
    public static void main(String[] args) {
        SessionFactory factory =
                new Configuration()
                        .configure()
                        .addAnnotatedClass(Employee.class)
                        .addAnnotatedClass(Detail.class)
                        .buildSessionFactory(); // Создаем фабрику сессий одну на проект
        Session session = null;
        try {
            session = factory.getCurrentSession(); // Создаем сессию
            session.beginTransaction();

            // Пример добавления работника с его деталями
            /*Employee employee = new Employee("Oleg", "Smirnov", "it", 10);
            Detail detail = new Detail("Moscow", "+79609363535", "OlegO@g.com");
            employee.setEmpDetail(detail);
            session.save(employee);*/

            Employee employee = session.get(Employee.class, 2);

            session.delete(employee);

            session.getTransaction().commit();
            System.out.println("done");
        } finally {
            session.close();
            factory.close(); // Закрываем фабрику
        }
    }
}
