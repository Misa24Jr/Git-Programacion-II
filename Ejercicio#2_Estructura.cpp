/*Hacer una estructura llamada alumno, el la cual se tendran los siguientes campos: 
    >Nombre
    >Edad 
    >Promedio

Pedir datos al usuario para tres alumnos, probar cual de los tres tiene el mejor promedio y
posteriormente imprimir los datos de ese alumno.
*/
#include<stdio.h>
#include<stdlib.h>

struct alumno{
    char nombre[30];
    char edad;
    int promedio;
}alumno[3];

/*struct promedio{
    float promedio[20];
}c_promedio[3];*/

int main(){
        printf("\t\t\t- TORNEO DE PROMEDIOS ESCOLARES -\n");
        int i;
    for(int i=0; i<3; i++){

        printf("\nIngrese el nombre del alumno #%d: ",i+1);
            scanf("%s",&alumno[i].nombre);

        printf("\nIngrese la edad del alumno #%d: ",i+1);
            scanf("%s",&alumno[i].edad);

        printf("\nIngrese el promedio del alumno #%d: ",i+1);
            scanf("%d",&alumno[i].promedio);
    }
    system("CLS");

        /*printf("\t\t\t- PROMEDIOS -\n");
    for(int i=0; i<3; i++){

        printf("\nIngrese el promedio del alumno #%d: ",i+1);
            scanf("%d",&c_promedio[i].promedio);
    }*/
    if(alumno[1].promedio>alumno[2].promedio && alumno[1].promedio>alumno[3].promedio){
            printf("\nDatos del alumno de mayor promedio: \n%s\n%s\n%d\n\n",alumno[2].nombre, alumno[2].edad,alumno[2].promedio);       
    }
    else if(alumno[2].promedio>alumno[1].promedio && alumno[2].promedio>alumno[3].promedio){
        printf("\nDatos del alumno de mayor promedio: \n%s\n%s\n%d\n\n",alumno[2].nombre,alumno[2].edad,alumno[2].promedio);
    }
    else{ if(alumno[3].promedio>alumno[1].promedio && alumno[3].promedio>alumno[2].promedio){
            printf("\nDatos del alumno de mayor promedio: \n%s\n%s\n%d\n\n",alumno[3].nombre,alumno[3].edad,alumno[3].promedio);
        }
    }
    return 0;
}