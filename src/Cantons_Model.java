import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;

public class Cantons_Model {
	
	
	
	
	protected Cantons_Model() {
		
		
	}
	//DATA for table - canton names from enum
	public static ObservableList<String> getList() {
		
		ObservableList<String> items = FXCollections.<String>observableArrayList();
		for (CantonNames name : CantonNames.values()) {
			items.add(name.name());}
		
			return items;
		
	}

}
