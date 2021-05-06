import com.roman.domain.BeanF;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        BeanA beanA = context.getBean("BeanA", BeanA.class);
//        BeanB beanB = context.getBean("BeanB", BeanB.class);
//        BeanC beanC = context.getBean("BeanC", BeanC.class);
//        BeanC beanC1 = context.getBean("BeanC", BeanC.class);
//        BeanE beanE = context.getBean("BeanE", BeanE.class);
        BeanF beanF = context.getBean("BeanF", BeanF.class);
//        System.out.println(beanA);
//        System.out.println(beanB);
//        System.out.println(beanC.getBeanD());
//        System.out.println(beanC1.getBeanD());
//        System.out.println(beanC.getFriend("Вася"));
//        beanE.printClassName();
        beanF.greeting();
        context.close();
    }
}