#include <iostream>
#include <math.h>

using namespace std;

int main()
{
   int a;
   int b;
   int c;
   double delta;
   double deltaQ;
   double x1;
   double x2;
   double xv;
   double yv;
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
        cout << "A raiz é \n x1 = " << x1 << "\n x2 = " << x2 << endl;
        xv = -b/(2*a);
        yv = -delta/(4*a);
        cout << "Vertices\n xv = " << xv << "\n yv = " << yv << endl;
   }
}

