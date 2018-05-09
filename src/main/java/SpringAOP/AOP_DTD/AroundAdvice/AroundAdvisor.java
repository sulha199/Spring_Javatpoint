package SpringAOP.AOP_DTD.AroundAdvice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvisor implements MethodInterceptor{

    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
        Object obj;
        System.out.println("additional concern before actual logic, from aroundAdvisor.");
        obj=mi.proceed();
        System.out.println("additional concern after actual logic, from aroundAdvisor");
        return obj;
    }

}
