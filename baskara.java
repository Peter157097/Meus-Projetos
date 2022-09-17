import java.util.Scanner;
public class baskara {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double a, b, c, delta, x1, x2, xv, yv;
		String escolha, escolha2;
		
		System.out.println("Digite a funçao matematica");
		escolha = in.next();
		switch (escolha) {
			case "quadratica":
			case "Quadratica":
				System.out.println("Digite o valor de a");
				a = in.nextDouble();
				System.out.println("Digite o valor de b");
				b = in.nextDouble();
				System.out.println("Digite o valor de c");
				c = in.nextDouble();
				delta = (b*b)-4*a*c;
				if (a>0) {
					System.out.println("Boca pra cima");
				}
				else {
					System.out.println("Boca pra baixo");
				}
				System.out.println("Esse sera o delta = " + delta);
				if (delta < 0) {
					System.out.println("Nao existem raizes aq poha");
				} else if (delta == 0) {
					x1 = b/(2*a);
					System.out.println("Existe uma raiz real x1 = "+(String.format("%.0f",x1)));
				} else {
					x1 = (-b+Math.sqrt(delta))/(2*a);
					x2 = (-b-Math.sqrt(delta))/(2*a);
					System.out.println("Existem duas raizes reais x1 = "+(String.format("%.0f",x1))+ " e x2 = " + (String.format("%.0f",x2)));
				}
				xv = -b/(2*a);
				yv = -delta/(4*a);
				System.out.println("Esse sera o par ordenado do vertice "+"("+(String.format("%.0f",xv))+","+(String.format("%.0f",yv))+")");
				break;
			case "exporial":
			case "Exporial":
				System.out.println("Digite o valor de a");
				a = in.nextDouble();
				System.out.println("Digite o valor de x");
				x1 = in.nextDouble();
				if (a==0 && a==1) {
					System.out.println("valor de a não valido como função de primeiro grau");
				}
				yv = Math.pow(a, x1);
				System.out.println("Esse sera o par ordenado ("+(String.format("%.0f",x1))+","+(String.format("%.0f",yv))+")");
				System.out.println("Deseja calcular outro y? sim? ou não?");
				escolha2 = in.next();
				while (escolha2.equals("sim")) {
						System.out.println("Digite outro valor de x");
						x1 = in.nextDouble();
						if (a==0 && a==1) {
							System.out.println("valor de a não valo como funbção de primeiro grau");
						}
						yv = Math.pow(a, x1);
						System.out.println("Esse sera o par ordenado ("+(String.format("%.0f",x1))+","+(String.format("%.0f",yv))+")");
						System.out.println("Deseja calcular outro y? sim? ou não?");
						escolha2 = in.next();
				}
				break;
			default:
				System.out.println("função não disponivel");
		}
		
		in.close();
	}
}