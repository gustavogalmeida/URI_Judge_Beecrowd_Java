/*
Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 notas de um aluno.
A seguir, calcule a média do aluno, sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5
(A soma dos pesos portanto é 11). Assuma que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

Entrada
O arquivo de entrada contém 2 valores com uma casa decimal cada um.

Saída
Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 5 dígitos após o ponto decimal
e com um espaço em branco antes e depois da igualdade. Utilize variáveis de dupla precisão (double) e como
todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá
"Presentation Error".
*/
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class URI1005_Media1 {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        double a = Double.parseDouble(keyboard.nextLine());
        double b = Double.parseDouble(keyboard.nextLine());
        BigDecimal bigA = new BigDecimal(a).setScale(1, RoundingMode.HALF_EVEN);
        BigDecimal bigB = new BigDecimal(b).setScale(1, RoundingMode.HALF_EVEN);
        double media = ((a*3.5)+(b*7.5))/11;
        BigDecimal bigSoma = new BigDecimal (media).setScale(5, RoundingMode.HALF_EVEN);
        System.out.println("MEDIA = " + bigSoma);
    }
}
