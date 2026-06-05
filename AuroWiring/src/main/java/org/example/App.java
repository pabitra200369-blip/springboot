import org.example.entity.Car;
import org.example.entity.Engine;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("Config.xml");
        Engine eng =context.getBean("BMWengine", Engine.class);
        Car car=context.getBean("Car", Car.class);
        car.Selfstart();
    }
}