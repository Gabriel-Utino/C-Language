/******************************************************************************

Gabriel - 2023/2/16 - Calculadora em C

*******************************************************************************/
#include <stdio.h>

int soma(int a, int b) {
    return a + b;
}
int subtracao(int a, int b) {
    return a - b;
}
int prod(int a, int b) {
    if (a==0 || b==0) return 0;
    return a * b;
}
int divisao(int a, int b) {
    if (a==0 || b==0) {
        return 0;
    } else {
        return a / b;
    }
}
int rest(int a, int b) {
    if (a==0 || b==0) {
        return 0;
    } else {
        return a % b;
    }
}
int main()
{
    int a=10, b=0;
    
    
    printf ("Soma = %d", soma(a,b));
    printf ("\nSubtracao = %d", subtracao(a,b)); 
    printf ("\nProd = %d", prod(a,b));
    printf ("\nDivisao = %d, Resto = %d", divisao(a,b), rest(a,b));
    return 0;
    
}
//
