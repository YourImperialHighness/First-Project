import javafx.scene.image.ImageView;

public class Canton {
	
	private int population;
	private int year;
	private CantonNames name;
	private Language language;
	private String shortform;
	private String flag;
	private int area;
	
	
	public Canton(CantonNames name, int population, int year, int area, Language language, String shortform, String f) {
		this.population = population;
		this.year = year;
		this.name = name;
		this.language = language;
		this.shortform = shortform;
		this.flag = f;
		this.area = area;
	}
	
	
	public String toString() {
		return " " + this.name;
	}
	
	//getters and setters
	public String getName() {
		return String.valueOf(this.name);
	}
	public void setName(String string) {
		this.name = CantonNames.valueOf(string);
	}
	public String getCapital(Canton canton) {
		return this.name.getCapital();
	}


	public int getPopulation() {
		// TODO Auto-generated method stub
		return this.population;
	}


	public int getYear() {
		// TODO Auto-generated method stub
		return this.year;
	}


	public int getArea() {
		// TODO Auto-generated method stub
		return this.area;
	}


	public String getShortform() {
		// TODO Auto-generated method stub
		return this.shortform;
	}


	public Language getLanguage() {
		// TODO Auto-generated method stub
		return this.language;
	}


	public void setPopulation(int i) {
		// TODO Auto-generated method stub
		 this.population = i;
	}


	public void setYear(int y) {
		// TODO Auto-generated method stub
		this.year = y;
	}


	public void setArea(int a) {
		// TODO Auto-generated method stub
		this.area = a;
	}


	public void setShortform(String string) {
		// TODO Auto-generated method stub
		this.shortform = string;
	}


	public void setLanguage(String text) {
		// TODO Auto-generated method stub
		this.language = Language.valueOf(text);
	}
	public String getFlag(){
		return this.flag;
	}


	

}
