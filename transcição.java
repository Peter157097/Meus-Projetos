package estudo_testezin;

import java.util.Scanner;

public class transcição {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double temperatura1, temperatura2, massa1, massa2, comprimento1, comprimento2;
		int escolha;
		String escolha2, escolha3;
		
			System.out.println("Digite oque voce quer calcular");
			System.out.println("[1]Comprimento [2]Massa [3]Temperatura");
			escolha = ler.nextInt();
			switch (escolha) {
				case 1:
					System.out.println("Voce deseja calcular");
					System.out.println("[metros] [pes] [milhas] [jarda]");
					escolha2 = ler.next();
					switch (escolha2) {
						case "metros":
							System.out.println("voce deseja calcular metros em que");
							System.out.println("[pe] [milha] [jarda]");
							escolha3 = ler.next();
							switch(escolha3) {
								case "pe":
									System.out.println("Digite o comprimento em metros");
									comprimento1 = ler.nextDouble();
									comprimento2 = comprimento1*3.28084;
									System.out.println("Esse sera o comprimento em pe "+(String.format("%.2f",comprimento2)));
									break;
								case "milha":
									System.out.println("Digite o comprimento em metros");
									comprimento1 = ler.nextDouble();
									comprimento2 = comprimento1*0.000621371;
									System.out.println("Esse sera o comprimento em milhas "+(String.format("%.2f",comprimento2)));
									break;
								case "jarda":
									System.out.println("Digite o comprimento metros");
									comprimento1 = ler.nextDouble();
									comprimento2 = comprimento1*1.09361;
									System.out.println("Esse sera o comprimento em milhas "+(String.format("%.2f",comprimento2)));
									break;
								default:
									System.out.println("Palavra invalida");
									break;
							}
							break;
							//aqui acaba os calculos de metros
						case "pes":
							System.out.println("voce deseja calcular pes em que");
							System.out.println("[metro] [milha] [jarda]");
							escolha3 = ler.next();
							switch(escolha3) {
								case "metro":
									System.out.println("Digite o comprimento em pes");
									comprimento1 = ler.nextDouble();
									comprimento2 = comprimento1*0.3048;
									System.out.println("Esse sera o comprimento em metros "+(String.format("%.2f",comprimento2)));
									break;
								case "milha":
									System.out.println("Digite o comprimento em pes");
									comprimento1 = ler.nextDouble();
									comprimento2 = comprimento1*0.000189394;
									System.out.println("Esse sera o comprimento em milha "+(String.format("%.2f",comprimento2)));
									break;
								case "jarda":
									System.out.println("Digite o comprimento em pes");
									comprimento1 = ler.nextDouble();
									comprimento2 = comprimento1*0.333333;
									System.out.println("Esse sera o comprimento em jarda "+(String.format("%.2f",comprimento2)));
									break;
								default:
									System.out.println("Palavra invalida");
									break;
							}
							break;
							//aqui acaba os calculos em pes
						case "milhas":
							System.out.println("voce deseja calcular milhas em que");
							System.out.println("[pe] [metro] [jarda]");
							escolha3 = ler.next();
							switch(escolha3) {
								case "pe":
									System.out.println("Digite o comprimento em milhas");
									comprimento1 = ler.nextDouble();
									comprimento2 = comprimento1*5280;
									System.out.println("Esse sera o comprimento em pes "+(String.format("%.2f",comprimento2)));
									break;
								case "metro":
									System.out.println("Digite o comprimento em metros");
									comprimento1 = ler.nextDouble();
									comprimento2 = comprimento1*1609.34;
									System.out.println("Esse sera o comprimento em metros "+(String.format("%.2f",comprimento2)));
									break;
								case "jarda":
									System.out.println("Digite o comprimento metros");
									comprimento1 = ler.nextDouble();
									comprimento2 = comprimento1*1760;
									System.out.println("Esse sera o comprimento em jardas "+(String.format("%.2f",comprimento2)));
									break;
								default:
									System.out.println("Palavra invalida");
									break;
							}
							break;
							//aqui acaba os calculos em milhas
						case "jarda":
							System.out.println("voce deseja calcular jardas em que");
							System.out.println("[pe] [metro] [milhas]");
							escolha3 = ler.next();
							switch(escolha3) {
								case "pe":
									System.out.println("Digite o comprimento em jardas");
									comprimento1 = ler.nextDouble();
									comprimento2 = comprimento1*3;
									System.out.println("Esse sera o comprimento em pes "+(String.format("%.2f",comprimento2)));
									break;
								case "metro":
									System.out.println("Digite o comprimento em jardas");
									comprimento1 = ler.nextDouble();
									comprimento2 = comprimento1*0.9144;
									System.out.println("Esse sera o comprimento em metros "+(String.format("%.2f",comprimento2)));
									break;
								case "milhas":
									System.out.println("Digite o comprimento jardas");
									comprimento1 = ler.nextDouble();
									comprimento2 = comprimento1*0.000568182;
									System.out.println("Esse sera o comprimento em milhas "+(String.format("%.2f",comprimento2)));
									break;
								default:
									System.out.println("Palavra invalida");
									break;
							}
							break;
						default:
							System.out.println("Palavra invalida");
							break;
					}
					break;
					//aqui acaba os calculos de comprimento
				case 2:
					System.out.println("Voce deseja calcular");
					System.out.println("[kilos] [stone] [libra] [onça]");
					escolha2 = ler.next();
					switch (escolha2) {
						case "kilos":
							System.out.println("voce deseja calcular kilos em que");
							System.out.println("[stone] [libra] [onça]");
							escolha3 = ler.next();
							switch(escolha3) {
								case "stone":
									System.out.println("Digite a massa em kilos");
									massa1 = ler.nextDouble();
									massa2 = massa1*0.157473;
									System.out.println("Essa sera a massa em stone "+(String.format("%.2f",massa2)));
									break;
								case "libra":
									System.out.println("Digite a massa em kilos");
									massa1 = ler.nextDouble();
									massa2 = massa1*2.20462;
									System.out.println("Essa sera a massa em libra "+(String.format("%.2f",massa2)));
									break;
								case "onça":
									System.out.println("Digite a massa kilos");
									massa1 = ler.nextDouble();
									massa2 = massa1*35.274;
									System.out.println("Essa sera a massa em onça "+(String.format("%.2f",massa2)));
									break;
								default:
									System.out.println("Palavra invalida");
									break;
							}
							break;
							//aqui acaba os calculos de kilos
						case "stone":
							System.out.println("voce deseja calcular kilos em que");
							System.out.println("[kilos] [libra] [onça]");
							escolha3 = ler.next();
							switch(escolha3) {
								case "kilos":
									System.out.println("Digite a massa em stone");
									massa1 = ler.nextDouble();
									massa2 = massa1*6.35029;
									System.out.println("Essa sera a massa em kilos "+(String.format("%.2f",massa2)));
									break;
								case "libra":
									System.out.println("Digite a massa em stone");
									massa1 = ler.nextDouble();
									massa2 = massa1*14;
									System.out.println("Essa sera a massa em libra "+(String.format("%.2f",massa2)));
									break;
								case "onça":
									System.out.println("Digite a massa stone");
									massa1 = ler.nextDouble();
									massa2 = massa1*224;
									System.out.println("Essa sera a massa em onça "+(String.format("%.2f",massa2)));
									break;
								default:
									System.out.println("Palavra invalida");
									break;
							}
							break;
							//aqui acaba os calculos de stone
						case "libra":
							System.out.println("voce deseja calcular kilos em que");
							System.out.println("[kilos] [stone] [onça]");
							escolha3 = ler.next();
							switch(escolha3) {
								case "kilos":
									System.out.println("Digite a massa em libra");
									massa1 = ler.nextDouble();
									massa2 = massa1*0.453592;
									System.out.println("Essa sera a massa em kilos "+(String.format("%.2f",massa2)));
									break;
								case "stone":
									System.out.println("Digite a massa em libra");
									massa1 = ler.nextDouble();
									massa2 = massa1*0.0714286;
									System.out.println("Essa sera a massa em stone "+(String.format("%.2f",massa2)));
									break;
								case "onça":
									System.out.println("Digite a massa libra");
									massa1 = ler.nextDouble();
									massa2 = massa1*16;
									System.out.println("Essa sera a massa em onça "+(String.format("%.2f",massa2)));
									break;
								default:
									System.out.println("Palavra invalida");
									break;
							}
							break;
							//aqui acaba os calculos de libra
						case "onça":
							System.out.println("voce deseja calcular kilos em que");
							System.out.println("[kilos] [stone] [libra]");
							escolha3 = ler.next();
							switch(escolha3) {
								case "kilos":
									System.out.println("Digite a massa em onça");
									massa1 = ler.nextDouble();
									massa2 = massa1*0.0283495;
									System.out.println("Essa sera a massa em kilos "+(String.format("%.2f",massa2)));
									break;
								case "stone":
									System.out.println("Digite a massa em onça");
									massa1 = ler.nextDouble();
									massa2 = massa1*0.00446429;
									System.out.println("Essa sera a massa em stone "+(String.format("%.2f",massa2)));
									break;
								case "libra":
									System.out.println("Digite a massa onça");
									massa1 = ler.nextDouble();
									massa2 = massa1*0.0625;
									System.out.println("Essa sera a massa em libra "+(String.format("%.2f",massa2)));
									break;
								default:
									System.out.println("Palavra invalida");
									break;
							}
							break;
							//aqui acaba os calculos de onça
					}
					break;
				case 3:
					System.out.println("Voce deseja calcular");
					System.out.println("[celsius] [fahrenheit] [kelvin]");
					escolha2 = ler.next();
					switch (escolha2) {
						case "celsius":
							System.out.println("voce deseja calcular kilos em que");
							System.out.println("[fahrenheit] [kelvin]");
							escolha3 = ler.next();
							switch(escolha3) {
								case "fahrenheit":
									System.out.println("Digite a temperatura em celsius");
									temperatura1 = ler.nextDouble();
									temperatura2 = (temperatura1*9/5)+32;
									System.out.println("Essa sera a temperatura em fahrenheit "+temperatura2+" F");
									break;
								case "kelvin":
									System.out.println("Digite a temperatura em celsius");
									temperatura1 = ler.nextDouble();
									temperatura2 = temperatura1+273.15;
									System.out.println("Essa sera a temperatura em kelvin "+temperatura2+" K");
									break;
								default:
									System.out.println("Palavra invalida");
									break;
							}
							break;
							//aqui acaba os calculos de celsius
						case "fahrenheit":
							System.out.println("voce deseja calcular kilos em que");
							System.out.println("[celsius] [kelvin]");
							escolha3 = ler.next();
							switch(escolha3) {
								case "celsius":
									System.out.println("Digite a temperatura em fahrenheit");
									temperatura1 = ler.nextDouble();
									temperatura2 = (temperatura1-32)*5/9;
									System.out.println("Essa sera a temperatura em celsius "+temperatura2+" C");
									break;
								case "kelvin":
									System.out.println("Digite a temperatura em fahrenheit");
									temperatura1 = ler.nextDouble();
									temperatura2 = (temperatura1-32)*5/9+273.15;
									System.out.println("Essa sera a temperatura em kelvin "+temperatura2+" K");
									break;
								default:
									System.out.println("Palavra invalida");
									break;
							}
							break;
							//aqui acaba os calculos de celsius
						case "kelvin":
							System.out.println("voce deseja calcular kilos em que");
							System.out.println("[celsius] [fahrenheit]");
							escolha3 = ler.next();
							switch(escolha3) {
								case "celsius":
									System.out.println("Digite a temperatura em kelvin");
									temperatura1 = ler.nextDouble();
									temperatura2 = temperatura1-273.15;
									System.out.println("Essa sera a temperatura em celsius "+temperatura2+" C");
									break;
								case "kelvin":
									System.out.println("Digite a temperatura em kelvin");
									temperatura1 = ler.nextDouble();
									temperatura2 = (temperatura1-273.15)*9/5+32;
									System.out.println("Essa sera a temperatura em fahrenheit "+temperatura2+" F");
									break;
								default:
									System.out.println("Palavra invalida");
									break;
							}
							break;
							//aqui acaba os calculos de celsius
					   }
				default:
					System.out.println("Palavra invalida");
					break;
		}
		ler.close();

		}
	}
	
