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

            // Example first
      /*      Employee employee = new Employee("Nikolay", "Ivanov", "it", 110);
            Detail detail = new Detail("New-York", "+76709513535", "Niko@g.com");
            employee.setEmpDetail(detail);
            detail.setEmployee(employee);

            session.save(employee);*/

            Detail detail = session.get(Detail.class, 3);
            session.delete(detail);
            System.out.println(detail.getEmployee());


            session.getTransaction().commit();
            System.out.println("done");
        } finally {
            session.close();
            factory.close(); // Закрываем фабрику
        }
    }
}
