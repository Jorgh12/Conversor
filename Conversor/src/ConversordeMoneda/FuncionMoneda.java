package ConversordeMoneda;

import javax.swing.JOptionPane;

public class FuncionMoneda {
	ConvertirMoneda moneda = new ConvertirMoneda();
	ConvertirAPesos peso = new ConvertirAPesos();
	
	public void ConvertirMoneda (double valor) {
		String Opcion = (JOptionPane.showInputDialog(null, "Elige la moneda a la que deseas convertir tu dinero ", "Moneda",
				JOptionPane.PLAIN_MESSAGE, null, new Object[]
				{"De Pesos a Dolar", "De Pesos a Euro", "De Pesos a Libras", "De Pesos a Yen", "De Pesos a Wones", "De Dolar a Pesos","De Euros a Pesos","De Libras a Pesos","De Yenes a Pesos","De Wones a Pesos"},
				"Seleccion")).toString();
		switch(Opcion) {
		case "De Pesos a Dolar":
			moneda.ConvertirPesoADolar(valor);
			break;	
		case "De Pesos a Euro":
			moneda.ConvertirPesoAEuros(valor);
			break;	
		case "De Pesos a Libras":
		moneda.ConvertirPesoALibra(valor);
		break;
		case "De Pesos a Yen":
			moneda.ConvertirPesoAYen(valor);
		case "De Pesos a Wones":
			moneda.ConvertirPesoAWon(valor);
			
		case "De Dolar a Pesos":
			peso.ConverDolarAPeso(valor);
			break;
		case "De Euros a Pesos":
			peso.ConverEuroAPeso(valor);
			break;
		case "De Libras a Pesos":
			peso.ConverLibraAPeso(valor);
			break;
		case "De Yenes a Pesos":
			peso.ConverYenAPeso(valor);
			break;
		case "De Wones a Pesos":
			peso.ConverWonAPeso(valor);
			break;		
		}				
	}
}
