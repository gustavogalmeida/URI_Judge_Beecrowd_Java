/*
Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas
por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas
efetuadas, informar o total a receber no final do mês, com duas casas decimais.

Entrada
O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores de dupla precisão
(double) com duas casas decimais, representando o salário fixo do vendedor e montante total das
vendas efetuadas por este vendedor, respectivamente.

Saída
Imprima o total que o funcionário deverá receber, conforme exemplo fornecido
*/

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class URI1009_SalarioComBonus {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        // salario fixo
        double salarioFixo = Double.parseDouble(scanner.nextLine());
        BigDecimal bigSalario = new BigDecimal(salarioFixo).setScale(2, RoundingMode.HALF_EVEN);
        // Total vendas
        double totalVendas = Double.parseDouble(scanner.nextLine());
        BigDecimal bigVendas = new BigDecimal(totalVendas).setScale(2, RoundingMode.HALF_EVEN);
        // salario total
        double comissao = (totalVendas*0.15);
        double total = salarioFixo+comissao;
        BigDecimal bigTotal = new BigDecimal(total).setScale(2, RoundingMode.HALF_EVEN);
        // SAIDA
        System.out.println("TOTAL = R$ "+ bigTotal);
    }
}
