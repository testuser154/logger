package ch.mh.logger.log;

import java.nio.file.Paths;

/**
 * Factory used to create instances of different log implementations
 * @author mike
 */
public class LogFactory {
	public static ILog createLog(LogEnum logType) {
		ILog result = null;
		
		switch (logType) {
		case SYSTEMOUT:
			result = new SystemLog();
			break;
		case FILE:
			result = new FileLog(Paths.get("C:\\temp\\log.txt"));
			break;
		}
		
		return result;
	}
}
