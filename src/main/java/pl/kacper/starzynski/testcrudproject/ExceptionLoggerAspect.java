package pl.kacper.starzynski.testcrudproject;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class ExceptionLoggerAspect {
    @Around("args(myParam) && @annotation(exceptionLogger)")
    public Object logException(ProceedingJoinPoint joinPoint, String myParam, ExceptionLogger exceptionLogger) throws Throwable {
        try {
            joinPoint.proceed();
        }
        catch (Exception e) {
            log.error(exceptionLogger.messageTemplate());
            log.error(myParam);
        }
        return joinPoint;
    }
}
