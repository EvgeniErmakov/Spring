package packTwo;

import org.springframework.stereotype.Component;

import java.sql.Connection;

@Component("pool")
public class classOne implements ConnectionPool{
    @Override
    public void init() throws Exception {
        System.out.println("One!!!");
    }

    @Override
    public void destroy() throws Exception {

    }

    @Override
    public Connection take() throws Exception {
        return null;
    }

    @Override
    public boolean bringBack(Connection con) throws Exception {
        return false;
    }
}
