package singleton;

/*
 * @autor dimitri.leone
 * @since 16.05.2023
 */

public class LogManager {

	private static LogManager instance;
	
	private LogManager() {
		
	}
	
	public static LogManager getInstance() {
		if(instance == null) {
			instance = new LogManager();
		}
		return instance;
	}
	
	//demais métodos
}
