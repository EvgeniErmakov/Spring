package packThree;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main3 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = null;
        ConnectionPool cp = null;

        try {
            context = new AnnotationConfigApplicationContext(forSpring.class);
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