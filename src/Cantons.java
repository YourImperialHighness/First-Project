import javafx.application.Application;
import javafx.stage.Stage;

public class Cantons extends Application {
	private Kanton_Model model;
	private Kanton_View view;
	private Kanton_Controller controller;

	public static void main(String[] args) {
		launch();

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		model = new Kanton_Model ();
		view = new Kanton_View(primaryStage, model);
		controller = new Kanton_Controller(model, view);
		
		view.start();
		
		
		
		
		
		
		
		
	}
}
