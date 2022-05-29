#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

//NEW = reserva memoria en el heap (zona de memoria dinamica)

void pedirNotas();
void mostrarNotas();
int numCalif, *calif;

int main(){	
	pedirNotas();
	mostrarNotas();
	
	delete[] calif;

	return 0;
}
void pedirNotas(){
	
	printf("Digite el numero de calificaciones: ");
		scanf("%i",&numCalif);
		
	calif = new int [numCalif];
	
	for(int i=0; i<numCalif; i++){
		printf("Ingrese una nota: ");
			scanf("%i",&calif[i]);
	}
}
void mostrarNotas(){
	printf("\n\nMostrando notas del usuario: \n");
		for(int i=0;i<numCalif;i++){
			 printf("%i\n",calif[i]);
		}
}