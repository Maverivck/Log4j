import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class myTimerLogger {
    private static final Logger logger = LogManager.getLogger(myTimerLogger.class);

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            logger.debug(getDebugTime(i));
            Thread.sleep(1000);
        }

        for (int i = 0; i < 3; i++) {
            logger.info(getInfoTime(28 + i));
            Thread.sleep(60000);
        }

        for (int i = 0; i < 3; i++) {
            logger.error(getErrorTime(21 + i));
            Thread.sleep(3600000);
        }
    }

    private static String getDebugTime(int seconds) {
        return String.format("20:27:%02d", seconds);
    }

    private static String getInfoTime(int minutes) {
        return String.format("20:%02d:00", minutes);
    }

    private static String getErrorTime(int hours) {
        return String.format("%02d:00:00", hours);
    }
}
