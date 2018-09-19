package com.meldmy.sample.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Arrays;

/**
 * @author Dmytro Melnychuk
 */
@Aspect
public class LoggerPrivateMethodAspect {

    @Before("execution(* com.meldmy.sample.some_logic.LogicUnderWeaving.logicUnderWeaving(..))")
    public void logBefore(JoinPoint joinPoint) {

        Signature signature = joinPoint.getSignature();
        System.out.printf("%1$sStart aspect logic%1$s", "------");
        System.out.println("Weaved method name: " + signature.getName());
        System.out.println("Weaved declaring type name: " + signature.getDeclaringTypeName());
        System.out.println("Weaved kind: " + joinPoint.getKind());
        System.out.println("Weaved args: " + Arrays.toString(joinPoint.getArgs()));
        System.out.println("Weaved getFileName: " + joinPoint.getSourceLocation().getFileName());
        System.out.println("Weaved getLine: " + joinPoint.getSourceLocation().getLine());
        System.out.println("Weaved getWithinType: " + joinPoint.getSourceLocation().getWithinType());
        System.out.println("Weaved target: " + joinPoint.getTarget());
        ;
        System.out.printf("%1$s Finish aspect logic %1$s", "------");
    }
}
