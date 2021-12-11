package hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {

    private static SessionFactory sessionFactory =buildSessionFactory();

    private static SessionFactory  buildSessionFactory()
    {
        try {
            if(sessionFactory ==null || sessionFactory.isClosed())
            {
                Configuration conf = new Configuration();
                SessionFactory sessionFactory = conf.configure("hibernate.cfg.xml").buildSessionFactory();
                return sessionFactory;
            }
            return sessionFactory;
        }
        catch (Exception e)
        {
            System.out.println("Session factory oluşturulamadı"+e);
            throw  new ExceptionInInitializerError(e);
        }
    }
    public static  SessionFactory getSessionFactory()
    {
        return  sessionFactory;
    }
}
