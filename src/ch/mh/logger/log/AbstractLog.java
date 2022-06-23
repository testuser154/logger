package ch.mh.logger.log;

/**
 * Abstract base class for logger implementations
 * @author mike
 */
public abstract class AbstractLog implements ILog {
	protected int messageCount = 0;

	@Override
	public int getMessageCount() {
		return messageCount;
	}

	/**
	 * log current message count to log of implementing logger
	 */
	@Override
	public void logMesssageCount() {
		logMessage(messageCount + " message(s) logged");
	}
}
