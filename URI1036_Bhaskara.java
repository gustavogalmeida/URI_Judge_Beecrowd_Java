/* 
Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. 
Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel 
calcular”, caso haja uma divisão por 0 ou raiz de numero negativo.

Entrada
Leia três valores de ponto flutuante (double) A, B e C.

Saída
Se não houver possibilidade de calcular as raízes, apresente a mensagem 
"Impossivel calcular". Caso contrário, imprima o resultado das raízes com 
5 dígitos após o ponto, com uma mensagem correspondente conforme exemplo 
abaixo. Imprima sempre o final de linha após cada mensagem. */

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1036_Bhaskara {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();
        float delta = (float) Math.pow(b, 2) - 4 * a * c;
        if (delta <= 0 || a == 0){
            System.out.println("Impossivel calcular");
        } else {
            float x1 = (float) (-b + Math.sqrt(delta)) / (2 * a);
            float x2 = (float) (-b - Math.sqrt(delta)) / (2 * a);
            DecimalFormat df = new DecimalFormat("#0.00000");
            String x1df = df.format(x1);
            String x2df = df.format(x2);
            System.out.println("R1 = " + x1df);
            System.out.println("R2 = " + x2df);    
        }    
    }
}
