public class Main {
    public static void main(String[] args) {
        int balance = 300;
        int balanceTopUp = 3000;
        int bonus;
        if (balanceTopUp > 1000) {
            System.out.println(bonus = balanceTopUp / 100 * 1);
            System.out.println(balance=balance+balanceTopUp+bonus);
        } else {
            System.out.println(balance = balance + balanceTopUp);
        }
    }
}