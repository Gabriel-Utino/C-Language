public class Triangulo  {
    
    // Atributos = Variáveis
    int ladoa;
    int ladob;
    int ladoc;
    
    // Construtores (chamado no new)
    public Triangulo (int a, int b, int c) {
        ladoa = a;
        ladob = b;
        ladoc = c;
    }
    
    // Métodos = Funcionalidades
    public int formaTriangulo () {
        // Retornar 1 se é um triangulo e 0 caso contrario
        // Um de seus lados deve ser:
        // menor que a soma dos outros dois lados
        
        int aux = 0; // nao eh um triangulo
    
        // maior que o valor absoluto (módulo) da diferença dos outros dois lados e 
        if ( ladoa > diferenca(ladob,ladoc) &&
             ladob > diferenca(ladoa,ladoc) &&
             ladoc > diferenca(ladoa,ladob) &&
       // menor que a soma dos outros dois lados
             ladoa < ladob + ladoc &&
             ladob < ladoa + ladoc &&
             ladoc < ladoa + ladob
          )
          aux = 1; // eh um triangulo
    
        return aux;
    }
    
    public void mostraTipo() {
      // &&=e  ||=ou  !=nao   
      // Equilatero (3 lados sao iguais)
      // Isosceles  (2 lados sao iguais e um diferente)
      // Escaleno   (3 lados sao diferentes)
      
     // CHEIRO DE PROVA
     if (ladoa==ladob && ladoa == ladoc) System.out.println("Equilatero");
     else if (ladoa != ladob && ladoa != ladoc && ladob != ladoc ) {
             System.out.println("Escaleno");
          }
          else System.out.println("Isosceles");
    }
    
    private int diferenca (int a, int b) {
        // Por exemplo:
        // se passar 3 e 4 (nesta ordem), retorna 1
        // se passar 4 e 3 (nesta ordem), retorna 1
    
        int aux;
        aux = b-a;
        if (aux < 0) aux = aux * (-1);
        return aux;  
    }
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}