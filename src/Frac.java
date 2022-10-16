public class Frac extends MasterFrac {
  private int n, d;
  private int numerator, denominator;
  private float decimal;
  
  public Frac(int n, int d)
  {
	  numerator = n;
	  denominator = d;
  }
  
  public Frac(float decimal)
  {
	  numerator = (int) (decimal * 100.0);
	  decimal = (int)(100.0);
  }
  
  public float toFloat()
  {
	  return ((float) numerator/ (denominator));
  }
  
  public Frac toAdd(Frac num)
  {
	  int a, b;
	  a = numerator;
	  b = denominator;
	  
	  Frac num1 = new Frac(a + b);
	  return num1;
  }
  
  public Frac toSubtract(Frac num)
  {
	  int a, b;
	  a = numerator;
	  b = denominator;
	  Frac num1 = new Frac(a - b);
	  return num1;
  }
  
  public Frac toMultiply(Frac num)
  {
	  int a, b;
	  a = numerator;
	  b = denominator;
	  Frac num1 = new Frac(a * b);
	  return num1;
  }
  
  public Frac toDivide(Frac num)
  {
	  int a, b;
	  a = numerator;
	  b = denominator;
	  Frac num1 = new Frac(a / b);
	  return num1;
	  
  }

  public Frac() {
	  n = 0; d=0;
	  System.out.println("Empty Constructor Called:");
  }

  public Frac(int i) {
	  n = i; d=i;
	  System.out.println("Int Constructor Called: " + i);
  }
  public void Frac1(int i, int j) {
	  n = i; d=j;
	  System.out.println("Frac Constructor Called: " + i + " / " + j);
  }

public float getDecimal() {
	return decimal;
}

public void setDecimal(float decimal) {
	this.decimal = decimal;
}

public int getNumerator() {
	return numerator;
}

public void setNumerator(int n) {
	this.numerator = n;
}

public int getDenominator() {
	return denominator;
}

public void setDenominator(int d) {
	this.denominator = d;
}
}