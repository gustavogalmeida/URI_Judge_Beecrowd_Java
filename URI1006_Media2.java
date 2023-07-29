/*
Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno.
A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5.
Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

Entrada
O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão (double).

Saída
Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 1 dígito após o ponto decimal e com
um espaço em branco antes e depois da igualdade. Assim como todos os problemas, não esqueça de imprimir o fim de
linha após o resultado, caso contrário, você receberá "Presentation Error".
*/

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class URI1006_Media2 {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        double a = Double.parseDouble(keyboard.nextLine());
        double b = Double.parseDouble(keyboard.nextLine());
        double c = Double.parseDouble(keyboard.nextLine());
        double media = ((a*2) + (b*3) + (c*5))/10;
        BigDecimal bigA = new BigDecimal(a).setScale(1, RoundingMode.HALF_EVEN);
        BigDecimal bigB = new BigDecimal(b).setScale(1, RoundingMode.HALF_EVEN);
        BigDecimal bigC = new BigDecimal(c).setScale(1, RoundingMode.HALF_EVEN);
        BigDecimal bigMedia = new BigDecimal(media).setScale(1, RoundingMode.HALF_EVEN);
        System.out.println("MEDIA = " + bigMedia);
    }
}
