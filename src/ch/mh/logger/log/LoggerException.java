package ch.mh.logger.log;

public class LoggerException extends RuntimeException {
	
	public LoggerException(String message, Throwable t) {
		super(message, t);
	}
}
