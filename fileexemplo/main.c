/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

FILE *arq;
int quantiLinhas=10;
char nomeArq[20] = "exenplo";

void lerArquivo() {
    arq = fopen(nomeArq, "r");
    
    char linha[105], *result;
    int i=5;
    while(!feof(arq)) {
        result = fgets(linha, 105, arq);
        if(result) printf("Linha %d > %s", i, linha);
        i++;
    }
    fclose(arq);
}

void gravarArquivo() {
    //int i, result;
    arq = fopen(nomeArq, "w");
    
    for(int i = 1; i<= quantiLinhas ; i++) {
        fprintf(arq,"Conteudo da Linha %d\n", i);
    }
    fclose(arq);
}


void main()
{
    printf("\nGerando o arquivo...");
    gravarArquivo();
    printf("\nGerando o arquivo...\n");
    lerArquivo();
    
    
    
}
