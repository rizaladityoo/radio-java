class StasionRadio {
	private Acara[] acaraList;
	private Acara acara;
	private String namaStasion;
	private double freq;
	
	/*
	public StasionRadio(String namaStasion, double freq, Acara[] acaraList) {
		this.namaStasion = namaStasion;
		this.freq = freq;
		this.acaraList = acaraList;
	}
	*/
	
	public double getFreq() {
		return(freq);
	}
	
	public String getNamaStasion() {
		return(namaStasion);
	}
	
	public Acara[] getAcaraList() {
		return(acaraList);
	}
	
	public String getPenyiar() {
		return acara.getPenyiar();
	}
	
	public StasionRadio(String namaStasion, double freq, Acara[] acaraList) {
		this.namaStasion = namaStasion;
		this.freq = freq;
		this.acaraList = acaraList;
	}
	
	public void setAcaraList(Acara[] acaraList) {
		this.acaraList = acaraList;
	}
	
	public void addJadwalAcara(Object[] penyiarLagu) {
		acara.addJadwalAcara(penyiarLagu);
	}
	
}