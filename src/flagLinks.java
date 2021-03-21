
public enum flagLinks {

	Zurich("\"kt1.jpg\""), Bern("kt2.jpg"), Luzern("kt3.jpg"), Uri("kt4.jpg"), Schwyz("kt5.jpg"), Obwalden("kt6.jpg"),
	Nidwalden("kt7.jpg"), Glarus("kt8.jpg"), Zug("kt9.jpg"), Freiburg("kt10.jpg"), Solothurn("kt11.jpg"),
	Baselstadt("kt12.jpg"), Basellandschaft("kt13.jpg"), Schaffhausen("kt14.jpg"), Appenzell_AR("kt15.jpg"),
	Appenzell_IR("kt16.jpg"), St_Gallen("kt17.jpg"), Graubunden("kt18.jpg"), Aargau("kt19.jpg"), Thurgau("kt20.jpg"),
	Tessin("kt21.jpg"), Waadt("kt22.jpg"), Wallis("kt23.jpg"), Neuenburg("kt24.jpg"), Genf("kt25.jpg"),
	Jura("kt26.jpg");

	String link;

	flagLinks(String link) {
		this.link = link;
	}

	public String getLink() {
		return this.link;
	}
}
