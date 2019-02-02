package oop_Test.encapsulation;

public class Bancomat {
    final int volume = 100;
    private int money10;
    private int money20;
    private int money50;

    public Bancomat(int money10, int money20, int money50) {
        this.money10 = money10;
        this.money20 = money20;
        this.money50 = money50;
    }

    public void getIhformation() {
        System.out.println(this.money10 + " " + this.money20 + " " + this.money50);
    }

    public void setMoney10(int money10) {
        if (this.money10 + money10 > volume) {
            System.out.println(" Ячейка может вместить только :" + (volume - this.money10) + " У вас остается " + (money10 - (volume - this.money10)));
            this.money10 = volume;
        } else
            this.money10 += money10;
    }

    public void setMoney20(int money20) {
        if (this.money20 + money20 > volume) {
            System.out.println(" Ячейка может вместить только :" + (volume - this.money20) + " У вас остается " + (money20 - (volume - this.money20)));
            this.money20 = volume;
        } else
            this.money20 += money20;
    }

    public void setMoney50(int money50) {
        if (this.money50 + money50 > volume) {
            System.out.println(" Ячейка может вместить только :" + (volume - this.money50) + " У вас остается " + (money50 - (volume - this.money50)));
            this.money50 = volume;
        } else
            this.money50 += money50;
    }

    public boolean takeMoney(int summa) {
        boolean result = false;
        int x10 = 0;
        int x20 = 0;
        int x50 = 0;
        int summa1 = summa;

        while (summa1 >= 50) {
            summa1 -= 50;
            x50++;
        }
        while (summa1 >= 20) {
            summa1 -= 20;
            x20++;
        }
        while (summa1 >= 10) {
            summa1 -= 10;
            x10++;
        }

        if (x50 * 50 + x20 * 20 + x10 * 10 == summa) {
            System.out.println("Операция выполнена успешно");
            System.out.println("10 " + x10 + " 20 " + x20 + " 50 " + x50);
            this.money50-=x50;
            this.money20-=x20;
            this.money10-=x10;
            return result = true;


        } else {
            System.out.println("Нет необходимых купюр");
            return result;
        }

    }
}