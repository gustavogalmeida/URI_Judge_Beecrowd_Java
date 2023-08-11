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

        int j = 2; // primeiro primo

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
        int contador = 0;
        int executado = 0;
        while (tamanhoCirculo > 1){

            int posicao = executado+primos.get(contador);
            
            if (posicao > circulo.size()){
                executado = posicao%tamanhoCirculo;
                circulo.remove(executado);
            } else {
                executado = posicao;
                circulo.remove(executado);
            }

            tamanhoCirculo = circulo.size();
            contador +=1;
        }

        //System.out.println(primos);
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