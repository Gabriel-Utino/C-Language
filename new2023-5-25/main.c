/******************************************************************************

Structs com Menu

/*
 1. Defina uma estrutura que irá representar bandas de música.
    Essa estrutura deve ter o nome da banda, que tipo de música ela toca, o número de integrantes e em que posição do ranking essa banda está dentre as suas 5 bandas favoritas.
a
 2. Crie um looping para preencher as 3 estruturas de bandas criadas no exemplo passado.
   Após criar e preencher, exiba todas as informações das bandas/estruturas.
   
 3. Crie uma função que solicite estilo de música e exiba as bandas com esse tipo de música no seu ranking. Que função da string.h você usaria para comparar as strings que representam o tipo de banda?

 3. Crie uma função que peça ao usuário um número de 1 até 3.
   Em seguida, seu programa deve exibir informações da banda cuja posição no seu ranking é a que foi solicitada pelo usuário.

5. Crie uma função que peça o nome de uma banda ao usuário e diga se ela está entre suas bandas favoritas ou não.

6. Agora junte tudo e crie uma mega aplicação em que exibe um menu com as opções de preencher as estruturas e todas as opções das questões passadas.


*******************************************************************************/
#include <stdio.h>
#include <string.h>
#define TAMANHO 100   

typedef struct {
    char nome[20];
    char estilo[15];
    int tamanho;
    int rank;
} BANDA;

void leBanda (BANDA *v, int qt) {
  for(int i=0;i<qt;i++) {
    printf("\nNome da banda: ");   scanf("%s", v[i].nome);
    printf("Estilo musical: ");    scanf("%s", v[i].estilo);
    printf("Qt de integrantes: ") ;scanf("%d",&v[i].tamanho);
    printf("Posicao no ranking: ");scanf("%d",&v[i].rank);
  }
}

void exibeBanda (BANDA *exib, int qt) {
    for( int i=0;i <qt ; i++) {
        printf("\n\nBanda: %s",exib[i].nome);
        printf("\nEstilo: %s",exib[i].estilo);
        printf("\nIntegrantes: %d",exib[i].tamanho);
        printf("\nPosicao: %d",exib[i].rank);
    }
}

void procuraBanda (BANDA *busca, int qt) {
    char aux[50];
    int achou=0;

    printf("\nInforme o tipo de musica a buscar: ");
    scanf ("%s", aux);

    for(int i=0;i<qt;i++)    {
        if(strcmp(busca[i].estilo,aux)==0){
          achou=1;
          printf("\nBanda: %s",busca[i].nome);
        }
    }
    if(achou)  printf("\nBanda Encontrada !");
    else       printf("\nBanda Ausente !");
}

void menu () {
    BANDA v[TAMANHO];     //VETOR do tipo banda.
    int op = 0, quant=0;
    while (op != 9) {
        printf ("\n\n1. Listar Todas as Bandas");
        printf ("\n2. Pesquisar por  estilo ");
        printf ("\n3. Digitar as bandas ");
        printf ("\n4. Definir a qtde de bandas (max 100)");
        printf ("\n9. Encerrar");
        printf ("\nDigite sua opção: ");
        scanf ("%d", &op);
        if (op==1) {
             printf ("\n\nLISTAGEM DE TODAS AS BANDAS CADASTRADAS");
             exibeBanda (v,quant);
        }
        if (op==2)  procuraBanda (v,quant);
        if (op==3)  leBanda      (v,quant);
        if (op==4) {
            printf ("\n\nDigite a qtde de bandas: ");
            scanf ("%d", &quant);
        };
    }
}
int main() {
    menu();
    return 0;
}
