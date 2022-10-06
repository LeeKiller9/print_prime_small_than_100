public class Main {
    public static void main(String[] args) {
        System.out.println(2);
        int num = 3;
        boolean flag = true;
        while (num < 100) {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(num);
            } else {
                flag = true;
            }
            num++;
        }
    }
}