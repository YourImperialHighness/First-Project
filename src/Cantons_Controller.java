import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

public class Cantons_Controller {
	final private Cantons_Model model;
	final private Cantons_View view;
	
	protected Cantons_Controller(Cantons_Model model, Cantons_View view) {
		this.model = model;
		this.view = view;

		view.textYear.textProperty().addListener(
				// Parameters of any PropertyChangeListener
				(observable, oldValue, newValue) -> validateYear(newValue));
	}
		
	public static ObservableList<String> getList() {
		
		ObservableList<String> items = FXCollections.<String>observableArrayList();
		Canton arr[] = new Canton[26];
		CantonNames enums[] = CantonNames.values();
		for (int i=0; i<26; i++) {
			Canton cantonli = new Canton(enums[i], 0, 0, Language.Deutsch , "x" );
			arr[i] = cantonli;
		}
		
			for(int i=0; i<26; i++) {
				Canton theCanton = arr[i];
				items.add(theCanton.getName());
			
		}return items;
		//for (CantonNames name : CantonNames.values()) {
			//items.add(name.name());
			//new Canton(name.name(), 0, 0, Language.Deutsch, "x");}
		//}return items;
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
		
		if(view.textYear.getText()=="1999") {
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
