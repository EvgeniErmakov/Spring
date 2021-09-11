package packTwo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = null;
        ConnectionPool cp = null;

        try {
            context = new ClassPathXmlApplicationContext("applicationContext2.xml");
            cp = context.getBean("pool", ConnectionPool.class);
            cp.init();
        } catch (Exception e) {
            System.out.println("Exception has been activated");
        } finally {
            if (context != null) {
                context.close();
            }
        }

    }
}
