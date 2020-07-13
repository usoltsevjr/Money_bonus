public class Bonus {
    public static void main(String[] args) {
        int balance = 100;
        int refill = 1200;
        if (refill <= 1000) {
            int new_balance = balance + refill;
            System.out.println("Your balance is " + new_balance);
        } else {
            int bonus = refill / 100;
            int new_balance = balance + refill + bonus;
            System.out.println("Your balance is " + new_balance);
        }
    }
}
