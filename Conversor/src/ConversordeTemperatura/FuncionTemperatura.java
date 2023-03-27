package ConversordeTemperatura;

import javax.swing.JOptionPane;

public class FuncionTemperatura {
	
	ConversorTemperatura temperatura = new ConversorTemperatura();
	
	public void ConvertirTemp (double valor) {
		String opcion = (JOptionPane.showInputDialog(null,"Elije una opcion a Convertir", "Conversor de Temperatura", JOptionPane.PLAIN_MESSAGE, null,
				new Object[] {"De Grados Celcius a Grados Farenheit", "De Grados Celcuis a Grados Kelvin", "De Grados Farenheit a Grados Celcius","De Grados kelvin a Grados Celcius"},
				"Seleccion")).toString();
		
		switch(opcion) {
		case "De Grados Celcius a Grados Farenheit":
			temperatura.ConverCelAFar(valor);
			break;
		case "De Grados Celcuis a Grados Kelvin":
			temperatura.ConverCelAKelvin(valor);
			break;
		case "De Grados Farenheit a Grados Celcius":
			temperatura.ConverFarenACel(valor);
			break;
		case "De Grados kelvin a Grados Celcius":
			temperatura.ConverKelvinACel(valor);
			break;
		}	
	}
}
