package package2;


import org.apache.logging.log4j.*;

public class log4jDemo1 {
	
	private static Logger log = LogManager.getLogger(log4jDemo1.class.getClass());
	public static void main(String[] args) {
		log.debug("This is a debug log message1");
		log.debug("This is a debug log message1");
		log.debug("This is a debug log message1");
		log.debug("This is a debug log message1");

		log.info("This is a info log message1");
		log.info("This is a info log message1");
		log.info("This is a info log message1");
		log.info("This is a info log message1");

		log.error("This is an error log message1");
		log.error("This is an error log message1");
		log.error("This is an error log message1");
		log.error("This is an error log message1");

		log.fatal("This is a fatal log message1");
		log.fatal("This is a fatal log message1");
		log.fatal("This is a fatal log message1");
		log.fatal("This is a fatal log message1");

	}

}
