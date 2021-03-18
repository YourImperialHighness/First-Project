import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Cantons_View {
	
	private final Cantons_Model model;
	private Stage stage;
	//data fields labels
	public Label lblDataCapital = new Label();
	public Label lblDataName = new Label();

	
	protected TextField textYear;
	
	
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
		list.setItems(Cantons_Controller.getList());
		pane.setLeft(list);
		
		//add right side of view - just basic details
		vbox.getChildren().add(createDataEntryPane());
		vbox.getChildren().add(createControlPane());	
		vbox.getChildren().add(createDataDisplayPane());	
		
		//TODO - define controls used and buttons
		
		
		
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		
	}
	

	public void start() {
		
		stage.show();
		
	}
	
	public Stage getStage() {
		return stage;
	}
	
	private Pane createDataEntryPane() {
		GridPane pane = new GridPane();
		pane.setId("dataEntry");
		//TODO - declare controls and organize layout
		pane.add(new Label("Enter new data: "), 0, 0);
		pane.add(new Label("Shortform of the Canton: "), 0, 2);
		pane.add(new TextField(""), 1, 2);
		pane.add(new Label("Population: "), 0, 3);
		pane.add(new TextField(""), 1, 3);
		pane.add(new Label("Year of Joining: "), 0, 4);
		pane.add(new TextField(""), 1, 4);
		pane.add(new Label("Language : "), 0, 5);
		pane.add(new TextField(""), 1, 5);
		pane.add(new Button("Submit new data"), 1, 6);
		
		return pane;
	}
	private Pane createControlPane() {
		GridPane pane = new GridPane();
		pane.setId("ControlArea");
		//TODO - declare controls and organize layout
		pane.add(new Label("Control Area"), 0, 0);
		pane.add(new Button("Update Cantons"), 0, 1);
		pane.add(new Button("Sort Cantons"), 0, 2);
		pane.add(new Button("Delete Canton"), 0, 3);
		
		return pane;
	}
	private Pane createDataDisplayPane() {
		GridPane pane = new GridPane();
		pane.setId("dataDisplay");
		//TODO - declare controls and organize layout
		pane.add(new Label("Data display Area"), 0, 0);
		pane.add(new Label("Flag: "), 0, 1);
		pane.add(new Label("Name: "), 0, 2);
		pane.add(new Label("Shortform: "), 0, 3);
		pane.add(new Label("Capital: "), 0, 4);
		pane.add(new Label("Population: "), 0, 5);
		pane.add(new Label("Year of joining: "), 0, 6);
		pane.add(new Label("Language: "), 0, 7);
		
		return pane;
	}
	



}
