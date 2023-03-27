package Menu;

import javax.swing.JOptionPane;

import ConversordeMoneda.FuncionMoneda;
import ConversordeTemperatura.FuncionTemperatura;

public class MenuPrincipal {
	public static void main(String[] args) {

		FuncionMoneda moneda = new FuncionMoneda();
		FuncionTemperatura temperatura = new FuncionTemperatura();

		while(true){

			String opcion = (JOptionPane.showInputDialog(null, "Seleccione una opcion de Conversion","Menu",JOptionPane.QUESTION_MESSAGE, null,
			new Object[]{"Conversor de Moneda", "Conversor de Temperatura"}, "Seleccion")).toString();

			switch(opcion){
				case "Conversor de Moneda":
				String inputMon = JOptionPane.showInputDialog(null, "Ingrese la Cantidad de Dinero a Convertir: ");
				if(ValidarNumero(inputMon) == true){
					double valor = Double.parseDouble(inputMon);
					moneda.ConvertirMoneda(valor);

				int respuesta = JOptionPane.showConfirmDialog(null, "Desea Realizar otra Conversion?");
				if (JOptionPane.OK_OPTION == respuesta){
					System.out.println("Selecciona nuevamente");
				}else{
					JOptionPane.showMessageDialog(null, "Programa Terminado");
				}
				}else{
					JOptionPane.showConfirmDialog(null, "Valor Invalido");
				}
					break;

				case "Conversor de Temperatura":
				String inputTem = JOptionPane.showInputDialog(null, "Ingrese la Cantidad a Convertir ");
				if(ValidarNumero(inputTem) == true){
					double valor = Double.parseDouble(inputTem);
					temperatura.ConvertirTemp(valor);

				int respuesta = JOptionPane.showConfirmDialog(null, "Desea Realizar otra Conversion? ");
				if (JOptionPane.OK_OPTION == respuesta){
					System.out.println("Seleccione nuevamente");
				}else{
					JOptionPane.showMessageDialog(null, "Programa Terminado");
				}
				}else {
					JOptionPane.showConfirmDialog(null, "Valor Invalido");
				}
					break;
			}
		}
		
	}

	public static boolean ValidarNumero(String valor){
		try{
			double x = Double.parseDouble(valor);
			if(x >= 0 || x <= 0);
			return true;
		}catch (NumberFormatException e){
			return false;
		}

	}

}
