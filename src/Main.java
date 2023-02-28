public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    public static void task1() {
        System.out.println("Задача 1");

        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задача2");

        int clientDeviceYear = 2012;
        int clientOS = 0;

        if (clientDeviceYear < 2015) {
            if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Не поддерживается");
            }
        } else {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите версию приложения для Андроид по ссылке");
            } else {
                System.out.println("Не поддерживается");
            }
        }
    }
    public static void task3() {
        System.out.println("Задача3");
        int year = 2016;
        boolean leapYear = ( (year % 400 == 0) || (year %4 == 0 && year % 100 != 0));
        if (leapYear)
            System.out.println("Год " + year + " високосный");
        else
            System.out.println("Год " + year + " не високосный");
    }

    public static void task4() {
        System.out.println("Задача4");
        int deliveryDistance = 166;
        int day = 1;

        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + day + " срок доставки.");
        } else if (deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + (day+1) + " срок доставки.");
        } else if (deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + (day+2) + " срок доставки.");
        }else {
          System.out.println("Свыше 100 км доставки нет.");
        }
    }
    public static void task5() {
        System.out.println("Задача5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("номер месяца больше 12");
        }
    }
}
















