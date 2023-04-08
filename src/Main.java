public class Main {
    public static void main(String[] args) {
        // Task 2.
        int balance = 100;
        int replenishment = 3000;
        int bonus = (balance + replenishment - 1000) / 100;
        int result = balance + replenishment;
        int resultb = balance + replenishment + bonus;

        if (replenishment < 1000) {
            System.out.print("Бонусов нет, итоговая сумма на счету клиента - " + result);
        } else {
            System.out.print("Бонус равен - " + bonus + " рублям, итоговая сумма на счету клиента — " + resultb);
        }
    }
}
