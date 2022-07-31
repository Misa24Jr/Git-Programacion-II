//Misael Reverol
//CI: 30.230.507
//Estructura Dinamica De Datos 
#include <iostream>
#include <conio.h>

struct Nodo
{
	int dato;
	Nodo *der;
	Nodo *izq;
};


void menu();
Nodo *crearNodo(int);
void insertarNodo(Nodo *&,int);
void preOrden(Nodo *);
void inOrden(Nodo *);
void postOrden(Nodo *);

Nodo *arbol = NULL;

int main()
{
	menu();
	
	getch();
	return 0;
	
}


void menu()
{
	int dato,opcion,contador=0;
	
	do
	{
		printf("\tMENU\n");
		printf("1. Insertar un nuevo nodo\n");
		printf("2. Recorrer el arbol en PreOrden\n");
		printf("3. Recorrer el arbol en InOrden\n");
		printf("4. Recorrer el arbol en PostOrden\n");
		printf("5. Salir\n");
		printf("Opcion: ");
		scanf("%d",&opcion);
		
		switch(opcion)
		{
			case 1:
				printf("\nDigite un numero:");
				scanf("%d",&dato);
				insertarNodo(arbol,dato);
				printf("\n");
				system("pause");
				break;
			case 2:
			{
				printf("\nRecorrido en PreOrden:");
				preOrden(arbol);
				printf("\n\n");
				system("pause");
				break;
			}
			case 3:
			{
				printf("\nRecorrido en InOrden:");
				inOrden(arbol);
				printf("\n\n");
				system("pause");
				break;
			}
				case 4:
			{
				printf("\nRecorrido en PostOrden:");
				postOrden(arbol);
				printf("\n\n");
				system("pause");
				break;
			}			
			
		}
		system("cls");
	}while(opcion != 5);
}


Nodo *crearNodo(int n)
{
	Nodo *nuevo_nodo = new Nodo();
	
	nuevo_nodo->dato = n;
	nuevo_nodo->der = NULL;
	nuevo_nodo->izq = NULL;
	
	return nuevo_nodo;
}


void insertarNodo(Nodo *&arbol,int n)
{
	if(arbol==NULL)
	{
		Nodo *nuevo_nodo = crearNodo(n);
		arbol = nuevo_nodo;
	}
	else
	{
		int valorRaiz = arbol->dato; 
		if(n<valorRaiz)
		{
			insertarNodo(arbol->izq,n);
		}
		else
		{
			insertarNodo(arbol->der,n);
		}
	}
}

void preOrden(Nodo *arbol)
{
	if(arbol == NULL)
	{
		return;
	}
	else
	{
		printf("%d - ",arbol->dato);
		preOrden(arbol->izq);
		preOrden(arbol->der);
	}
}


void inOrden(Nodo *arbol)
{
	if(arbol == NULL)
	{
		return;
	}
	else
	{
		inOrden(arbol->izq);
		inOrden(arbol->der);
		printf("%d - ",arbol->dato);
	}
}


void postOrden(Nodo *arbol)
{
		if(arbol == NULL)
	{
		return;
	}
	else
	{
		postOrden(arbol->izq);
		postOrden(arbol->der);
		printf("%d - ",arbol->dato);
	}
}
