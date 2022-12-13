import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        }

        public static void task1() {
            System.out.println("Задача 1");
            int[] f1 = new int[3];
            f1[0] = 1;
            f1[1] = 2;
            f1[2] = 3;

            double[] f2 = {1.57, 7.654, 9.986};

            byte[] f3 = {2, 5, 7};
        }

    public static void task2(){
        System.out.println("Задача 2");
        int[] f1 = {1, 2, 3};
        double[] f2 = {1.57, 7.654, 9.986};
        byte[] f3 = {2, 5, 7};

        for (int i = 0; i < f1.length; i++) {
            System.out.print(f1[i]);
            if (i !=f1.length -1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < f2.length; i++) {
            System.out.print(f2[i]);
            if (i !=f2.length -1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < f3.length; i++) {
            System.out.print(f3[i]);
            if (i !=f3.length -1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] f1 = {1, 2, 3};
        double[] f2 = {1.57, 7.654, 9.986};
        byte[] f3 = {2, 5, 7};

        for (int i = f1.length -1; i >= 0; i--) {
            System.out.print(f1 [i]);
            if (i !=0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = f2.length -1; i >= 0; i--) {
            System.out.print(f2 [i]);
            if (i !=0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = f3.length -1; i >= 0; i--) {
            System.out.print(f3 [i]);
            if (i !=0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] f1 = {1, 2, 3};
        for (int i = 0; i < f1.length; i++) {
            if (f1 [i] % 2 != 0) {
                f1[i] += 1;
            }
        }

        System.out.println(Arrays.toString(f1));
    }
}