package assignment11.session4.assignment11_4;

public class HondaCity implements Car{
	private String engineType;
	private String engineCapacity;
	
	public HondaCity(String engineType, String engineCapacity) {
		super();
		this.engineType = engineType;
		this.engineCapacity = engineCapacity;
	}

	public void drive() {
		System.out.println("Driving HondaCity!!!");
		System.out.println("Engine Type is: "+engineType);
		System.out.println("Engine Capacity is: "+engineCapacity);
}
}
