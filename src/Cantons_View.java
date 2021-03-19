import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Cantons_View {
	private Cantons_Model model;
	private Stage stage;

	//data fields labels
	public Label lblDataCapital = new Label();
	public Label lblDataName = new Label();

	
	protected TextField textShortForm;
	protected TextField textPopulation;
	protected TextField textArea;

	protected TextField textYear;
	protected TextField textLanguage;
	
		
	
	protected Cantons_View(Stage stage, Cantons_Model model) {
		this.stage = stage;
		this.model = model;
		
		stage.setTitle("Kantönli");
		//root
		BorderPane pane = new BorderPane();
		//right side vBox
		VBox vbox = new VBox();
		pane.setCenter(vbox);
		//list for showing cantons - getList in model
		ListView<String> list = new ListView<String>();
		list.setItems(model.getList());
		pane.setLeft(list);
		
		GridPane gpEnter = new GridPane();
		gpEnter.setId("dataEntry");
		//TODO - declare controls and organize layout
		gpEnter.add(new Label("Enter new data: "), 0, 0);
		
		gpEnter.add(new Label("Shortform of the Canton: "), 0, 2);
		gpEnter.add(textShortForm = new TextField(""), 1, 2);
		
		gpEnter.add(new Label("Population: "), 0, 3);
		gpEnter.add(textPopulation = new TextField(""), 1, 3);
		
		gpEnter.add(new Label("Area km2: "), 0, 4);
		gpEnter.add(textPopulation = new TextField(""), 1, 4);
		
		gpEnter.add(new Label("Year of Joining: "), 0, 5);
		gpEnter.add(textYear = new TextField(""), 1, 5);
		
		gpEnter.add(new Label("Language: "), 0, 6);
		gpEnter.add(textLanguage = new TextField(""), 1, 6);
		
		gpEnter.add(new Button("Submit new data"), 1, 7);
		
		GridPane gpControl = new GridPane();
		gpControl.setId("ControlArea");
		//TODO - declare controls and organize layout
		gpControl.add(new Label("Control Area"), 0, 0);
		gpControl.add(new Button("Update Cantons"), 0, 1);
		gpControl.add(new Button("Sort Cantons"), 0, 2);
		gpControl.add(new Button("Delete Canton"), 0, 3);
		
		GridPane gpCreate = new GridPane();
		gpCreate.setId("dataDisplay");
		//TODO - declare controls and organize layout
		gpCreate.add(new Label("Data display Area"), 0, 0);
		gpCreate.add(new Label("Flag: "), 0, 1);
		gpCreate.add(new Label("Name: "), 0, 2);
		gpCreate.add(new Label("Shortform: "), 0, 3);
		gpCreate.add(new Label("Capital: "), 0, 4);
		gpCreate.add(new Label("Population: "), 0, 5);
		gpCreate.add(new Label("Area km2: "), 0, 6);
		gpCreate.add(new Label("Year of joining: "), 0, 7);
		gpCreate.add(new Label("Language: "), 0, 8);
		
		
		//add right side of view - just basic details
		vbox.getChildren().add(gpEnter);
		vbox.getChildren().add(gpControl);	
		vbox.getChildren().add(gpCreate);
		
		
		Scene scene = new Scene(pane);
		scene.getStylesheets().add(
				getClass().getResource("Validator.css").toExternalForm());        
        stage.setScene(scene);
		
	}
	

	public void start() {
		stage.show();
	}
	
	public Stage getStage() {
		return stage;
	}
				
	 
}
	




