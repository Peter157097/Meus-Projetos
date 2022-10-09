package estudo_testezin;

import java.util.Scanner;

public class transcição {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double kg, libras, metros, pes;
		int escolha;
		String escolha2;
		
		System.out.println("Digite oque voce quer calcular");
		System.out.println("[1]Altura [2]Peso");
		escolha = ler.nextInt();
		switch (escolha) {
			case 1:
				System.out.println("Voce deseja calcular metros em pes? ou pes em metros");
				System.out.println("Digite qual voce quer calcular");
				escolha2 = ler.next();
				switch (escolha2) {
					case "pes":
						System.out.println("D2
						igite a altura em metros");
						metros = ler.nextDouble();
						pes = metros*3.28084;
						System.out.println("Essa sera a altura em pes "+(String.format("%.1f",pes)));
						break;
					case "metros":
						System.out.println("Digite a altura em pes");
						pes = ler.nextDouble();
						metros = pes*0.3048;
						System.out.println("Essa sera a altura em pes "+(String.format("%.2f",metros)));
						break;
					default:
						System.out.println("palavra invalida");
				}
				break;
			case 2:
				System.out.println("Voce deseja calcular kilos em libra? ou libra em kilos");
				System.out.println("Digite qual voce quer calcular");
				escolha2 = ler.next();
				switch (escolha2) {
					case "kilos":
						System.out.println("Digite o peso em libra");
						libras = ler.nextDouble();
						kg = libras*0.453592;
						System.out.println("Esse sera o peso em lkilos "+(String.format("%.1f",kg)));
						break;
					case "libra":
						System.out.println("Digite o peso em kilos");
						kg = ler.nextDouble();
						libras = kg*2.20462;
						System.out.println("Esse sera o peso em libra "+(String.format("%.1f",libras)));
						break;
					default:
						System.out.println("palavra invalida");
				}
		
	}
	ler.close();

}
}
