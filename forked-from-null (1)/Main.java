/******************************************************************************

30/03 Cilene - TESTAR A PILHA PARA RESOLVER EXPRESSÃO MATEMÁTICA

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		// Criar uma pilha p - chamando o CONSTRUTOR
		TADPilha p = new TADPilha (100);
		
		String expressao="34+"; //"2345+*6+*";
		char aux;
		int a,b,res=0;
		
		for (int i=0; i< expressao.length(); i++)  {
		    aux = expressao.charAt(i);
		    int aux2 = Integer.parseInt(aux);
		    // Se for numero, empilha
		    if (aux>='0' && aux <= '9') {
		        p.empilha(aux);
		    }
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
