/**
 * Created by Baksu on 2015-08-20.
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class run {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");

        hellowordltest obj = (hellowordltest) context.getBean("helloBean");
        obj.printHello();
    }
}
