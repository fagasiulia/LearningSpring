package springdemo;

public class FitnessCoach implements Coach {

	// define a private field for the dependency
	private FortuneService fortuneService;

	// define a constructor for dependency injection
	public FitnessCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDialyWorkout() {
		return "Do 20 burpees";
	}

	@Override
	public String getDailyFortune() {
		// use fortuneService to get a fortune
		return fortuneService.getFortune();
	}

}
