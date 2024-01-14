import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int repetitions = scanner.nextInt();
        scanner.nextLine();

        for (int i=0; i<repetitions; i++){
            String str = scanner.nextLine();
            String[] strSplit = new String[7];
            strSplit = str.split(" ");

            int nominator1 = Integer.parseInt(strSplit[0]);
            int operator1 = Integer.parseInt(strSplit[1]);
            int denominator1 = Integer.parseInt(strSplit[2]);
            int mainOperator = Integer.parseInt(strSplit[3]);
            int nominator2 = Integer.parseInt(strSplit[4]);
            int operator2 = Integer.parseInt(strSplit[5]);
            int denominator2 = Integer.parseInt(strSplit[6]);            
        }

    }
}