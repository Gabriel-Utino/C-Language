/******************************************************************************



*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    int  a=10, b=0;
		System.out.println("Soma = " + Soma(a, b));
		System.out.println("Subtracao = " + Subtracao(a, b));
		System.out.println("Prod = " + Prod(a, b));
		System.out.println("Divisao = " + Divisao(a, b));
		System.out.println("Resto = " + Resto(a, b));
	}
	
	public static int Soma(int a, int b) {
	    return a + b;
	}
	
	public static int Subtracao(int a, int b) {
	    return a - b;
	}
	
	public static int Prod(int a, int b) {
	    if (a==0 || b==0) return 0;
	    return a * b;
	}
	
	public static int Divisao(int a, int b) {
	    if (a==0 || b==0) return 0;
	    return a / b;
	}
	
	public static int Resto(int a, int b) {
	    if (a==0 || b==0) return 0;
	    return a % b;
	}
}
