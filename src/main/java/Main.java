import service.LaptopService;
import utils.HibernateUtil;

public class Main {
    public static void main(String[] args) {
        //HibernateUtil.getSessionFactory();
        LaptopService laptopService=new LaptopService();
        laptopService.save();

    }
}
