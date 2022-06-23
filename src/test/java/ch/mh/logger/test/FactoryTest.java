package ch.mh.logger.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ch.mh.logger.log.ILog;
import ch.mh.logger.log.LogEnum;
import ch.mh.logger.log.LogFactory;

public class FactoryTest {

	@Test
	public void test() {
		ILog systemLog = LogFactory.createLog(LogEnum.SYSTEMOUT);
		systemLog.logMessage("Factory log message test!");
		assertEquals(1, systemLog.getMessageCount());
	}

}
