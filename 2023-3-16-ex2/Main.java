/******************************************************************************
Triangulo
*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		
	  // Criar um triangulo (construtor)
	  Triangulo x = new Triangulo (7,7,7); //
		
	  if (x.formaTriangulo () ==0) {
	    System.out.println ("Os valores não formam um triangulo");
	  }
	  else {
	    System.out.println ("Os valores  formam um triangulo");  
	    x.mostraTipo();
	  }
	
	}
}
