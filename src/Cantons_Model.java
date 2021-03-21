
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Cantons_Model {

	private Canton[] arr = new Canton[26];
	private final SimpleObjectProperty<Canton[]> arrayProperty = new SimpleObjectProperty<>();

	public void initializeArray() {
		CantonNames enums[] = CantonNames.values();

		for (int i = 0; i < 26; i++) {

			Canton cantonli = new Canton(enums[i], 0, 0, 0, Language.Deutsch, "N/A", "kt" + (i + 1) + ".jpg");

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
