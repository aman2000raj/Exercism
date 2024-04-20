import java.util.Locale;

public class LogLevels {
    
    public static String message(String logLine) {
        //throw new UnsupportedOperationException("Please implement the (static) LogLevels.message() method");
        return logLine.split(":")[1].trim();
    }

    public static String logLevel(String logLine) {
        //throw new UnsupportedOperationException("Please implement the (static) LogLevels.logLevel() method");
        return logLine.split(":")[0].replaceAll("(\\[|\\])", "").toLowerCase(Locale.ROOT);
    }

    public static String reformat(String logLine) {
        //throw new UnsupportedOperationException("Please implement the (static) LogLevels.reformat() method");
        return String.format("%s (%s)", message(logLine), logLevel(logLine));
    }
}
