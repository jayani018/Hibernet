package lk.ijse.gdse.hibernet.util;
import lk.ijse.gdse.hibernet.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.model.naming.ImplicitNamingStrategy;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;




public class SessionFactoryConfiguration {
    private SessionFactory sessionFactory;
    private static SessionFactoryConfiguration factoryConfiguration;
    public static SessionFactoryConfiguration getInstance(){
        return (null== factoryConfiguration)
                ?factoryConfiguration = new SessionFactoryConfiguration()
                :factoryConfiguration;
    }


    public Session getSession(){
        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
        Metadata metadata = new MetadataSources(new StandardServiceRegistryBuilder().configure().build()).addAnnotatedClass(Customer.class)
                .getMetadataBuilder().applyImplicitNamingStrategy
                       (ImplicitNamingStrategyJpaCompliantImpl.INSTANCE).build();


        SessionFactory sessionFactory =  new MetadataSources(new StandardServiceRegistryBuilder().configure().build()).addAnnotatedClass(Customer.class)
                .getMetadataBuilder().applyImplicitNamingStrategy
                        (ImplicitNamingStrategyJpaCompliantImpl.INSTANCE).build().getSessionFactoryBuilder().build();
        Session session = sessionFactory.openSession();
        return sessionFactory.openSession();
    }

}
