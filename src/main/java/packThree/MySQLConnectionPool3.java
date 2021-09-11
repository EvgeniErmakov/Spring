package packThree;

import org.springframework.stereotype.Component;

import java.sql.Connection;


@Component("pool")
public class MySQLConnectionPool3 implements ConnectionPool {

    @Override
    public void init() throws Exception {
        // stub
        System.out.println("void initPool3()");

    }

    @Override
    public void destroy() throws Exception {
        // stub
        System.out.println("void destroy()");

    }

    @Override
    public Connection take() throws Exception {
        // stub
        System.out.println("Connection take()");
        return null;
    }

    @Override
    public boolean bringBack(Connection con) throws Exception {
        // stub
        System.out.println("boolean bringBack(Connection con)");
        return false;
    }

}