import java.util.List;

import javafx.event.ActionEvent;

public class Cantons_Controller {

	Cantons_Model model;
	Cantons_View view;
	
	public Cantons_Controller(Cantons_Model model, Cantons_View view) {
		this.model = model;
		this.view = view;
		
		//TODO - btns setOnAction
		
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
	
	private void validateYear (int newValue) {
		boolean valid = false;
		
		int validYear = 0;
		
		if (validYear <= 2021 && validYear > 1290) {
			valid = true;
		}
		
		view.textYear.getStyleClass().remove("YearOk");
		view.textYear.getStyleClass().remove("YearNotOk");
		if (valid) {
			view.textYear.getStyleClass().add("YearOk");		
		} else {
			view.textYear.getStyleClass().add("YearNotOK");
		}
		
	}

}
