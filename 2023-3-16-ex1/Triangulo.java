public class Triangulo {
    public int ladoA;
    public int ladoB;
    public int ladoC;
    
    public Triangulo (int a, int b, int c) {
        ladoA = a;
        ladoB = b;
        ladoC = c;
    }
    
    public int formaTriangulo () {
        int aux = 0;
        if ( ladoA > diferenca(ladoB, ladoC) &&
            ladoB > diferenca(ladoA, ladoC) &&
            ladoC > diferenca(ladoA, ladoB) &&
            ladoA < ladoB + ladoC &&
            ladoB < ladoA + ladoC &&
            ladoC < ladoA + ladoB
            ) aux = 1;
        return aux;
    }
    
    private int diferenca(int a, int b) {
        if (a>b) {
            return a - b;
        } else {
            return b - a;
        }
    }
    
    public void mostraTipo() {
        if (ladoA == ladoB || ladoB == ladoC || ladoC == ladoA) {
            if (ladoA == ladoB && ladoB == ladoC && ladoC == ladoA) {
                System.out.println("Triangulo Equilatero");
            } else {
                System.out.println ("Triangulo isosceles");
            }
        } else {
            System.out.println ("diferentes");
        }
    }
    
    public int perimetro() {
        int per;
        per = ladoA + ladoB + ladoC;
        return per;
    }
}