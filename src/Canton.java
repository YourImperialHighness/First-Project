
public class Canton {
	
	private int population;
	private int year;
	private CantonNames name;
	
	public Canton(CantonNames name, int population, int year) {
		this.population = population;
		this.year = year;
		this.name = name;
	}
	
	
	public String toString() {
		return this.name + ", " + this.population + " Einwohner, gegründet im Jahr: " + this.year;
	}
	
	public CantonNames getName() {
		return this.name;
	}
	public void setName(CantonNames name) {
		this.name = name;
	}

}
