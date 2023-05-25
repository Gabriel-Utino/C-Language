public class Main
{
  public static void main (String[]args)
  {
    int n = 10, resto;

    Pilha p = new Pilha (3);

    while (n != 0)
      {
	resto = n % 2;
	p.empilha (resto);
	n = n / 2;
      }
    System.out.println ("Ao Contrario");
    p.mostraAoContrario ();
    System.out.println ("Mostra normal");
    p.mostra();
    System.out.println("a pilha tem " + p.conta() + " elementos");
  }
}
