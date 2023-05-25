public class Pilha
{
  public int dados[];
  public int topo;
  public int capasidade;

  public Pilha (int c){
    capasidade = c;
    topo = -1;
    dados = new int[capasidade];
  }

  public boolean empilha (int resto){
    if (cheia()){
	    topo++;
	    dados[topo] = resto;
	    return true;
      }
      System.out.println("full");
      return false;
  }

  public void mostraAoContrario (){
    for (int i = topo; i >= 0; i--){
	    System.out.println (dados[i]);
      }
  }

  public void mostra (){
    for (int x = 0; x <= topo; x++){
	    System.out.println (dados[x]);
      }
  }

  public boolean cheia (){/*
      return (topo == capasidade-1);
    */
      if (capasidade == (topo +1)) {
          return false;
      }
      return true;
  }
  
  public boolean vazio() {
    return (topo == -1);
  }
  
  public int conta() {
      return topo+1;
  }
}
