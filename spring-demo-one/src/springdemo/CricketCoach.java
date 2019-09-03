package springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;

	// create a no-arg constructor
	public CricketCoach() {
		System.out.println("Inside no-arg constructor");
	}

	@Override
	public String getDialyWorkout() {
		return "Practice fast bowling";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	// create a setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside setter method");
		this.fortuneService = fortuneService;
	}

}
