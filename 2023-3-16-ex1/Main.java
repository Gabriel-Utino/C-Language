/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    Triangulo first = new Triangulo(8, 6, 8);
	    
	    if (first.formaTriangulo()==0) {
	        System.out.println("miss");
	    }
	    else {
	        System.out.println("correct");
	    }
	    first.mostraTipo();
	    System.out.println("perimetro = " + first.perimetro());
	}
}
