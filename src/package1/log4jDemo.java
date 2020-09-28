package package1;

import org.apache.logging.log4j.*;

public class log4jDemo {

	private static Logger log = LogManager.getLogger(log4jDemo.class.getClass());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.debug("This is a debug log message");
		log.debug("This is a debug log message");
		log.debug("This is a debug log message");
		log.debug("This is a debug log message");

		log.info("This is a info log message");
		log.info("This is a info log message");
		log.info("This is a info log message");
		log.info("This is a info log message");

		log.error("This is an error log message");
		log.error("This is an error log message");
		log.error("This is an error log message");
		log.error("This is an error log message");

		log.fatal("This is a fatal log message");
		log.fatal("This is a fatal log message");
		log.fatal("This is a fatal log message");
		log.fatal("This is a fatal log message");
		
		System.out.println("This is the demo for github");

	}

}
