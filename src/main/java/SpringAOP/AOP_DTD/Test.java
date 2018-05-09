package SpringAOP.AOP_DTD;

import SpringAOP.AOP_DTD.A;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class Test {
    public static void main(String[] args) {
        Resource r=new ClassPathResource("aopContext.xml");
        BeanFactory factory=new XmlBeanFactory(r);

        A a=factory.getBean("proxy",A.class);
        System.out.println("proxy class name: "+a.getClass().getName());
        a.m();
    }
}
