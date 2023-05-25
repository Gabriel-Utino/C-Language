/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		// Criar uma pilha p - chamando o CONSTRUTOR
		TADPilha p = new TADPilha (100);
		
		String expressao="2345+*6+*"; //"[2345+*6+*]  [34+]";
		char aux;
		int a,b,res=0;
		
		for (int i=0; i< expressao.length(); i++)  {
		    aux = expressao.charAt(i);
		    //System.out.println("check　：" + Character.isDigit(aux));
		    int aux2 = Character.getNumericValue(aux);
		    // Se for numero, empilha
		    //System.out.println("check2　：" + Character.isDigit(aux2));
		    if (aux2>=0 && aux2 <= 9) p.empilha(aux2);
		    // se for operacao, 
		    //   desempilha 2 (a e b)
		    //   calcula a operacao e empilha o resultado
		    else {
		        a =  p.desempilha();
		        b =  p.desempilha();
		        if (aux=='+') res= a+b;
		        if (aux=='-') res= a-b;
		        if (aux=='*') res= a*b;
		        if (aux=='/') res= a/b;
		       p.empilha(res);
		    }
		}
        res = p.desempilha();
        System.out.println ("Resultado=" + res);
	}
}