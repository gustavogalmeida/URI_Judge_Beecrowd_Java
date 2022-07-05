/*
Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1,
o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

Entrada
O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois inteiros
e um valor com 2 casas decimais.

Saída
A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os dois
pontos e um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.
 */

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        // atributos
        int p1Cod, p2Cod, p1Qtd, p2Qtd;
        double p1Valor, p2Valor, total, total1, total2;

        // entradas
        Scanner scanner = new Scanner(System.in);
        String p1 = scanner.nextLine();
        String p2 = scanner.nextLine();

        // quebrando primeira string
        String [] p1Split = p1.split(" ");
        p1Cod = Integer.parseInt(p1Split[0]);
        p1Qtd = Integer.parseInt(p1Split[1]);
        p1Valor = Double.parseDouble(p1Split[2]);

        //quebrando segunda string
        String [] p2Split = p2.split(" ");
        p2Cod = Integer.parseInt(p2Split[0]);
        p2Qtd = Integer.parseInt(p2Split[1]);
        p2Valor = Double.parseDouble(p2Split[2]);

        // somando totais e imprimindo
        total1 = p1Qtd*p1Valor;
        total2 = p2Qtd*p2Valor;
        BigDecimal bigTotal = new BigDecimal(total1+total2).setScale(2, RoundingMode.HALF_EVEN);
        System.out.println("VALOR A PAGAR: R$ "+bigTotal);
    }
}
