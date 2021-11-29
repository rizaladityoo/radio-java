class Lagu {
	private String namaLagu;
	private String namaPenyanyi;
	
	public Lagu(String namaLagu, String namaPenyanyi) {
		this.namaLagu = namaLagu;
		this.namaPenyanyi = namaPenyanyi;
	}
	
	public String getNamaLaguPenyanyi() {
		return namaPenyanyi+"-"+namaLagu;
	}
}