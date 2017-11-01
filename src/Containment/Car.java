package Containment;

public class Car
{
	private Tyre tyre;
	private Steering steering;
	private Engine engine;
	public Car()
	{
		tyre = new Tyre();
		steering = new Steering();
		engine = new Engine();
		System.out.println("Created a new Car");
	}

}