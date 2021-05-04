import com.roman.domain.A;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        A a = context.getBean("A", A.class);
        System.out.println(a);
    }
}
