/*
Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

Obs.: apenas para facilitar o cálculo, considere td ano com 365 dias e td mês com 30 dias.
Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360,
363 ou 364. Este é apenas um exercício com objetivo de testar raciocínio matemático simples.

Entrada
O arquivo de entrada contém um valor inteiro.

Saída
Imprima a saída conforme exemplo fornecido.
 */

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int dias = scanner.nextInt();
        int ano = 0, mes = 0, dia = 0;
        while (dias>=365){
            dias -= 365;
            ano++;
        }
        while (dias>=30){
            dias -= 30;
            mes++;
        }
        dia = dias;
        System.out.println(ano+" ano(s)\n"+mes+" mes(es)\n"+dia+" dia(s)");
    }
}
