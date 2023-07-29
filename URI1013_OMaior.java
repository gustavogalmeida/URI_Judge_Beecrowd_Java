/*
Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”.
Utilize a fórmula:

MaiorAB = (A+B+ABS*(A-B))/2

Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é necessário
para chegar no resultado esperado.

Entrada
O arquivo de entrada contém três valores inteiros.

Saída
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
 */
import java.io.IOException;
import java.util.Scanner;

public class URI1013_OMaior {
    public static void main (String[] args) throws IOException {

        int val1, val2, val3;

        Scanner scanner = new Scanner(System.in);

        val1 = scanner.nextInt();
        val2 = scanner.nextInt();
        val3 = scanner.nextInt();

        if (val1>val2 && val1>val3){
            System.out.println(val1 + " eh o maior");
        } else if (val2>val3 && val2>val1){
            System.out.println(val2 + " eh o maior");
        } else {
            System.out.println(val3 + " eh o maior");;
        }
    }
}
