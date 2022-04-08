//Realizar un programa que lea un arreglo de estructuras los datos de N empleados de la empresa y que imprima los datos del empleado con menor y mayor salario.

#include <stdio.h>
#include <stdlib.h>

struct Empleados{
	char nombre[20];
	float salario;
}emple[100];

main () {
	int n_empleados,pm=0,pM=0;
	float mayor=0,menor=100.00;
	printf ("Ingrese el numero de empleados:");
	scanf ("%d",&n_empleados);
	
	for(int i=0;i<n_empleados;i++){
		printf ("Ingrese el nombre:");
		scanf ("%s",&emple[i].nombre);
		printf ("Ingrese el salario:");
		scanf("%f",&emple[i].salario);
		if(emple[i].salario > mayor) {
			mayor = emple[i].salario;
			pM=i;
		}	
		if(emple[i].salario < menor){
			menor=emple[i].salario;
			pm=i;
		}
		printf ("\n");
	}
	printf ("\n Datos del empleado con mejor salario");
	printf ("\n Nombre:%s",emple[pM].nombre);
	printf ("\n Salario:%f",emple[pM].salario);
	printf ("\n Datos del empleado con menor salario:");
	printf ("\n Nombre:%s",emple[pm].nombre);
	printf ("\n Salario:%f",emple[pm].salario);
}