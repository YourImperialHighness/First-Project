import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;

public class Cantons_Model {
	
	private Canton currentCanton;
	
	
	protected Cantons_Model() {
		
		
	}
	//DATA for table - canton names from enum
	public static ObservableList<String> getList() {
		
		ObservableList<String> items = FXCollections.<String>observableArrayList();
		for (CantonNames name : CantonNames.values()) {
			items.add(name.name());}
		
			return items;
		
	}
	//TODO
	public void saveCanton() {
		
	}
	public void deleteCanton() {
		
	}
	public Canton getCanton() {
		return currentCanton;
	}

}
