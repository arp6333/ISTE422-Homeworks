import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Wombat3 {
	final Logger logger = LoggerFactory.getLogger(Wombat3.class);
	Integer t;
	Integer oldT;
	String loc;
	String oldLoc;
	Integer p;
	Integer oldP;

	public void setPeople(Integer people) {
		if (people < 0) {
			logger.error("Number of people cannot be negative!");
		}
		else {
			oldP = p;
			p = people;
			logger.trace("Number of people set to " + p + ". Old number of people was " + oldP);
		}
	}

	public void setLocation(String location) {
		oldLoc = loc;
		loc = location;
		logger.trace("Location set to " + loc + ". Old location was " + oldLoc);
	}

	public void setTemperature(Integer temperature) {
		oldT = t;
		t = temperature;
		logger.debug("Temperature set to " + t + ". Old temperature was " + oldT);
		if (temperature.intValue() > 50) {
			logger.info("Temperature has risen above 50 degrees.");
		}
		if (temperature.intValue() > 75) {
			logger.warn("Temperature has risen above 75 degrees.");
		}
	}

	public static void main(String[] args) {
		Wombat3 kevin = new Wombat3();
		kevin.setTemperature(100);
		kevin.setTemperature(25);
		kevin.setLocation("New York");
		kevin.setLocation("Alaska");
		kevin.setPeople(3);
		kevin.setPeople(-1);
	}
}
