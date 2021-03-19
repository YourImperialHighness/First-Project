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
		
	
		

		view.textYear.textProperty().addListener((observable, oldValue, newValue) -> validateYear(newValue));
		view.textShortForm.textProperty().addListener((observable, oldValue, newValue) -> validateShortForm(newValue));
		view.textPopulation.textProperty().addListener((observable, oldValue, newValue) -> validatePopulation(newValue));
		view.textLanguage.textProperty().addListener((observable, oldValue, newValue) -> validateLanguage(newValue));

	}
		
	private void validateYear(String newValue) {
		boolean valid = false;
		
		int number = Integer.parseInt(newValue);
		
		if (number > 1291 && number < 2022 ) {
			valid = true;
		} else {
			valid = false;
		}

		view.textYear.getStyleClass().remove("YearNotOk");
		 view.textYear.getStyleClass().remove("YearOk");
		 if (valid) {
		 view.textYear.getStyleClass().add("YearOk");
		 } else {
		 view.textYear.getStyleClass().add("YearNotOk");
		 }
	}
	
	private void validateShortForm(String newValue) {
		boolean valid = false;
		
		
		if (newValue.length()==2 && isCapital(newValue)) {
			valid = true;
		} else {
			valid = false;
		}

		view.textShortForm.getStyleClass().remove("ShortFormNotOk");
		 view.textShortForm.getStyleClass().remove("ShortFormOk");
		 if (valid) {
		 view.textShortForm.getStyleClass().add("ShortFormOk");
		 } else {
		 view.textShortForm.getStyleClass().add("ShortFormNotOk");
		 }
	}
	
	private void validateLanguage(String newValue) {
		boolean valid = false;
		
		
		if (isAlpha(newValue)) {
			valid = true;
		} else {
			valid = false;
		}

		view.textLanguage.getStyleClass().remove("LanguageNotOk");
		 view.textLanguage.getStyleClass().remove("LanguageFormOk");
		 if (valid) {
		 view.textLanguage.getStyleClass().add("LanguageOk");
		 } else {
		 view.textLanguage.getStyleClass().add("LanguageNotOk");
		 }
	}
	
	private void validatePopulation(String newValue) {
		boolean valid = false;
		
		int number = Integer.parseInt(newValue);
		
		if (number >= 1 && istEineZahl(newValue) ) {
			valid = true;
		} else {
			valid = false;
		}

		view.textPopulation.getStyleClass().remove("PopulationNotOk");
		 view.textPopulation.getStyleClass().remove("PopulationOk");
		 if (valid) {
		 view.textPopulation.getStyleClass().add("PopulationOk");
		 } else {
		 view.textPopulation.getStyleClass().add("PopulationNotOk");
		 }
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
	

	
	
	//private void validateYear (String newValue) {
	//	boolean valid = false;
		
		//test mit 1999
		
	//	if(view.textYear.getText() == "1999") {
	//		valid=true;
			//	} else valid = false;
		
		
	//	view.textYear.getStyleClass().remove("YearOk");
	//	view.textYear.getStyleClass().remove("YearNotOk");
	//	if (valid) {
	//		view.textYear.getStyleClass().add("YearOk");		
	//	} else {
	//		view.textYear.getStyleClass().add("YearNotOK");

	public boolean istEineZahl(String eingabe) {
        //Prüfen ob 'eingabe' eine ganze Zahl ist. Wenn ein Zeichen keine Zahl ist, ist das Ergebnis 'false'.
        boolean zahl=true;
        char[] c;
        int i;
        
        eingabe=eingabe.trim();
        c=eingabe.toCharArray();
        
        for (i=0;i < eingabe.length();i++) {
            if (!Character.isDigit(c[i])) {
                zahl=false;
            }
        }
        return zahl;
    }

	public boolean isCapital(String text) {
		for (char c : text.toCharArray()) {

			// A - Z
			if (c >= 'A' && c <= 'Z')
				continue;


			return false;

		}
		return true;
	}
	
	public boolean isAlpha(String text) {
		for (char c : text.toCharArray()) {

			
			if (c == '-' || c == ',' || c == ' ')
				continue;

			// a - z
			if (c >= 'a' && c <= 'z')
				continue;

			// A - Z
			if (c >= 'A' && c <= 'Z')
				continue;

			// ö, ü, ä, ß
			if (c == 'ö' || c == 'ß' || c == 'ä' || c == 'ü')
				continue;

			return false;
		}
		return true;
	}


	
}
