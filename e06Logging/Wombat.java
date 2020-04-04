import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Wombat {
	final Logger logger =
	LoggerFactory.getLogger(Wombat.class);
	Integer t;
	Integer oldT;
	public void setTemperature(Integer temperature) {
		oldT = t;
		t = temperature;
		logger.info("Temperature set to {}.
		Old temperature was {}.",
		t, oldT);
		if(temperature.intValue() > 50) {
			logger.info("Temperature has risen above 50 degrees.");
		}
	}
	public static void main(String[] args) {
		Wombat a = new Wombat();
		a.setTemperature(100);
		a.setTemperature(25);
	}
}
