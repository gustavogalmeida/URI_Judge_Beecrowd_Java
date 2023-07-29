/*
Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que
C e se D for maior do que A, e a soma de C com D for maior que a soma
de A e B e se C e D, ambos, forem positivos e se a variável A for par
escrever a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".

Entrada
Quatro números inteiros A, B, C e D.

Saída
Mostre a respectiva mensagem após a validação dos valores.
 */
import java.util.Scanner;

public class URI1035_TesteDeSelecao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String abcd = scanner.nextLine();
        String[] arrayAbcd = abcd.split(" ");
        int a = Integer.parseInt(arrayAbcd[0]);
        int b = Integer.parseInt(arrayAbcd[1]);
        int c = Integer.parseInt(arrayAbcd[2]);
        int d = Integer.parseInt(arrayAbcd[3]);
        if (b>c && d>a && (c+d)>(a+b) && c>=0 && d>=0 && a%2==0){
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}
