package spring_application;

public class MyApp {

	public static void main(String[] args) {

		Coach theCoach = new TrackCoach();
		Coach theCoach2 = new BaseballCoach();
		System.out.println(theCoach.getDailyWorkout());

	}

}
