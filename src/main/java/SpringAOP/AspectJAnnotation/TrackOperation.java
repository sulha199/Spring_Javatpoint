package SpringAOP.AspectJAnnotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.ProceedingJoinPoint;

@Aspect
public class TrackOperation{
    @Pointcut("execution(* Operation.*(..))")
    public void k(){}//pointcut name

    @Before("k()")//applying pointcut on before advice
    public void beforeadvice(JoinPoint jp)//it is advice (before advice)
    {
        System.out.println("beforeAdvice: additional before concern");
        //System.out.println("Method Signature: "  + jp.getSignature());
    }

    @After("k()")//applying pointcut on after advice
    public void afteradvice(JoinPoint jp)//it is advice (after advice)
    {
        System.out.println("afterAdvice: additional after concern");
        //System.out.println("Method Signature: "  + jp.getSignature());
    }

    @AfterReturning(
            pointcut = "execution(* Operation.*(..))",
            returning= "result")
    public void myadvice(JoinPoint jp,Object result)//it is advice (after returning advice)
    {
        System.out.println("afterReturning: additional concern after-returning");
        System.out.println("afterReturning: Method Signature: "  + jp.getSignature());
        System.out.println("afterReturning: Result in advice: "+result);
        System.out.println("afterReturning: end of after returning advice...");
    }

    @Pointcut("execution(* Operation.*(..))")
    public void abcPointcut(){}

    @Around("abcPointcut()")
    public Object aroundadvice(ProceedingJoinPoint pjp) throws Throwable
    {
        System.out.println("aroundAdvice: Additional around Concern Before calling actual method");
        Object obj=pjp.proceed();
        System.out.println("aroundAdvice: Additional around Concern After calling actual method");
        return obj;
    }
}
