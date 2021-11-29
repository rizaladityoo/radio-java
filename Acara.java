class Acara {
	private Lagu[] laguList;
	private Penyiar penyiar;
	private String namaAcara;
	private String jamAcara;
	
	public Acara(String namaAcara, String jamAcara) {
		this.namaAcara = namaAcara;
		this.jamAcara = jamAcara;
	}
	
	public void addJadwalAcara(Object[] penyiarLagu) {
		penyiar = Penyiar.class.cast(penyiarLagu[0]);
		laguList = Lagu[].class.cast(penyiarLagu[1]);
	}
	
	/*public void getPenyiar() {
		return penyiar
	}*/
	
	public String getNamaJamAcaraPenyiar() {
		String namaPenyiar = "";
		if(penyiar != null){
			namaPenyiar = this.getPenyiar();
		}
		return namaAcara+" "+jamAcara+" "+namaPenyiar+" {"+ this.getLagu()+"}";
	}
	
	public String getPenyiar() {
		return penyiar.getNamaPenyiar();
	}
	
	public String getLagu() {
		String s = "";
		if(laguList != null){
			for (int x = 0; x < laguList.length; x++){
				s = s+laguList[x].getNamaLaguPenyanyi()+", ";
			}
		}
		return s.replaceFirst("..$","");
	}

	
	
}