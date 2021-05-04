import com.roman.domain.A;
import com.roman.domain.B;
import com.roman.domain.C;
import com.roman.domain.E;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        A a = context.getBean("A", A.class);
        B b = context.getBean("B", B.class);
        C c = context.getBean("C", C.class);
        C c1 = context.getBean("C", C.class);
        E e = context.getBean("E", E.class);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c.getD());
        System.out.println(c1.getD());
        e.printClassName();
    }
}
