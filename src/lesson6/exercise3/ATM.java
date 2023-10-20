package lesson6.exercise3;

import java.util.Scanner;

public class ATM {
    Scanner scanner = new Scanner(System.in);
    double banknote;
    int countOneHundred;
    int countFifty;
    int countTwenty;
    double balanceBuff;
    double balanceBuffRest;
    double sumPlus;
    double sumPlus2;
    int choice;

    public void addBanknote() {
        System.out.println("_____________________________________________");
        System.out.println("Сейчас вы перешли на пополнение баланса");
        System.out.println("Укажите сумму, которую вы хотите внести:");
        banknote += scanner.nextDouble();
        System.out.println("Нажмите \n1.Для перехода на главную страницу \n2.Для выхода из системы");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                info();
                break;
            case 2:
                System.out.println("Спасибо, что выбираете нас!");
                break;
            default:
                System.out.println("Не известная команда переносим вас на главное меню");
                info();
                break;
        }
    }

    public void sum() {
        System.out.println("______________________________________");
        countOneHundred = 0;
        countFifty = 0;
        countTwenty = 0;
        balanceBuff = banknote;
        while (balanceBuff > 0) {
            if (balanceBuff >= 100 && balanceBuff % 100 == 0) {
                countOneHundred++;
                balanceBuff -= 100;
            } else if (balanceBuff >= 50 && balanceBuff % 50 == 0) {
                countFifty++;
                balanceBuff -= 50;
            } else if (balanceBuff >= 20) {
                countTwenty++;
                balanceBuff -= 20;
            } else {
                balanceBuffRest = balanceBuff;
                balanceBuff -= balanceBuff;
            }
        }
        System.out.println("Ваш баланс:" + banknote + "р \nВы имеете\n" + countOneHundred + " номиналом 100р");
        System.out.println(countFifty + " номиналом 50р \n" + countTwenty + " номиналом 20р");
        System.out.println("Остаток без наминала: " + balanceBuffRest + "р");
        System.out.println("Нажмите \n1.Для перехода на главную страницу \n2.Для выхода из системы");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                info();
                break;
            case 2:
                System.out.println("Спасибо, что выбираете нас!");
                break;
            default:
                System.out.println("Не известная команда переносим вас на главное меню");
                info();
                break;
        }
    }

    public void withdrawMoney() {
        System.out.println("________________________________________");
        System.out.println("Ведите сумму, которую хотите снять");
        sumPlus = scanner.nextDouble();
        sumPlus2 = sumPlus;
        countOneHundred = 0;
        countFifty = 0;
        countTwenty = 0;
        balanceBuff = sumPlus;
        while (sumPlus > 0) {
            if (sumPlus >= 100 && sumPlus % 100 == 0) {
                countOneHundred++;
                sumPlus -= 100;
            } else if (sumPlus >= 50 && sumPlus % 50 == 0) {
                countFifty++;
                sumPlus -= 50;
            } else if (sumPlus >= 20) {
                countTwenty++;
                sumPlus -= 20;
            } else {
                balanceBuffRest = sumPlus;
                sumPlus -= sumPlus;
            }
        }
        System.out.println("Вы хотите снять:" + sumPlus2 + "р\nМыможем вам выдать:\n" + countOneHundred + " номиналом 100р");
        System.out.println(countFifty + " номиналом 50р \n" + countTwenty + " номиналом 20р");
        System.out.println("Остаток без наминала, который не выдаётся: " + balanceBuffRest + "р");
        System.out.println("Нажмите \n1.Получить деньги \n2.Вернутся на главное меню");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                if (sumPlus2 < banknote) {
                    System.out.println("Ваша операция была успешно");
                    System.out.println("ТУНЬ-ТУНУЬ-ТУНЬ....Забирайте деньги:" + sumPlus2);
                    System.out.println("Нажмите \n1.Вернутся на главную страницу \n2.Выйти из системы");
                    banknote -= sumPlus2;
                    choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            info();
                            break;
                        case 2:
                            System.out.println("Спасибо, что выбираете нас!");
                            break;
                        default:
                            System.out.println("Не известная команда переносим вас на главное меню");
                            info();
                            break;
                    }
                } else {
                    System.out.println("Не достаточно средств");
                    System.out.println("Переносим вас на главное меню");
                    info();
                }
            case 2:
                System.out.println("Переносим вас на главное меню");
                info();
                break;
            default:
                System.out.println("Не известная команда переносим вас на главное меню");
                info();
                break;

        }
    }

    public void info() {
        System.out.println("_____________________________________________");
        System.out.println("Приветствуем вас на главном меню банкомата компании \"ATM\"");
        System.out.println("Что вы хотите сделать: \n1.Пополнить карту \n2.Снять средства \n3.Посмотреть баланс \n4.Выйти из системы");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                addBanknote();
                break;
            case 2:
                withdrawMoney();
                break;
            case 3:
                sum();
                break;
            case 4:
                System.out.println("Спасибо, что выбираете нас!");
                break;
        }
    }

    public ATM(double banknote) {
        this.banknote = banknote;
    }
}
