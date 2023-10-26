package lesson6.exercise1;

import java.util.Scanner;

public class CreditCard {
    String accountNumber;
    double amountOnAccount;
    static Scanner scanner = new Scanner(System.in);

    public void chargeAnAmount() {
        System.out.println("Укажите сумму которую вы хотите внести");
        amountOnAccount += scanner.nextDouble();
        space();
    }

    public void withdrawMoney() {
        System.out.println("Укажите сумму которую вы хотите снять");
        double remove = scanner.nextDouble();
        if (remove > amountOnAccount && remove > 0) {
            System.out.println("Недостаточно средств");
        } else {
            amountOnAccount -= remove;
            System.out.println("Сумма которые вы сняли: " + remove);
        }
        space();
    }

    public String info() {
        System.out.println("Номер карточки: " + accountNumber + "\nДенежный счёт: " + amountOnAccount + " руб.");
        System.out.println("____________________________________");
        space();
        return "_______";
    }

    public String info3() {
        return "Номер карточки: " + accountNumber + "\nДенежный счёт: " + amountOnAccount + " руб." + "\n___________";
    }

    public void space() {
        System.out.println("Что вы хотите сделать дальше: \n1.Посмотреть информацию по номеру карточки \n2.Снять деньги \n3.Пополнть карточку");
        System.out.println("4.Выйти из системы");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                info();
                break;
            case 2:
                withdrawMoney();
                break;
            case 3:
                chargeAnAmount();
                break;
            case 4:
                System.out.println("Вы вышли из системы \"CreditCard\" Желаем вам удачи");
                break;
            default:
                System.out.println("Ваш запрос был не правильный");
                space();
                break;
        }
    }

    public CreditCard() {
        accountNumber = "0000";
        amountOnAccount = 0.0;
    }

    public CreditCard(String accountNumber, double amountOnAccount) {
        this.accountNumber = accountNumber;
        this.amountOnAccount = amountOnAccount;
    }

}
