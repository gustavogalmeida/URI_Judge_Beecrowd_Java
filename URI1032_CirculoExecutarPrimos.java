import java.util.ArrayList;
import java.util.Scanner;

public class URI1032_CirculoExecutarPrimos{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nPessoas = scanner.nextInt();
        scanner.nextLine();

        ArrayList<Integer> circulo = new ArrayList<>();
        ArrayList<Integer> primos = new ArrayList<>();
        
        // preenchendo o circulo de pessoas
        for (int i = 0; i < nPessoas; i++){
            circulo.add(i+1);
        }
        int tamanhoPrimos;
        int tamanhoCirculo = circulo.size();
        primos.add(2);
        primos.add(3);
        int j = 5;

        // preenchendo os primos
        do {
            boolean teste = testarPrimo(j);
            if (teste == true){
                primos.add(j);
            }
            tamanhoPrimos = primos.size();
            j++;
        } while (tamanhoPrimos < tamanhoCirculo);

        // executando as pessoas do circulo
        int ultimoExecutado = circulo.get(primos.get(0));
        circulo.remove(primos.get(0)); // primeira execução
        // demais execuções
        

        System.out.println(primos);
        System.out.println(circulo);

    }

    public static boolean testarPrimo(int n){
        for (int i = (n-1); i > 1; i--){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}