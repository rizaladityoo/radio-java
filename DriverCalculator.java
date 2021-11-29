class DriverCalculator {
  // Program utama
  public static void main(String arg[]) {
    // Ciptakan objek
    Calculator calc = new Calculator();

    // Manipulasi objek
    calc.setPower("ON");

    System.out.println("Power   : "+calc.getPower());	
    
	calc.setPenjumlahan(30.0,20.0);	
    System.out.println("Hasil dari penjumlahan  : "+calc.getPenjumlahan());
	
    calc.setPengurangan(10.0,11.0);
	System.out.println("Hasil dari pengurangan  : "+calc.getPengurangan());
	
	
	calc.setPerkalian(3.0,7.0);
	System.out.println("Hasil dari perkalian  : "+calc.getPerkalian());	
	
	
	calc.setPembagian(5.0,2.0);
	System.out.println("Hasil dari pembagian  : "+calc.getPembagian());
  }
}