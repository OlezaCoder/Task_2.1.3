import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld worldBean1 = applicationContext.getBean("helloworld", HelloWorld.class);
        HelloWorld worldBean2 = applicationContext.getBean("helloworld", HelloWorld.class);
        Cat catBean1 = applicationContext.getBean("cat", Cat.class);
        Cat catBean2 = applicationContext.getBean("cat", Cat.class);

        System.out.println(worldBean1 == worldBean2);
        System.out.println(catBean1 == catBean2);
    }
}