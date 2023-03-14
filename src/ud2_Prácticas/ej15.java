package ud2_Prácticas;

public class ej15 {
    public static void main(String[] args) {
        Boolean flag = false;
        int contPrimos = 0, num = 2;
        while (contPrimos < 100) {
            for (int j = 2; j <= num / 2; j++) {
                if ((num % j) == 0) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                System.out.println(num);
                contPrimos++;
            }
            num++;
            flag = false;
        }
    }
}