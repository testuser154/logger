package ch.mh.logger.log;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/**
 * Uses a file to log messages
 * @author mike
 */
public class FileLog extends AbstractLog {
	
	private Path targetPath = null;

	public FileLog(Path targetPath) {
		this.targetPath = targetPath;
	}
		
	@Override
	public void logMessage(String message) {
		
		if (targetPath == null) {
			throw new IllegalArgumentException("targetPath missing");
		}
		
		try {
			if (message != null) {
				File f = new File(targetPath.toString());
				if (!f.exists()) {
					f.createNewFile();
				} else {
					message = System.lineSeparator() + message;
				}
				
				Files.write(targetPath, message.getBytes(), StandardOpenOption.APPEND);
				messageCount++;
			}
			
		} catch (IOException e) {
			throw new LoggerException(e.getMessage(), e);
		}
	}
}
