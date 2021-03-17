import javafx.application.Application;
import javafx.stage.Stage;

public class Cantons extends Application {
	private Cantons_Model model;
	private Cantons_View view;
	private Cantons_Controller controller;



	@Override
	public void start(Stage primaryStage) throws Exception {
		model = new Cantons_Model ();
		view = new Cantons_View(primaryStage, model);
		controller = new Cantons_Controller(model, view);
		
		view.start();
		
		
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		launch();

	}
}
