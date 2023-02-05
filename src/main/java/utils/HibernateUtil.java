package utils;



import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import productComputer.AllInOne;
import productComputer.Computer;
import productComputer.Desktop;
import productComputer.Laptop;
import productComputer.OEM.*;


public class HibernateUtil {
    private static SessionFactory sessionFactory=null;


    public static SessionFactory getSessionFactory() {
        try {

            Configuration configuration = new Configuration();
            configuration.addAnnotatedClass(AllInOne.class);
            configuration.addAnnotatedClass(Computer.class);
            configuration.addAnnotatedClass(Desktop.class);
            configuration.addAnnotatedClass(Laptop.class);
            configuration.addAnnotatedClass(Battery.class);
            configuration.addAnnotatedClass(CPU.class);
            configuration.addAnnotatedClass(GPU.class);
            configuration.addAnnotatedClass(HardDisk.class);
            configuration.addAnnotatedClass(MotherBoard.class);
            configuration.addAnnotatedClass(OperatingSystem.class);
            configuration.addAnnotatedClass(Ram.class);
            configuration.addAnnotatedClass(Screen.class);
            configuration.addAnnotatedClass(Speaker.class);
            configuration.addAnnotatedClass(KeyBoard.class);


            sessionFactory=configuration.configure("hibernate.cfg.xml").buildSessionFactory();
        } catch (Exception e){
            e.printStackTrace();
        }

        return sessionFactory;
    }


}
