package ch.mh.logger.test;

import static org.junit.Assert.*;

import java.nio.file.Paths;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import ch.mh.logger.log.FileLog;
import ch.mh.logger.log.ILog;
import ch.mh.logger.log.SystemLog;

/**
 * JUnit class to test logger implementations
 * @author mike
 */
public class LoggerTestJUnit {
	
	ArrayList<ILog> loggerList = null;
	
	@Before
	public void setUp() throws Exception {
		
		loggerList = new ArrayList<ILog>();
		
		ILog logSystem = new SystemLog();
		FileLog logFile = new FileLog(Paths.get("C:\\temp\\log.txt"));
		
		loggerList.add(logFile);
		loggerList.add(logSystem);
	}

	@Test
	public void testList() {
		assertNotNull(loggerList);
		assertTrue(loggerList.size() == 2);
	}
	
	@Test
	public void testMessageCount() {
		for (ILog l : loggerList) {
			l.logMessage("Hey there!");
			assertEquals(1, l.getMessageCount());
		}
	}
	
	@Test
	public void testFailed() {
		assertEquals(1, 2);
	}

}
