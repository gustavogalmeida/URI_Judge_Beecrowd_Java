/*
Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica,
e informe-o expresso no formato horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos,
conforme exemplo fornecido.
*/

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int hora = 0, minuto = 0, segundo = 0;
        while (n>=60){
            n -= 60;
            minuto++;
        }
        segundo = n;
        while (minuto >= 60){
            minuto -= 60;
            hora++;
        }
        System.out.println(hora+":"+minuto+":"+segundo);
    }
}
