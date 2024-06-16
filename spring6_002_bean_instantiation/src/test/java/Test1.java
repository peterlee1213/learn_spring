import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// import com.powernode.simplefactory.Weapon;
import com.powernode.factoryBean.Weapon;

public class Test1 {
    // @Test
    // public void testSimpleFactory() {
    // ApplicationContext applicationContext = new
    // ClassPathXmlApplicationContext("springFactory.xml");
    // Weapon bean = applicationContext.getBean("tankBean", Weapon.class);
    // bean.attack();
    // }

    @Test
    public void testFactoryMethod() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("factoryMethod.xml");
        Weapon bean = applicationContext.getBean("tankBean", Weapon.class);
        bean.attack();
    }
}
