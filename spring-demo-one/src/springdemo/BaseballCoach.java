package springdemo;

public class BaseballCoach implements Coach {
	
	// define a private field for the dependency
	private FortuneService fortuneService;
	
	// define a constructor for dependency injection
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDialyWorkout(){
		return "Spend 20min on batting prectice";
		
	}
	
	@Override
	public String getDailyFortune() {
		// use fortuneService to get a fortune
		return fortuneService.getFortune();
	}

}
	
