import java.io.IOException;
import java.util.Scanner;

public class somabin {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int[] num1 = new int[32];
        int[] num2 = new int[32];
        int n1 = scanner.nextInt();
        scanner.nextLine();
        int n2 = scanner.nextInt();
        scanner.nextLine();
        int j = 0;

        if (n1%2 == 1) {num1[0] = 1;} 
        for (int i = 32; i>=0; i--){
            int elev = (int) Math.pow(2, i);
            if (n1 >= elev){
                num1[i] = 1;
                n1 = n1 - elev;
            }
        }

        if (n2%2 == 1) {num2[0] = 1;} 
        for (int i = 32; i>=0; i--){
            int elev = (int) Math.pow(2, i);
            if (n2 >= elev){
                num2[i] = 1;
                n2 = n2 - elev;
            }
        }
        
        int[] resul = new int[32];
        for (int i = 31; i >= 0; i--){
            if (num1[i]==0 && num2[i]==0 || num1[i]==1 && num2[i]==1){
                resul[i] = 0;
            } else {
                resul[i] = 1;
            }
        }
        
        int resultado = 0;
        for (int i=31; i>=0; i--){
            if (resul[i]==1){
                int a = (int) Math.pow(2, i);
                resultado += a;
            }
        }
        System.out.println(resultado);
        
        //for (int i=31; i>=0; i--){
        //    System.out.print(resul[i]);
        //}

    }
}
