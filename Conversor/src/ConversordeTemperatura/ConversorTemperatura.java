package ConversordeTemperatura;

import javax.swing.JOptionPane;

public class ConversorTemperatura {
	
	public double ConverCelAFar(double valor) {
		double faren = (valor *1.80) + 32;
		faren = (double) Math.round(faren * 100.0)/100.0;
		JOptionPane.showMessageDialog(null, "Los " + valor + " Grados Celcius son, " + faren + " En Grados Farenheit");
		return faren;	
	}
	
	public void ConverCelAKelvin (double valor) {
		double kelvin = valor + 273.15;
		kelvin = (double) Math.round(kelvin * 100.0)/100.0;
		JOptionPane.showMessageDialog(null, "Los " + valor + " Grados Celsuis son, " + kelvin + " En Grados Kelvin");	
	}
	
	public void ConverFarenACel (double valor) {
		double cel = (valor - 32)/1.80;
		cel = (double) Math.round(cel * 100.0)/100.0;
		JOptionPane.showMessageDialog(null, "Los " + valor + " Grados Farenheit son, " + cel + " En Grados Celcius");
	}
	
	public double ConverKelvinACel (double valor) {
		double celcius = valor - 273.15;
		celcius = (double) Math.round(celcius * 100.0)/100.0;
		JOptionPane.showMessageDialog(null, "Los " + valor + " Grados Kelvin son, " + celcius + " En Grados Celcius");
		return celcius;
	}
	

}
