#include <iostream>
#include <stdio.h>
#include <conio.h> 

int n, pmayor=0, pmenor=0, max=0, min=10000000; 

struct atleta{
 char nombre[20];
 char pais [20];
 int medallas;
} atletas[10000]; 

int main(){
 
 printf("Numero de atletas:\n");
 scanf("%d" , &n);
 
 for(int i=1; i<=n; i++){
 printf("\n");
 printf("Nombre:\n");
 scanf("%s" , atletas[i].nombre);
 printf("Pais:\n");
 scanf("%s" , atletas[i].pais);
 printf("Numero de medallas:\n");
 scanf("%d" , &atletas[i].medallas);
 printf("\n");
 
 if(atletas[i].medallas>max){
 max=atletas[i].medallas;
 pmayor=i;
 }
 if(atletas[i].medallas<min){
 min=atletas[i].medallas;
 pmenor=i;
 }
}
 printf("--------------------------------------------\n");
 printf("Datos del atleta con mas medallas: \n");
 printf("Nombre y Pais: %s, %s \n" , atletas[pmayor].nombre, atletas[pmayor].pais);
 printf("--------------------------------------------\n");
 
 getch();
 return 0;
}