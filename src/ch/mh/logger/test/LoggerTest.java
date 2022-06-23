package ch.mh.logger.test;

import java.nio.file.Paths;
import java.util.ArrayList;

import ch.mh.logger.log.AbstractLog;
import ch.mh.logger.log.FileLog;
import ch.mh.logger.log.ILog;
import ch.mh.logger.log.SystemLog;

/**
 * Class to test logger implementations in "old fashioned" way, without test cases
 * @author mike
 */
public class LoggerTest {

	public static void main(String[] args) {
				
		ILog logSystem = new SystemLog();
		ILog logFile = new FileLog(Paths.get("C:\\temp\\log.txt"));
		
		ArrayList<ILog> loggerList = new ArrayList<ILog>();
		
		loggerList.add(logFile);
		loggerList.add(logSystem);
		
		for (ILog l : loggerList) {
			l.logMessage("Hello Java!");
		}
		
		logSystem.logMessage("Hello again!");
		
		for (ILog l : loggerList) {
			l.logMesssageCount();
		}
		
	}

}
