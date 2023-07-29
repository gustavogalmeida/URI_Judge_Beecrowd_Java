/*
Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1)
e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula, segundo a fórmula:

Distancia = raiz de ((x1 - x2)^2 + (y1 - y2)^2)

Entrada
O arquivo de entrada contém duas linhas de dados. A primeira linha contém dois valores de ponto
flutuante: x1 y1 e a segunda linha contém dois valores de ponto flutuante x2 y2.

Saída
Calcule e imprima o valor da distância segundo a fórmula fornecida, com 4 casas após o ponto decimal.
 */
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class URI1015_DistanciaDoisPontos {
    public static void main(String[] args) {
        String ponto1, ponto2;
        Scanner scanner = new Scanner(System.in);
        ponto1 = scanner.nextLine();
        ponto2 = scanner.nextLine();
        String[] ponto1Split = ponto1.split(" ");
        String[] ponto2Split = ponto2.split(" ");
        Double x1 = Double.parseDouble(ponto1Split[0]);
        Double y1 = Double.parseDouble(ponto1Split[1]);
        Double x2 = Double.parseDouble(ponto2Split[0]);
        Double y2 = Double.parseDouble(ponto2Split[1]);
        Double d1 = (x1 - x2);
        d1 = Math.pow(d1, 2);
        Double d2 = (y1 - y2);
        d2 = Math.pow(d2, 2);
        Double distancia = d1 + d2;
        distancia = Math.sqrt(distancia);
        BigDecimal bigDistancia = new BigDecimal(distancia);
        bigDistancia = bigDistancia.setScale(4, RoundingMode.HALF_EVEN);
        System.out.println(bigDistancia);
    }
}
