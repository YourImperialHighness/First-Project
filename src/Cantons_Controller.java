import java.lang.ModuleLayer.Controller;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

public class Cantons_Controller {
	private Cantons_Model model;
	private Cantons_View view;
	
	
	
	
	protected Cantons_Controller(Cantons_Model model, Cantons_View view) {
		this.model = model;
		this.view = view;

		view.textYear.textProperty().addListener(
				// Parameters of any PropertyChangeListener
				(observable, oldValue, newValue) -> validateYear(newValue));
		
	
		
	}
		
	

	
	private void save(ActionEvent e) {
		//TODO
	}
	private void delete(ActionEvent e) {
		//TODO
	}
	private void updateView(Canton canton) {
		//TODO
	}
	
	
	
	private void validateYear (String newValue) {
		boolean valid = false;
		
		//test mit 1999
		
		if(view.textYear.getText() == "1999") {
			valid=true;
		} else valid = false;
		
		
		view.textYear.getStyleClass().remove("YearOk");
		view.textYear.getStyleClass().remove("YearNotOk");
		if (valid) {
			view.textYear.getStyleClass().add("YearOk");		
		} else {
			view.textYear.getStyleClass().add("YearNotOK");
		}
		
	}
	
	

}
