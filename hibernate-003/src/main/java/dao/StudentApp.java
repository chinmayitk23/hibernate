package dao;
import entities.Student;
import utilities.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentApp {
    public static void main(String[] args) {
        // Get the Hibernate session
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        // Start a transaction
        Transaction transaction = session.beginTransaction();

        try {
            // Create a new student object
            Student student = new Student("Abhishek", 005);
            Student student1 = new Student("Rohith", 412);
            Student student2 = new Student("Pawan",70 );
            
            // Save the student to the database
            session.save(student);
            session.save(student1);
            session.save(student2);
            
            
            // Commit the transaction
            transaction.commit();
            System.out.println("Student saved successfully!");

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }

        // Shutdown Hibernate
        HibernateUtil.getSessionFactory().close();
    }
}