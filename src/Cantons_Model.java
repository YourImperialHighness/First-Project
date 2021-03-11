import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;

public class Cantons_Model {
	
	
	private ObservableList<Canton> cantonList = FXCollections.observableArrayList();
	
	protected Cantons_Model() {
		
		
	}
	//DATA for table
	public static ObservableList<String> getList() {
		//Canton c1 = new Canton(CantonNames.Aargau, 5000, 1888);
		//Canton c2 = new Canton(CantonNames.Zurich, 400, 1999);
		//Canton c3 = new Canton(CantonNames.Luzern, 400, 1999);
		//return cantonList(c1, c2, c3);
		
		
		ObservableList<String> items = FXCollections.<String>observableArrayList();
		for (CantonNames name : CantonNames.values()) {
			items.add(name.name());}
		
return items;
		
	}

}
