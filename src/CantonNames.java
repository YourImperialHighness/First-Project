public enum CantonNames {
	
	Zurich ("Zurich"), Bern ("Bern"), Luzern ("Luzern"), Uri("Altdorf"), Schwyz("Schwyz"), Obwalden("Sarnen"), Nidwalden("Stans"), Glarus("Glarus"), Zug("Zug"), Freiburg("Freiburg"), Solothurn("Solothurn"), Baselstadt("Basel"), Basellandschaft("Liestal"), Schaffhausen("Schaffhausen"), Appenzell_AR("Herisau"), Appenzell_IR("Appenzell"), St_Gallen("St Gallen"), Graubunden("Chur"), Aargau("Aarau"), Thurgau("Frauenfeld"), Tessin("Bellinzona"), Waadt("Lausanne"), Wallis("Sion"), Neuenburg("Neuenburg"), Genf("Genf"), Jura("Delemont");
	
	private String capital;
	
	private CantonNames(String capital) {
		this.capital = capital;
	}

	public String toString(CantonNames name) {
		return String.valueOf(name);
	}

	public String getCapital() {
		// TODO Auto-generated method stub
		return this.capital;
	}

}
