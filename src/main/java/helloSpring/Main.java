package helloSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
Hello World with Spring!
 */
public class Main {
    public static void main(String[] args) {
        // This would normally be a way to instantiate our object
        //Triangle triangle = new Triangle();

        // Example of using deprecated BeanFactory
        //Beanfactory beans = new XmlBeanFactory(new FileSystemResource("spring.xml"));

        // Using ApplicationContext - Spring Context (instead of BeanFactory)
        // Check spring.xml in resources for more details
        ApplicationContext beans = new ClassPathXmlApplicationContext("spring.xml");

        // We cast it into our object because what we get is an object
        Triangle triangle = (Triangle) beans.getBean("triangle");
        triangle.draw();

        Hexagon hexagon = (Hexagon) beans.getBean("hexagon");
        hexagon.draw();

        Circle circle = (Circle) beans.getBean("circle");
        circle.draw();

        System.out.println("Circle using Inner Beans");
        Circle circleInnerBean = (Circle) beans.getBean("circleInnerBean");
        circleInnerBean.draw();

        ((ClassPathXmlApplicationContext) beans).registerShutdownHook();



        // Starting a new configuration file
        System.out.println("\n\t New Configuration file :]");

        // Using lists - check springExtended.xml in resources
        ApplicationContext beansTwo = new ClassPathXmlApplicationContext("springExtended.xml");
        CircleWithCollections circleTwo = (CircleWithCollections) beansTwo.getBean("circle");
        circleTwo.draw();

        TriangleBeanAutowiring triangleAutowire = (TriangleBeanAutowiring) beansTwo.getBean("triangleAutoWiring");
        triangleAutowire.draw();
    }
}
