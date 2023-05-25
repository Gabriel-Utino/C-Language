/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

int main()
{
    double p1, p2, p3;
    double media;
    scanf("%lf", &p1);
    scanf("%lf", &p2);
    scanf("%lf", &p3);
    
    media = (p1 + p2*2 + p3*3)/6;
    printf("Media do estudante :%.1f\n", media);
    if (media >= 5.0) {
        printf("Aprovado");
    } else {
        printf("Reprovado");
    }
    return 0;
}
