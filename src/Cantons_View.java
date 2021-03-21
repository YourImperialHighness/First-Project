import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Cantons_View {
	private Cantons_Model model;
	private Stage stage;

	// buttons
	Button btnUpdate = new Button("Update Cantons");
	Button btnSubmit = new Button("Submit new data");
	Button btnSave = new Button("Save to File");
	Button btnDelete = new Button("Delete Data");

	// data fields labels
	public Label lblDataCapital = new Label();
	public Label lblDataName = new Label();
	public Label lblDataPop = new Label();
	public Label lblDataYear = new Label();
	public Label lblDataArea = new Label();
	public Label lblDataShortform = new Label();
	public Label lblDataLang = new Label();
	public Label lblImageLink = new Label();

	protected TextField textShortForm;
	protected TextField textPopulation;
	protected TextField textArea;
	protected TextField textYear;
	protected CheckBox dt;
	protected CheckBox fr;
	protected CheckBox it;
	protected CheckBox rr;
	protected Label title1;
	protected Label title2;
	protected Label title3;
	protected Button deleteButton;
	protected Button updateButton;

	// String ImageInput = new String();
	Image image = new Image("schweiz.jpg");
	ImageView imageView = new ImageView(image);

	ListView<Canton> list = new ListView<Canton>();
	ComboBox<Language> comboBox = new ComboBox<Language>();

	protected Cantons_View(Stage stage, Cantons_Model model) {
		this.stage = stage;
		this.model = model;

		stage.setTitle("Kantönli");
		// root
		BorderPane pane = new BorderPane();
		pane.setStyle("-fx-background-color: BEIGE;");
		// center vBox
		VBox vbox = new VBox();
		// right side Save Button

		pane.setCenter(vbox);
		// list for showing cantons - getList in model

		list.setItems(model.getList());
		list.setStyle("-fx-background-color: yellow;");
		pane.setLeft(list);

		GridPane gpEnter = new GridPane();
		gpEnter.setStyle("-fx-background-color: BEIGE;");
		gpEnter.setVgap(1);
		gpEnter.setId("dataEntry");
		// TODO - declare controls and organize layout
		gpEnter.add(title1 = new Label("Create new Data"), 0, 0);
		gpEnter.add(new Label("Shortform of the Canton: "), 0, 2);
		gpEnter.add(textShortForm = new TextField(""), 1, 2);

		gpEnter.add(new Label("Population: "), 0, 3);
		gpEnter.add(textPopulation = new TextField(""), 1, 3);

		gpEnter.add(new Label("Year of Joining: "), 0, 4);
		gpEnter.add(textYear = new TextField(""), 1, 4);
		gpEnter.add(new Label("Area km2: "), 0, 5);
		gpEnter.add(textArea = new TextField(""), 1, 5);
		gpEnter.add(new Label("Language: "), 0, 6);
		gpEnter.add(comboBox, 1, 6);
		//populate combobox
		comboBox.setItems(model.getCombo());
		//gpEnter.add(dt = new CheckBox("Deutsch"), 1, 6);
		//gpEnter.add(fr = new CheckBox("Französisch"), 1, 7);
		//gpEnter.add(it = new CheckBox("Italienisch"), 1, 8);
		//gpEnter.add(rr = new CheckBox("Rätoromänisch"), 1, 9);
		gpEnter.add(new Label(""), 1, 10);
		gpEnter.add(btnSubmit, 1, 11);

		GridPane gpControl = new GridPane();
		gpControl.setStyle("-fx-background-color: BEIGE;");
		gpControl.setVgap(5);
		gpControl.setId("ControlArea");
		// TODO - declare controls and organize layout
		gpControl.add(title2 = new Label("Options"), 0, 0);

		gpControl.add(btnUpdate, 0, 1);

		gpControl.add(deleteButton = new Button("Delete Data"), 0, 2);
		gpControl.add(new Label(" "), 0, 4);

		gpControl.add(btnDelete, 0, 2);
		gpControl.add(btnSave, 0, 3);

		GridPane gpCreate = new GridPane();
		gpCreate.setStyle("-fx-background-color: BEIGE;");
		gpCreate.setVgap(4);
		gpCreate.setId("dataDisplay");
		// TODO - declare controls and organize layout
		gpCreate.add(title3 = new Label("Data Display"), 0, 0);

		// Datei abspeichern

		gpCreate.add(new Label("Name:\t\t"), 0, 2);
		gpCreate.add(lblDataName, 1, 2);
		gpCreate.add(new Label("Shortform:\t\t"), 0, 3);
		gpCreate.add(lblDataShortform, 1, 3);
		gpCreate.add(new Label("Capital:\t\t"), 0, 4);
		gpCreate.add(lblDataCapital, 1, 4);
		gpCreate.add(new Label("Population:\t\t"), 0, 5);
		gpCreate.add(lblDataPop, 1, 5);
		gpCreate.add(new Label("Year of joining:\t\t"), 0, 6);
		gpCreate.add(lblDataYear, 1, 6);
		gpCreate.add(new Label("Area km2:\t\t"), 0, 7);
		gpCreate.add(lblDataArea, 1, 7);
		gpCreate.add(new Label("Language:\t\t"), 0, 8);
		gpCreate.add(lblDataLang, 1, 8);
		gpCreate.add(new Label(" "), 0, 9);

		// add right side of view - just basic details
		HBox hbox = new HBox();
		hbox.getChildren().add(new Label("Flag:\t\t\t\t"));
		hbox.getChildren().add(imageView);

		vbox.getChildren().add(gpCreate);
		vbox.getChildren().add(hbox);
		vbox.getChildren().add(new Label(" "));
		vbox.getChildren().add(gpControl);
		vbox.getChildren().add(gpEnter);

		imageView.setFitHeight(60);
		imageView.setFitWidth(60);

		Scene scene = new Scene(pane);
		scene.getStylesheets().add(getClass().getResource("Validator.css").toExternalForm());

		stage.setScene(scene);

	}

	public void start() {
		stage.show();
	}

	public Stage getStage() {
		return stage;
	}

}
