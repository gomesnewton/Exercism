public class LogLine {
    private String logLevel;
    private String message;

    public LogLine(String logLine) {
        this.logLevel = logLine.substring(logLine.indexOf("[")+1, logLine.indexOf("]")).toUpperCase();
        this.message = logLine.substring(logLine.indexOf(" "), logLine.length()).trim();
    }

    public LogLevel getLogLevel() {

        switch (this.logLevel) {
            case "TRC":
                return LogLevel.TRACE;
            case "DBG":
                return LogLevel.DEBUG;
            case "INF":
                return LogLevel.INFO;
            case "WRN":
                return LogLevel.WARNING;
            case "ERR":
                return LogLevel.ERROR;
            case "FTL":
                return LogLevel.FATAL;
            default:
                return LogLevel.UNKNOWN;
        }
    }

    
    public String getOutputForShortLog() {
        return String.format("%d:%s", getLogLevel().getEncodedLevel(), this.message);
    }
}

