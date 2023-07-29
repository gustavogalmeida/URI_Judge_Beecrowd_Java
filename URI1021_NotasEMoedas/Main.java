/*
Leia um notas de ponto flutuante com duas casas decimais. Este notas representa um notas monetário.
A seguir, calcule o menor número de notas e moedas possíveis no qual o notas pode ser decomposto.
As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10,
0.05 e 0.01. A seguir mostre a relação de notas necessárias.

Entrada
O arquivo de entrada contém um notas de ponto flutuante N (0 ≤ N ≤ 1000000.00).

Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o notas inicial, conforme exemplo fornecido.

Obs: Utilize ponto (.) para separar a parte decimal.
 */

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double total = scanner.nextDouble();
        int notas = (int) total;
        int moedas = (int) ((total - notas)*100);
        int n100 = 0, n050 = 0, n020 = 0, n010 = 0, n005 = 0, n002 = 0;
        int m100 = 0, m050 = 0, m025 = 0, m010 = 0, m005 = 0, m001 = 0;
        while (notas >= 100){
             notas -= 100;
             n100++;
        }
        while (notas >= 50){
            notas -= 50;
            n050++;
        }
        while (notas >= 20){
            notas -= 20;
            n020++;
        }
        while (notas >= 10){
            notas -= 10;
            n010++;
        }
        while (notas >= 5){
            notas -= 5;
            n005++;
        }
        while (notas >= 2){
            notas -= 2;
            n002++;
        }
        while (notas >= 1){
            notas -= 1;
            m100++;
        }
        while (moedas >= 50){
            moedas -= 50;
            m050++;
        }
        while (moedas >= 25){
            moedas -= 25;
            m025++;
        }
        while (moedas >= 10){
            moedas -= 10;
            m010++;
        }
        while (moedas >= 5){
            moedas -= 5;
            m005++;
        }
        while (moedas >= 1){
            moedas -= 1;
            m001++;
        }

        System.out.println(
                    "NOTAS:\n" +
                    n100+" nota(s) de R$ 100.00\n"+
                    n050+" nota(s) de R$ 50.00\n"+
                    n020+" nota(s) de R$ 20.00\n"+
                    n010+" nota(s) de R$ 10.00\n"+
                    n005+" nota(s) de R$ 5.00\n"+
                    n002+" nota(s) de R$ 2.00\n"+
                    "MOEDAS:\n" +
                    m100+" moeda(s) de R$ 1.00\n"+
                    m050+" moeda(s) de R$ 0.50\n"+
                    m025+" moeda(s) de R$ 0.25\n"+
                    m010+" moeda(s) de R$ 0.10\n"+
                    m005+" moeda(s) de R$ 0.05\n"+
                    m001+" moeda(s) de R$ 0.01"
        );
    }
}
