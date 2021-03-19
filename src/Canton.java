import javafx.scene.image.ImageView;

public class Canton {
	
	private int population;
	private int year;
	private CantonNames name;
	private Language language;
	private String shortform;
	private ImageView flag;
	
	
	public Canton(CantonNames name, int population, int year, Language language, String shortform, ImageView flag) {
		this.population = population;
		this.year = year;
		this.name = name;
		this.language = language;
		this.shortform = shortform;
		this.flag = flag;
	}
	
	
	public String toString() {
		return " " + this.name;
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
