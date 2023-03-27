package ConversordeMoneda;

import javax.swing.JOptionPane;

public class ConvertirAPesos {
	
	public void ConverDolarAPeso (double valor) {
		double monedaDolar = valor * 18.44;
		monedaDolar = (double) Math.round(monedaDolar *100.0)/100.0;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Pesos Mexicanos");
	}
	
	public void ConverEuroAPeso (double valor) {
		double monedaEuro = valor * 19.88;
		monedaEuro = (double) Math.round(monedaEuro * 100.0)/100.0;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Pesos Mexicanos");
	}
	
	public void ConverLibraAPeso (double valor) {
		double monedaLibra = valor * 22.55;
		monedaLibra = (double) Math.round(monedaLibra * 100.0)/100.0;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibra + " Pesos Mexicanos");
	}
	
	public void ConverYenAPeso (double valor) {
		double monedaYen = valor / 7.09;
		monedaYen = (double) Math.round(monedaYen *100.0)/100.0;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Pesos Mexicanos");
	}
	
	public void ConverWonAPeso (double valor) {
		double monedaWon = valor / 70.27;
		monedaWon = (double) Math.round(monedaWon * 100.0)/100.0;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWon + " Pesos Mexicanos");
	}
}
