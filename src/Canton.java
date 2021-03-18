
public class Canton {
	
	private int population;
	private int year;
	private CantonNames name;
	private Language language;
	private String shortform;
	
	public Canton(CantonNames name, int population, int year, Language language, String shortform) {
		this.population = population;
		this.year = year;
		this.name = name;
		this.language = language;
		this.shortform = shortform;
	}
	
	
	public String toString() {
		return this.name + ", " + this.population + " Einwohner, gegründet im Jahr: " + this.year;
	}
	
	//getters and setters
	public String getName() {
		return String.valueOf(this.name);
	}
	public void setName(CantonNames name) {
		this.name = name;
	}
	public String getCapital(Canton canton) {
		return this.name.getCapital();
	}

}
