import java.util.Scanner;
public class baskara {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double a, b, c, delta, x1, x2, xv, yv;
		
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
		if (delta<0) {
			
		}
		in.close();
	}
}