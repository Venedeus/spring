package learning.java.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCamelSimpleApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
        applicationContext.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        applicationContext.stop();
    }
}
