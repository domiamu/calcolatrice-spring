package it.domenico.Calcolatrice;

public class Operazione {
	
	int valore1;
	int valore2;
	
	
	public int getValore1() {
		return valore1;
	}
	public void setValore1(int valore1) {
		this.valore1 = valore1;
	}
	public int getValore2() {
		return valore2;
	}
	public void setValore2(int valore2) {
		this.valore2 = valore2;
	}
	
	@Override
	public String toString() {
		return "Operazione valore1=" + valore1 + ", valore2=" + valore2 + "Somma" + (valore1 + valore2);
	}
	

}