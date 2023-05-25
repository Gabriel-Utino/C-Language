/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>
int main()
{
    int i = 10;
    int j = 20;
    double x = 7.0;
    double y = 6.0;
    int result;
    
    result = !(x + 4.0) + !!y + !!!i + !!i + 12;
    printf("%d", result);
    
    printf("\n!(x + 4.0) :%d", !(x + 4.0));
    
    printf("\n! :%d", !0);
    printf("\n!! :%d", !!0);
    printf("\n!!! :%d", !!!0);
    printf("\n!!!! :%d", !!!!0);
    printf("\n!!!!! :%d", !!!!!0);
    printf("\n! :%d", !-1);
    printf("\n!! :%d", !!-2);
    printf("\n!!! :%d", !!!-3);
    printf("\n!!!! :%d", !!!!-4);
    printf("\n!!!!! :%d", !!!!!-5);
    printf("\n! :%d", !6);
    printf("\n!! :%d", !!7);
    printf("\n!!! :%d", !!!8);
    printf("\n!!!! :%d", !!!!9);
    printf("\n!!!!! :%d", !!!!!47);
}