package SpringAOP.AspectJXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import SpringAOP.AspectJAnnotation.Operation;

public class Test{
    public static void main(String[] args){
        System.out.println("AOP using XML annotation");
        ApplicationContext context = new ClassPathXmlApplicationContext("AOP_XML.xml");
        Operation e = (Operation) context.getBean("opBean");
        System.out.println("calling msg...");
        e.msg();
        System.out.println("calling m...");
        e.m();
        System.out.println("calling k...");
        e.k();
    }
}
