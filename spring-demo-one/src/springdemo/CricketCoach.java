package springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;

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

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Inside email setter method");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("Inside team setter method");
		this.team = team;
	}
	

}
