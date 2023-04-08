public class Main {
    public static void main(String[] args) {
        // Задание 2.
        int balance = 100;
        int popolnenie = 3000;
        int bonus = (balance + popolnenie - 1000) / 100;
        int itogo = balance + popolnenie;
        int itogob = balance + popolnenie + bonus;

        if( popolnenie < 1000 ){
            System.out.print("Бонусов нет, итоговая сумма на счету клиента - " + itogo);
        }else{
            System.out.print("Бонус равен - " + bonus + " рублям, итоговая сумма на счету клиента — " + itogob);
        }
    }
}