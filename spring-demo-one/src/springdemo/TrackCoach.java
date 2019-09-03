package springdemo;

public class TrackCoach implements Coach {

	// define a private field for the dependency
	private FortuneService fortuneService;

	// define a constructor for dependency injection
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDialyWorkout() {
		return "Run 5k";
	}

	@Override
	public String getDailyFortune() {
		// use fortuneService to get a fortune
		return "Just do it: " + fortuneService.getFortune();
	}

}
