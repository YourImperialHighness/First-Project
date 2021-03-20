import java.util.ArrayList;

import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;

public class Cantons_Model {

	private Canton currentCanton;

	private final SimpleObjectProperty<Canton> cantonProperty = new SimpleObjectProperty<>();
	private Canton[] arr = new Canton[26];
	private final SimpleObjectProperty<Canton[]> arrayProperty = new SimpleObjectProperty<>();


	
		

	//TODO
	//public void saveCanton(CantonNames name, int population, int year, Language language, String shortform) {
	//	cantonProperty.set(new Canton(name, population, year, language, shortform));
	//}
	//public void deleteCanton() {
	//	
	//}
	//public Canton getCanton() {
	//	return cantonProperty.get();
	//}
	//public void updateCanton() {
	//	int cantonInd = listView.getSelectionModel().getSelectedIndices();
	//	new Canton(name, population, year, language, shortform)
	//}
	

	// TODO
	//public void saveCanton(CantonNames name, int population, int year, Language language, String shortform,
	//		ImageView flag) {
	//	cantonProperty.set(new Canton(name, population, year, language, shortform, flag));
	//}

	//public void deleteCanton() {
	//
	//}
	//
	//public Canton getCanton() {
	//	return cantonProperty.get();
	//}

	//public void updateCanton() {
	//	int cantonInd = listView.getSelectionModel().getSelectedIndices();
	//	new Canton(name, population, year, language, shortform)
	//}


	public void initializeArray() {
		CantonNames enums[] = CantonNames.values();

		for (int i=0; i<26; i++) {
			
			Canton cantonli = new Canton(enums[i], 0, 0, 0, Language.Deutsch , "ZH");

			arr[i] = cantonli;
		}
		arrayProperty.set(arr);
	}

	public Canton[] getArray() {
		if (arrayProperty.get() == null) {

			this.initializeArray();
		}
		return arrayProperty.get();

	}

	public ObservableList<Canton> getList() {

		ObservableList<Canton> items = FXCollections.<Canton>observableArrayList();

		Canton[] arr = this.getArray();
		for (int i = 0; i < 26; i++) {
			Canton theCanton = arr[i];
			items.add(theCanton);// .getName()

		}
		return items;
	}

}
