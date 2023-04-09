public class Main {
    public static void main(String[] args) {
        // Task 2.
        int balance = 100;
        int replenishment = 1100;
        int bonus = replenishment / 100;
        int totalWithoutBonuses = balance + replenishment;
        int totalWithBonuses = balance + replenishment + bonus;

        if (replenishment < 1000) {
            System.out.print("Бонусов нет, итоговая сумма на счету клиента - " + totalWithoutBonuses);
        } else {
            System.out.print("Бонус равен - " + bonus + " рублям, итоговая сумма на счету клиента — " + totalWithBonuses + " рублей.");
        }
    }
}
