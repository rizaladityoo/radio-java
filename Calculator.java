class Calculator {
  // Deklarasi atrribut
  private String power;
  private double a;
  private double b;

  // Definisi method
  // Konstruktor
  public Calculator() {
    power = "OFF";
    a = 0.0;
    b = 0.0;
  }

  // Selector
  public String getPower() {
    return(power);
  }

  public double getPenjumlahan() {
    return(a+b);
  }

  public double getPengurangan() {
    return(a-b);
  }
  
  public double getPerkalian() {
    return(a*b);
  }

  public double getPembagian() {
	return(a/b);
  }
  
  // Mutator
  public void setPower(String p) {
    power = p;
  }

  public void setPenjumlahan(double a, double b) {
    this.a = a;
	this.b = b;
  }

  public void setPengurangan(double a, double b) {
    this.a = a;
	this.b = b;
  }
 
  public void setPerkalian(double a, double b) {
    this.a = a;
	this.b = b;
  }
  
  public void setPembagian(double a, double b) {
    this.a = a;
	this.b = b;
  }
}