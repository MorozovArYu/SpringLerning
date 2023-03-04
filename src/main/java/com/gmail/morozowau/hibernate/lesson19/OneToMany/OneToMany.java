package com.gmail.morozowau.hibernate.lesson19.OneToMany;



import com.gmail.morozowau.hibernate.lesson19.OneToMany.entity.Department;
import com.gmail.morozowau.hibernate.lesson19.OneToMany.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToMany {
    public static void main(String[] args) {
        SessionFactory factory =
                new Configuration()
                        .configure()
                        .addAnnotatedClass(Employee.class)
                        .addAnnotatedClass(Department.class)
                        .buildSessionFactory(); // Создаем фабрику сессий одну на проект
        Session session = null;
        try {
            session = factory.getCurrentSession(); // Создаем сессию
            session.beginTransaction();

            // Example 1
            /*Department department = new Department(1000,"department", 100);
            Employee employee1 = new Employee("Artem", "Morozov", 280);
            Employee employee2 = new Employee("Dmitry", "Kidjev", 800);
            department.addEmployeeToDepartment(employee1);
            department.addEmployeeToDepartment(employee2);
            session.save(department);*/

            // Example 2
            /*Employee employee = session.get(Employee.class, 1);
            System.out.println(employee);
            System.out.println(employee.getDep());*/

            // Example 3 удаляется все по каскаду, необходимо поставить корректные каскады
            /*Employee employee = session.get(Employee.class, 3);
            session.delete(employee);*/


            session.getTransaction().commit();
            System.out.println("done");
        } finally {
            session.close();
            factory.close(); // Закрываем фабрику
        }
    }
}
