import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Cantons_View {
	
	private final Cantons_Model model;
	private Stage stage;
	
	protected Cantons_View(Stage stage, Cantons_Model model) {
		this.stage = stage;
		this.model = model;
		stage.setTitle("Kantönli");
		
		BorderPane pane = new BorderPane();
		
		VBox vbox = new VBox();
		
		pane.setCenter(vbox);
		
		
		
	}

	public void start() {
		
		stage.show();
		
	}

}
