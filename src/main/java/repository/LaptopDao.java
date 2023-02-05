package repository;

import org.hibernate.Session;
import productComputer.Laptop;
import utils.HibernateUtil;

public class LaptopDao {

    public void save(Laptop laptop){
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            session.beginTransaction();
            session.save(laptop);
            session.getTransaction().commit();
            System.out.println("Laptop Eklendi");
            session.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }


}
