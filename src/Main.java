public class Main {
    public static void main(String[] args) {

        int start = 100;
        int recharge = 10;
        int bonus = recharge / 100;
        int total1 = start + recharge + bonus;
        int total2 = start + recharge;

        if (recharge > 1000) {
            System.out.println("Сумма бонуса:" + bonus);
            System.out.println("Итоговый счет:" + total1);
        } else {
            System.out.println("Итоговый счет:" + total2);
            System.out.println("Сумма бонуса: 0");
        }

    }
}