public class Main {

    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println("Сложение двух чисел:");
        System.out.println("В двоичной системе 4 и 5: " + (4+5));
        System.out.println("В десятеричной системе 100 и 101: " + bins.sum("100", "101"));

        System.out.println("Произведение двух чисел:");
        System.out.println("В двоичной системе 4 и 5: " + 4*5);
        System.out.println("В десятеричной системе 100 и 101: " + bins.mult("100", "101"));
    }
}
