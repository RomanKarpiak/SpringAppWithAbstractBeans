import com.roman.domain.A;
import com.roman.domain.B;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        A a = context.getBean("A", A.class);
        B b = context.getBean("B",B.class);
        System.out.println(a);
        System.out.println(b);
    }
}
