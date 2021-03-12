import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
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
		//root
		BorderPane pane = new BorderPane();
		VBox vbox = new VBox();
		pane.setCenter(vbox);
		//list for showing cantons - getList in model
		ListView<String> list = new ListView<String>();
		list.setItems(Cantons_Model.getList());
		
		pane.setLeft(list);
		
		
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		
	}

	public void start() {
		
		stage.show();
		
	}
	
	public Stage getStage() {
		return stage;
	}

}
