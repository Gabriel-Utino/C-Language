/******************************************************************************

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    mensagem("4 + 7 = " + soma(4, 7));
	    mensagem("5 ^ 3 = " + potencia(5, 3));
	}
	
	public static void mensagem(String x) {
	    System.out.println(x);
	}
	
	public static int soma(int x, int y) {
	    return x + y;
	}
	
	public static double potencia(int x, int y) {
	    return Math.pow(x, y);
	}
}
