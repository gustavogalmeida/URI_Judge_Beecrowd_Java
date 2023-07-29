/*
Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual
o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir
mostre o valor lido e a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

Saída
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias,
conforme o exemplo fornecido. Não esqueça de imprimir o fim de linha após cada linha, caso
contrário seu programa apresentará a mensagem: “Presentation Error”.
 */

import java.util.Scanner;

public class URI1018_Cedulas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();
        int n100=0, n50=0, n20=0, n10=0, n5=0, n2=0, n1=0;
        int total = val;
        while (val - 100 >= 0){
            n100++;
            val-=100;
        }
        while (val - 50 >= 0){
            n50++;
            val-=50;
        }
        while (val - 20 >= 0){
            n20++;
            val-=20;
        }
        while (val - 10 >= 0){
            n10++;
            val-=10;
        }
        while (val - 5 >= 0){
            n5++;
            val-=5;
        }
        while (val - 2 >= 0){
            n2++;
            val-=2;
        }
        while (val - 1 >= 0){
            n1++;
            val-=1;
        }
        System.out.println( total +"\n" +
                            n100 +" nota(s) de R$ 100,00\n" +
                            n50  +" nota(s) de R$ 50,00\n" +
                            n20  +" nota(s) de R$ 20,00\n" +
                            n10  +" nota(s) de R$ 10,00\n" +
                            n5   +" nota(s) de R$ 5,00\n" +
                            n2   +" nota(s) de R$ 2,00\n" +
                            n1   +" nota(s) de R$ 1,00");
    }
}
