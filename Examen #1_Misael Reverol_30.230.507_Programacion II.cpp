#include<stdio.h>
#include<math.h>
//Variables Globales
float A,B,C,x1,x2;  //Case #1
float PI= 3.14,radio=0;  //Case #2
float Xo, Vot, a,t; //Case #3
//Funciones
//----------//----------//---Case #1---//----------//----------//
void pedirValor_ABC(){
    printf("Digite el valor de A: ");
        scanf("%f",&A);
    
    printf("Digite el valor de B: ");
        scanf("%f",&B);

    printf("Digite el valor de C: ");
        scanf("%f",&C);
}
float funPolinomio_x1(float A, float B, float C){
    float raiz1=0;

    raiz1 = (-B+sqrt(B*B-4*A*C))/(2*A);
    
    return raiz1;
}
float funPolinomio_x2(float A, float B, float C){
    float raiz2=0;

    raiz2 = x2 = (-B-sqrt(B*B-4*A*C))/(2*A);

    return raiz2;
}
//////////////////////////////////////////////////////////////////
//----------//----------//---Case #2---//----------//----------//
void pedirRadio(){
    printf("Digite el valor del Radio: ");
        scanf("%f",&radio);
}
float funVolumen_Esfera(float radio){
    float volumen = 0;
    if(radio>0){

        volumen = ((1.3333333333)*(PI*pow(radio,3)));

    }
    else{

        printf("El valor que digito no es valido,'Por lo tanto'");

    }
    return volumen;
}
//////////////////////////////////////////////////////////////////
//----------//----------//---Case #3---//----------//----------//
void pedirDatos_MRUV(){
    printf("Digite el valor de Xo: ");
        scanf("%f",&Xo);
    printf("Digite el valor de Vot: ");
        scanf("%f",&Vot);
    printf("Digite el valor de a: ");
        scanf("%f",&a);
    printf("Digite el valor de t: ");
        scanf("%f",&t);
}
float funMRUV(float Xo, float Vot, float a, float t){
    float Xf=0;

    Xf = (Xo + Vot + (a*(pow(t,2))/2));

    return Xf;
}
////////////////////////////////////////////////////////////////////

int main(){
    int opcion;

    printf("\t-----Menu de opciones-----");
    printf("\n1. Calcular la raices de un polinomio de 2do Grado");
    printf("\n2. Calular el volumen de una esfera");
    printf("\n3. Calcular el desplazamiendo de un movil en MRUV");
    printf("\n4. Salir");
    printf("\nLa opcion: ");
        scanf("%i",&opcion);

    switch(opcion){
        case 1: 
            pedirValor_ABC();
            
            printf("El valor de X1: %.2f",funPolinomio_x1(A,B,C));
            printf("\nEl valor de X2: %.2f",funPolinomio_x2(A,B,C));

        break;

        case 2:
            pedirRadio();

            printf("\nEl Volumen de la Esfera es: %.2f",funVolumen_Esfera(radio));
        break;

        case 3:
            pedirDatos_MRUV();

            printf("El desplazamiendo es: %.2f",funMRUV(Xo,Vot,a,t));
        break;
        
        case 4: break;
        
        default: printf("La opcion no es valida");
    }
    
    return 0;
}
