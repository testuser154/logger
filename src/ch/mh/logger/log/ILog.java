package ch.mh.logger.log;

/**
 * Base interface for all logger implementations
 * @author mike
 */
public interface ILog {
	/**
	 * @param message The message to log
	 */
	void logMessage(String message);
	int getMessageCount();
	void logMesssageCount();
}
