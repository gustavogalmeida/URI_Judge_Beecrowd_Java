/*
Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em Km)
e o total de combustível gasto (em litros).

Entrada
O arquivo de entrada contém dois valores: um valor inteiro X representando a distância total
percorrida (em Km), e um valor real Y representando o total de combustível gasto, com um dígito após o ponto decimal.

Saída
Apresente o valor que representa o consumo médio do automóvel com 3 casas após a vírgula,
seguido da mensagem "km/l".
 */

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int distancia;
        double combustivel, consumo;
        Scanner scanner = new Scanner(System.in);
        distancia = scanner.nextInt();
        combustivel = scanner.nextDouble();
        consumo = distancia/combustivel;
        BigDecimal bigConsumo = new BigDecimal(consumo);
        bigConsumo = bigConsumo.setScale(3, RoundingMode.HALF_EVEN);
        System.out.println(bigConsumo + " km/l");
    }
}
