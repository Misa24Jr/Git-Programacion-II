/*Hacer una estructura llamada corredor, en la cual se tendrán los siguientes campos: Nombre, Edad,
sexo, club, pedir datos al usuario para un corredor y así una categoría de competición:

1- Juvenil <= 18 años
2- Señor <= 40 años
3- Veterano > 40 años
*/


#include <stdio.h>
#include <stdlib.h>


struct Corredor{
char Nombre[30];
char Edad[20];
char Sexo [20];
char Club [30];
char Categoria [20];
}competidores[20];

int main()
{
    printf("\t\t\t- COPA DE ATLETISMO -\n");
    for(int i=0; i<2; i++)
    {

        printf("\nIngrese el Nombre del competidor #%d: ", i+1);
        gets(competidores[i].Nombre);

        printf("\nIngrese la Categoria a competir\n", i+1);
        printf("1- Juvenil <= 18 años\n");
        printf("2- Señor <= 40 años\n");
        printf("3- Veterano > 40 años\n: ");
        gets(competidores[i].Categoria);

        printf("Ingrese la Edad del competidor #%d: ", i+1);
        gets(competidores[i].Edad);

        printf("Ingrese el Sexo del competidor #%d: ", i+1);
        gets(competidores[i].Sexo);

        printf("Ingrese el Club del competidor #%d: ", i+1);
        gets(competidores[i].Club);

        printf("\n");
        system("CLS");
    }

    for(int i=0; i<2; i++)
    {
        printf("\nDatos del Competidor: #%d", i+1);
        printf("\nNombre: %s", competidores[i].Nombre);
        printf("\nCategoria: %s", competidores[i].Categoria);
        printf("\nEdad: %s", competidores[i].Edad);
        printf("\nSexo: %s", competidores[i].Sexo);
        printf("\nClub: %s\n", competidores[i].Club);

    }


system ("PAUSE");
return 0;
}