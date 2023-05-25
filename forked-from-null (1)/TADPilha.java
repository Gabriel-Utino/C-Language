/******************************************************************************
30/03 Cilene - CLASSE TADPilha
*******************************************************************************/
public class TADPilha {
    // atributos
    int dados[];
    int topo;
    int capacidade;
    
    // Construtor 
    public TADPilha (int c) {
       capacidade = c;
       topo = -1;
       dados = new int [capacidade];
    }

    // métodos
    public boolean empilha(int x) {
		System.out.println("empilahndo :" + x);
        if (!cheia()) {
           topo++;  // topo = topo + 1;
           dados[topo] = x;
           return true;
        }
        System.out.print ("cheia !");
        return false;
    }
    public int desempilha() {
        int aux=0;
        if (!vazia()) {
            aux = dados[topo];
            topo--;  // topo = topo + 1;
        }
        return aux;
    }

    public void mostraAoContrario () {
       for (int i=topo; i>=0; i--) 
           System.out.println (dados[i]);    
    } 
    public void mostra () {
       for (int i=0; i<=topo; i++) 
           System.out.println (dados[i]);    
    } 
    
    public boolean cheia() {
        return (topo==capacidade-1);
    }
    public boolean vazia() {
        return (topo==-1);
    }
    public int conta () {
        return topo+1;
    }
    
    
    
    
    
    
    
 }