import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public aspect MethodLogger {

    private final Logger modelLogger = LoggerFactory.getLogger("Model");
    private final Logger repoLogger = LoggerFactory.getLogger("Repo");
    private final Logger controllerLogger = LoggerFactory.getLogger("Controller");


    pointcut modelLog(): execution(public * *(..)) && within(org.aop.core.model.*);
    pointcut repoLog(): call(public * org.aop.core.repo.*.*(..));
    pointcut controllerLog(): execution(public * *(..)) && within(org.aop.core.controller.*);


    before(): modelLog() {
        modelLogger.info("Called: " + thisJoinPointStaticPart.getSignature());
    };

    after() returning (final Object o): modelLog() {
        modelLogger.info("Call " + thisJoinPointStaticPart.getSignature() + " returned normally: " + o);
    }

    after() throwing (final Exception e): modelLog() {
        modelLogger.info("Call " + thisJoinPointStaticPart.getSignature() + " threw exception: " + e.toString());
    }


    before(): repoLog() {
        repoLogger.info("Called: " + thisJoinPointStaticPart.getSignature());
    };

    after() returning (final Object o): repoLog() {
        repoLogger.info("Call " + thisJoinPointStaticPart.getSignature() + " returned normally: " + o);
    }

    after() throwing (final Exception e): repoLog() {
        repoLogger.info("Call " + thisJoinPointStaticPart.getSignature() + " threw exception: " + e.toString());
    }


    before(): controllerLog() {
        controllerLogger.info("Called: " + thisJoinPointStaticPart.getSignature());
    };

    after() returning (final Object o): controllerLog() {
        controllerLogger.info("Call " + thisJoinPointStaticPart.getSignature() + " returned normally: " + o);
    }

    after() throwing (final Exception e): controllerLog() {
        controllerLogger.info("Call " + thisJoinPointStaticPart.getSignature() + " threw exception: " + e.toString());
    }
}