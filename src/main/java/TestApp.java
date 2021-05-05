import com.roman.domain.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        A a = context.getBean("A", A.class);
        B b = context.getBean("B", B.class);
        C c = context.getBean("C", C.class);
        C c1 = context.getBean("C", C.class);
        E e = context.getBean("E", E.class);
        F f = context.getBean("F", F.class);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c.getD());
        System.out.println(c1.getD());
        System.out.println(c.getFriend("Вася"));
        e.printClassName();
        f.greeting();
        context.close();
    }
}