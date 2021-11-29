class Radio {
	private String power;
	private double frekuensi;
	private int volume;
	private int jmlStasion;
	private int count = 0;
	
	private StasionRadio[] stationList = new StasionRadio[20];
	private StasionRadio selectedRadio;
	 
	public static void main(String arg[]) {
		
		Acara[] acaraListBandung = {new Acara("Acapella","19.00"),new Acara("Horror","22.00")};
		Acara[] acaraListJakarta = {new Acara("Drama","12.00"),new Acara("Horror","23.00")};
		
		Object[] penyiarLagu = new Object [2]; 
		Lagu[] tempLagu = {new Lagu("A Sky Full Of Stars","Coldplay"), new Lagu("Faded","Alan Walker"), new Lagu("Lily","Alan Walker")};
		
		penyiarLagu[0] = new Penyiar("Udin");
		penyiarLagu[1] = tempLagu;
		
		acaraListBandung[0].addJadwalAcara(penyiarLagu);
		
		Radio r = new Radio();
		
		r.setPower("ON");
		
		r.addStasionList(new StasionRadio("Radio Bandung",107.1,acaraListBandung));
		r.addStasionList(new StasionRadio("Radio Jakarta",100.0,acaraListJakarta));
		r.setFrekuensi(107.1);
		r.setVolume(40);
	
		System.out.println("Frekuensi 	 : "+r.getFrekuensi());
		System.out.println("StasionRadio : "+r.getStasionRadio());
		System.out.println("Acara, Waktu, Penyiar, Penyanyi-Judul Lagu : "+ r.getAcaraList());
		System.out.println("Volume    	 : "+r.getVolume());
		r.setPower("OFF");
		System.out.println("Power     	 : "+r.getPower());
	}
	
	public Radio() {
		power = "OFF";
		frekuensi = 0.0;
		volume = 0;
	}
	
	// Selector
	public String getPower() {
		return(power);
	}

	public double getFrekuensi() {
		return(frekuensi);
	}

	public int getVolume() {
		return(volume);
	}
	
	public String getStasionRadio () {
		return selectedRadio.getNamaStasion();
	}
	
	public String getPenyiar() {
		return selectedRadio.getPenyiar();
	}
	
	public String getAcaraList () {
		String s = "";
		for (int x = 0; (selectedRadio.getAcaraList()).length > x; x++){
			s = s + "\n ";
			s = s.concat(selectedRadio.getAcaraList()[x].getNamaJamAcaraPenyiar());
		}
		return s;
	}
	// Mutator
	public void setPower(String p) {
		power = p;
	}

	public void setFrekuensi(double f) {
		frekuensi = f;
		if (frekuensi == 107.1) {
			selectedRadio = stationList[0];
		}else 
		if (frekuensi == 100.0){
			selectedRadio = stationList[1];
		}

	}

	public void setVolume(int v) {
		volume = v;
	}
	
	public void addStasionList(StasionRadio namaStasion) {
		stationList[count] = namaStasion;
		count++;
		setJmlhStasion(count);
	}
	
	public void setJmlhStasion(int jmlStasion) {
		this.jmlStasion = jmlStasion;
	}
	
	/*
	public void setAcaraList(Acara[] acaraList) {
		selectedRadio.setAcaraList(acaraList);
	}
	*/
}