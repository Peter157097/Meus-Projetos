package estudo_testezin;

import java.util.Scanner;

public class jdv {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        final int tam = 9;
        int a[], j, j2 , i , laco;
        a = new int [tam];
        System.out.println("[0] [1] [2]");
        System.out.println("[3] [4] [5]");
        System.out.println("[6] [7] [8]");
        System.out.println("Jogue assim: PLAYER A = 1 e PLAYER B = 2");
        for(laco=0;laco<tam;laco++) {
            System.out.println("Digite a posicao A");
            j = ler.nextInt();
            System.out.println("Digite a posicao B");
            j2 = ler.nextInt();
            a[j] = 1;
            a[j2] = 2;
            for(i=0;i<tam;i++) {
                if(i==2) {
                    System.out.println(" ["+a[i]+"] ");
                }else if(i==5) {
                    System.out.println(" ["+a[i]+"] ");
                }else {
                    System.out.print(" ["+a[i]+"] ");
                }
                
                
            }
            System.out.println("");
            //TESTE DE GANHAR TIMA A
                if(a[0]==1) {
                    if(a[1]==1) {
                        if(a[2]==1) {
                            System.out.println("TIME A GANHOU");
                            // [] [] []
                            break;
                        }
                }
                if(a[0]==1) {
                        if(a[4]==1) {
                            if(a[8]==1) {
                                System.out.println("TIME A GANHOU");
                                // []
                                //   []
                                //      []
                                break;
                            }
                    }
                }
                if(a[0]==1) {
                    if(a[3]==1) {
                        if(a[6]==1) {
                            System.out.println("TIME A GANHOU");
                            //[]
                            //[]
                            //[]
                            break;
                        }
                }
                }
                if(a[1]==1) {
                    if(a[4]==1) {
                        if(a[7]==1) {
                            System.out.println("TIME A GANHOU");
                            //_[]
                            //_[]
                            //_[]
                            break;
                        }
                }
                }
                if(a[2]==1) {
                    if(a[5]==1) {
                        if(a[8]==1) {
                            System.out.println("TIME A GANHOU");
                            //__[]
                            //__[]
                            //__[]
                            break;
                        }
                }
                }
                if(a[2]==1) {
                    if(a[4]==1) {
                        if(a[6]==1) {
                            System.out.println("TIME A GANHOU");
                            //          []
                            //      []
                            //  []
                            break;
                        }
                }
                }
                if(a[3]==1) {
                    if(a[4]==1) {
                        if(a[5]==1) {
                            System.out.println("TIME A GANHOU");
                            //
                            //[] [] []
                            break;
                        }
                }
                }
                if(a[6]==1) {
                    if(a[7]==1) {
                        if(a[8]==1) {
                            System.out.println("TIME A GANHOU");
                            //
                            //
                            //[] [] []
                            break;
                        }
                }
            }
           // FIM DO TESTE A
              //TESTE DE GANHAR TIMA B
                if(a[0]==2) {
                    if(a[1]==2) {
                        if(a[2]==2) {
                            System.out.println("TIME B GANHOU");
                            // [] [] []
                            break;
                        }
                }
                if(a[0]==2) {
                        if(a[4]==2) {
                            if(a[8]==2) {
                                System.out.println("TIME B GANHOU");
                                // []
                                //   []
                                //      []
                                break;
                            }
                    }
                }
                if(a[0]==2) {
                    if(a[3]==2) {
                        if(a[6]==2) {
                            System.out.println("TIME B GANHOU");
                            //[]
                            //[]
                            //[]
                            break;
                        }
                }
                }
                if(a[1]==2) {
                    if(a[4]==2) {
                        if(a[7]==2) {
                            System.out.println("TIME B GANHOU");
                            //_[]
                            //_[]
                            //_[]
                            break;
                        }
                }
                }
                if(a[2]==2) {
                    if(a[5]==2) {
                        if(a[8]==2) {
                            System.out.println("TIME B GANHOU");
                            //__[]
                            //__[]
                            //__[]
                            break;
                        }
                }
                }
                if(a[2]==2) {
                    if(a[4]==2) {
                        if(a[6]==2) {
                            System.out.println("TIME B GANHOU");
                            //          []
                            //      []
                            //  []
                            break;
                        }
                }
                }
                if(a[3]==2) {
                    if(a[4]==2) {
                        if(a[5]==2) {
                            System.out.println("TIME B GANHOU");
                            //
                            //[] [] []
                            break;
                        }
                }
                }
                if(a[6]==2) {
                    if(a[7]==2) {
                        if(a[8]==2) {
                            System.out.println("TIME B GANHOU");
                            //
                            //
                            //[] [] []
                            break;
                        }
                }
            }
           // FIM DO TESTE B
        }
    }

}
}
}
