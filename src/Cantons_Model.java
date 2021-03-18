import java.util.ArrayList;

import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;

public class Cantons_Model {
	
	private Canton currentCanton;
	
	private final SimpleObjectProperty<Canton> cantonProperty = new SimpleObjectProperty<>();
	private Canton[] arr = new Canton[26];
	private final SimpleObjectProperty<Canton[]> arrayProperty = new SimpleObjectProperty<>();
	

	
		

	//TODO
	public void saveCanton(CantonNames name, int population, int year, Language language, String shortform) {
		cantonProperty.set(new Canton(name, population, year, language, shortform));
	}
	public void deleteCanton() {
		
	}
	public Canton getCanton() {
		return currentCanton;
	}
	public void updateCanton() {
		int cantonInd = listView.getSelectionModel().getSelectedIndices();
		new Canton(name, population, year, language, shortform)
	}

	public void initializeArray() {
		CantonNames enums[] = CantonNames.values();
		for (int i=0; i<26; i++) {
			Canton cantonli = new Canton(enums[i], 0, 0, Language.Deutsch , "x" );
			arr[i] = cantonli;
			
		}arrayProperty.set(arr);
	}
	
	public Canton[] getArray() {
		if (arrayProperty.get() == null) {
			
			this.initializeArray();
		}
		return arrayProperty.get();
		
	}

	public ObservableList<String> getList() {
		
		ObservableList<String> items = FXCollections.<String>observableArrayList();
		
		 Canton[] arr = this.getArray();
			for(int i=0; i<26; i++) {
				Canton theCantonName = arr[i];
				items.add(theCantonName.getName());
			
		}return items;
		//for (CantonNames name : CantonNames.values()) {
			//items.add(name.name());
			//new Canton(name.name(), 0, 0, Language.Deutsch, "x");}
		//}return items;
}
	
	

}
