#include <iostream>
#include <math.h>
#include <string>
#include <iomanip>


using namespace std;

int main()
{
   double kg;
   double libras;
   double metros;
   double pes;
   int escolha;
   int escolha2;
   cout << "Digite oque vc quer calcular" << endl;
   cout << "[1]Altura [2]Peso" << endl;
   cin >> escolha;
   switch(escolha){
    case 1:
        cout << "Voce deseja calcular metros em pes? ou pes em metros" << endl;
        cout << "Digite qual vc quer calcular" << endl;
        cout << "[1]pes [2]metros" << endl;
        cin >> escolha2;
        switch(escolha2){
         case 1:
            cout << "Digite sua altura em metros" << endl;
            cin >> metros;
            pes = metros*3.28084;
            cout << fixed << setprecision(1);
            cout << "Essa sera sua altura em pes " << pes << endl;
            break;
         case 2:
            cout << "Digite sua altura em pes" << endl;
            cin >> pes;
            metros = pes*0.3048;
            cout << fixed << setprecision(2);
            cout << "Essa sera sua altura em metros " << metros << endl;
            break;
         default:
            cout << "palavra invalida";
        }
        break;
    case 2:
        cout << "Voce deseja calcular kilos em libra? ou libra em kilos" << endl;
        cout << "Digite qual vc quer calcular" << endl;
        cout << "[1]libra [2]kilos" << endl;
        cin >> escolha2;
        switch(escolha2){
         case 1:
             cout << "Digite o peso em kilos" << endl;
             cin >> kg;
             libras = kg*2.20462;
             cout << fixed << setprecision(1);
             cout << "Esse sera o seu peso em libras " << libras << endl;
             break;
         case 2:
            cout << "Digite o peso em libra" << endl;
             cin >> libras;
             kg = libras*0.453592;
             cout << fixed << setprecision(1);
             cout << "Esse sera o seu peso em kilos " << kg << endl;
             break;
        }
  }
}
