/*
Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
Entrada
O arquivo de entrada contém três valores com um dígito após o ponto decimal.

Saída
O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a uma das áreas descritas acima,
sempre com mensagem correspondente e um espaço entre os dois pontos e o valor. O valor calculado deve ser
apresentado com 3 dígitos após o ponto decimal.
 */
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        // LENDO STRING
        Scanner scanner = new Scanner (System.in);
        String str = scanner.nextLine();

        // TORNANDO A STRING INTEIRA UMA ARRAY SENDO CADA POSIÇÃO ENTRE ESPAÇOS
        String[] strArray = str.split(" ");

        // TRANSFORMANDO A ARRAY DE STRING EM ARRAY DE DOUBLE PARA REALIZAR CALCULOS
        double[] abc;
        abc = new double[3];
        abc[0] = Double.parseDouble(strArray[0]);
        abc[1] = Double.parseDouble(strArray[1]);
        abc[2] = Double.parseDouble(strArray[2]);

        // CALCULANDO E TRANSFORMANDO FORMAS GEMETRICAS
        double triangle = (abc[0]*abc[2])/2; // A = B*h / 2
        BigDecimal bigTriangle = new BigDecimal(triangle);
        bigTriangle = bigTriangle.setScale(3, RoundingMode.HALF_EVEN);

        double circle = 3.14159 * (Math.pow(abc[2], 2)); // A = PI * R^2
        BigDecimal bigCircle = new BigDecimal(circle);
        bigCircle = bigCircle.setScale(3, RoundingMode.HALF_EVEN);

        double trapezium = ((abc[0]+abc[1])*abc[2])/2; // A = ((B+b).h) / 2
        BigDecimal bigTrapezium = new BigDecimal(trapezium);
        bigTrapezium = bigTrapezium.setScale(3, RoundingMode.HALF_EVEN);

        double square = Math.pow(abc[1], 2); // A = B * h
        BigDecimal bigSquare = new BigDecimal(square);
        bigSquare = bigSquare.setScale(3, RoundingMode.HALF_EVEN);

        double rectangle = abc[0]*abc[1];
        BigDecimal bigRectangle = new BigDecimal(rectangle);
        bigRectangle = bigRectangle.setScale(3, RoundingMode.HALF_EVEN);

        // IMPRIMINDO AREAS
        System.out.println( "TRIANGULO: "+bigTriangle +
                            "\nCIRCULO: "+bigCircle +
                            "\nTRAPEZIO: "+bigTrapezium+
                            "\nQUADRADO: "+bigSquare+
                            "\nRETANGULO: "+bigRectangle);
    }
}
