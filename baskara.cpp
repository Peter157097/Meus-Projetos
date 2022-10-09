#include <iostream>
#include <math.h>
#include <string>
#include <iomanip>

using namespace std;

int main()
{
   int escolha;
   int escolha2;
   double a;
   int b;
   int c;
   double delta;
   double deltaQ;
   double x1;
   double x2;
   double xv;
   double yv;
   setlocale(LC_ALL, "Portuguese");

   cout << "Escolha a funcao matematica\n[1]Quadratica, [2]Exponencial" << endl;
   cin >> escolha;
   switch(escolha){
       case 1:
           printf("Digite o valor De A\n");
           cin >> a;
           printf("Digite o valor De B\n");
           cin >> b;
           printf("Digite o valor De C\n");
           cin >> c;
           if (a>0){
            printf("Boca pra cima\n");
           }else{
               printf("Boca pra baixo\n");
           }
           delta = (b*b)-4*a*c;
           deltaQ = sqrt(delta);
           cout << "Esse sera o delta " << delta << endl;
           if (delta<0){
                printf("Nao tem raizes aq\n");
                xv = -b/(2*a);
                yv = -delta/(4*a);
                cout << "Vertices\n xv = " << xv << "\n yv = " << yv << endl;
           }else if (delta==0){
                printf("Tem uma raiz\n");
                x1 = (-b+deltaQ)/(2*a);
                cout << "A raiz e \n x1 = " << x1 << endl;
           }else{
                printf("Tem duas raizes\n");
                x1 = (-b+deltaQ)/(2*a);
                x2 = (-b-deltaQ)/(2*a);
                cout << "A raiz é \nx1 = " << x1 << "\nx2 = " << x2 << endl;
                xv = -b/(2*a);
                yv = -delta/(4*a);
                cout << "Vertices\nxv = " << xv << "\nyv = " << yv << endl;
           }
           break;
       case 2:
            cout << fixed << setprecision(1);
            printf("Digite o valor De A\n");
            cin >> a;
            printf("Digite o valor De X\n");
            cin >> xv;
            yv = pow(a,xv);
            cout << "Esse sera o Y\npar ordenado sera (" << xv << "," << yv << ")" << endl;
            cout << "Deseja calcular outro X? [1]sim, [2]não" << endl;
            cin >> escolha2;
            while (escolha2==1){
                printf("Digite o valor De X\n");
                cin >> xv;
                yv = pow(a,xv);
                cout << "Esse sera o Y\npar ordenado sera (" << xv << "," << yv << ")" << endl;
                cout << "Deseja calcular outro X? [1]sim, [2]não" << endl;
                cin >> escolha2;
            }
            break;
       default:
            printf("nao temos essa opção");
   }
    return 0;
}

