/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    mensagem();
	    mensagem("Hello World");
	    mensagem("Can you hear the approaching RUIN!!!");
	    mensagem("EPIC", "SEVEN");
	}
	
	public static void mensagem() {
	    System.out.println("hello world");
	}
	
	public static void mensagem(String x) {
	    System.out.println(x);
	}
	
	public static void mensagem(String x, String y) {
	    System.out.println(x + " " + y);
	}
}
