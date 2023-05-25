/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    String mensagem = "Ola Mundo! Fim do carnaval " + ( 44 + 66);
		System.out.println (mensagem);
		System.out.println ("Tamanho da mensagem = " + mensagem.length());
		System.out.println ( " Em maiusculo = " + mensagem.toUpperCase());
		System.out.println ( " Em minusculo = " + mensagem.toLowerCase());
	    System.out.println ( " trocando o s pelo x" + mensagem.replace( 'o', 'x'));
	    System.out.println ( " trocando mundo = " + mensagem.replace("Mundo", "World"));
	    System.out.println ( " Posição da letra c é = " + mensagem.indexOf('c'));
	    System.out.println ( " Na posição 9 temos = " + mensagem.charAt(9));
	    System.out.println ( " Extraindo uma parte = " + mensagem.substring(4,10));
	    
	    //Explorem a classe Math do Java - 2023/3/2
	    System.out.println("18 elevado ao cubo = " + Math.pow(18, 3));
	    System.out.println("Raiz quadrada de 1024 = " + Math.sqrt(1024));
	}
}
