package net.chiovari.javarecipes.jpa2cert.utils;

import java.net.InetAddress;
import net.chiovari.javarecipes.jpa2cert.*;
import net.ttddyy.dsproxy.listener.ChainListener;
import net.ttddyy.dsproxy.listener.SLF4JLogLevel;
import net.ttddyy.dsproxy.listener.SLF4JQueryLoggingListener;
import net.ttddyy.dsproxy.support.ProxyDataSource;
import org.apache.derby.jdbc.ClientDataSource;
import org.eclipse.persistence.config.PersistenceUnitProperties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Properties;
import org.apache.derby.drda.NetworkServerControl;

public class JPATestUtils {
    
    public static EntityManager createEntityManager() {
        

        

        ClientDataSource dataSource = new ClientDataSource ();
        dataSource.setServerName ("localhost");
        dataSource.setPortNumber(1527);
        dataSource.setDatabaseName("memory:jpamemdb;create=true");
        dataSource.setDataSourceName("Jpa2CertDS");
        dataSource.setUser("App");
        dataSource.setPassword("App");

        //SLF4JQueryLoggingListener commonsQueryLoggingListener= new SLF4JQueryLoggingListener();
        //commonsQueryLoggingListener.setLogLevel(SLF4JLogLevel.INFO);

        // use ChainListener to execute multiple listeners
        //ChainListener chainListener = new ChainListener();
        //chainListener.addListener(commonsQueryLoggingListener);

        // craete proxy datasource
        //ProxyDataSource proxyDS = new ProxyDataSource();
        //proxyDS.setDataSource(dataSource);
        //proxyDS.setListener(chainListener);
        //proxyDS.setDataSourceName("Jpa2CertDS");


        Properties emfProps = new Properties();
        emfProps.put(PersistenceUnitProperties.NON_JTA_DATASOURCE, dataSource);
        emfProps.put(PersistenceUnitProperties.DDL_GENERATION, PersistenceUnitProperties.DROP_AND_CREATE);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Jpa2CertPU", emfProps);
        EntityManager em = emf.createEntityManager();
        return em;
    }
}
