import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;

import com.sun.tools.javac.Main;

import javafx.event.ActionEvent;
import javafx.scene.image.Image;
import javafx.stage.FileChooser;

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
		view.textPopulation.textProperty()
				.addListener((observable, oldValue, newValue) -> validatePopulation(newValue));

		view.textArea.textProperty().addListener((observable, oldValue, newValue) -> validateArea(newValue));

		view.btnSubmit.setOnAction(this::submitData);
		view.btnUpdate.setOnAction(this::updateView);
		view.btnDelete.setOnAction(this::deleteData);
		view.btnSave.setOnAction(arg0 -> {
			try {
				saveFile(arg0);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});

	}

	private void validateYear(String newValue) {
		boolean valid = false;

		int number = Integer.parseInt(newValue);

		if (number > 1290 && number < 2022) {
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

		if (newValue.length() == 2 && isCapital(newValue)) {
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

	private void validatePopulation(String newValue) {
		boolean valid = false;

		int number = Integer.parseInt(newValue);

		if (number >= 1 && istEineZahl(newValue)) {
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

	private void validateArea(String newValue) {
		boolean valid = false;

		int number = Integer.parseInt(newValue);

		if (number >= 1 && istEineZahl(newValue)) {
			valid = true;
		} else {
			valid = false;
		}

		view.textArea.getStyleClass().remove("AreaNotOk");
		view.textArea.getStyleClass().remove("AreaOk");
		if (valid) {
			view.textArea.getStyleClass().add("AreaOk");
		} else {
			view.textArea.getStyleClass().add("AreaNotOk");
		}
	}

	private void deleteData(ActionEvent e) {

		Canton canton = (Canton) view.list.getSelectionModel().getSelectedItem();
		canton.setArea(0);
		canton.setPopulation(0);
		canton.setShortform("N/A");
		canton.setYear(0);

		view.lblDataPop.setText("0");
		view.lblDataYear.setText("0");
		view.lblDataShortform.setText("N/A");
		view.lblDataArea.setText("0");

	}

	private void submitData(ActionEvent e) {
		// model.submitData();
		// selected item
		Canton canton = (Canton) view.list.getSelectionModel().getSelectedItem();
		// edit canton data in canton
		// canton.setName(String.valueOf(canton));
		// view.lblDataCapital.setText(canton.getCapital(canton));
		canton.setPopulation(Integer.parseInt(view.textPopulation.getText()));
		canton.setYear(Integer.parseInt(view.textYear.getText()));
		canton.setArea(Integer.parseInt(view.textArea.getText()));
		canton.setShortform((view.textShortForm.getText()));

		if (view.dt.isSelected()) {
			canton.setLanguage("Deutsch");
		}
		if (view.fr.isSelected()) {
			canton.setLanguage("Französisch");
		}
		if (view.it.isSelected()) {
			canton.setLanguage("Italienisch");
		}
		if (view.rr.isSelected()) {
			canton.setLanguage("Rätoromanisch");
		}

		// updateView(view.list.getSelectionModel().getSelectedItem());

	}

	private void updateView(ActionEvent e) {
		// TODO
		Canton canton = (Canton) view.list.getSelectionModel().getSelectedItem();
		if (canton != null) {
			view.lblDataName.setText(String.valueOf(canton.getName()));
			view.lblDataCapital.setText(canton.getCapital(canton));
			view.lblDataPop.setText(String.valueOf(canton.getPopulation()));
			view.lblDataYear.setText(String.valueOf(canton.getYear()));
			view.lblDataArea.setText(String.valueOf(canton.getArea()));
			view.lblDataShortform.setText(canton.getShortform());
			view.lblDataLang.setText(String.valueOf(canton.getLanguage()));
			// view.ImageInput = canton.getFlag();
			// view.lblImageLink.setText(canton.getFlag());
			// view.ImageInput= canton.getFlag();
			// view.image(canton.getFlag());
			view.imageView.setImage(new Image(canton.getFlag()));

		} else {
			view.lblDataCapital.setText("N/A");
			view.lblDataName.setText("N/A");
			view.lblDataPop.setText("N/A");
			view.lblDataYear.setText("N/A");
		}
	}

	public void saveFile(ActionEvent e) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(new FileOutputStream("cantons.txt"));
		for (Canton canton : model.getArray()) {
			pw.println("Canton: " + canton.getName() + " \t Shortform: " + canton.getShortform() + " \t Area: "
					+ String.valueOf(canton.getArea()) + " \t Population: " + String.valueOf(canton.getPopulation())
					+ " \t Capital: " + String.valueOf(canton.getCapital(canton)) + " \t Year: "
					+ String.valueOf(canton.getYear()));
		}
		pw.close();
	}

	public boolean istEineZahl(String eingabe) {
		// Prüfen ob 'eingabe' eine ganze Zahl ist. Wenn ein Zeichen keine Zahl ist, ist
		// das Ergebnis 'false'.
		boolean zahl = true;
		char[] c;
		int i;

		eingabe = eingabe.trim();
		c = eingabe.toCharArray();

		for (i = 0; i < eingabe.length(); i++) {
			if (!Character.isDigit(c[i])) {
				zahl = false;
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
