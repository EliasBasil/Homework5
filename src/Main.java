public class Main {
    public static void main(String[] args) {
        // Задача 1
        int clientOS = 0;
        System.out.print("Установите версию приложения для ");
        if (clientOS == 0) {
            System.out.println("iOS по ссылке");
        } else {
            System.out.println("Android по ссылке");
        }

        // Задача 2
        int clientDeviceYear = 2015;
        if (clientDeviceYear < 2015) {
            System.out.print("Установите облегченную версию приложения для ");
            if (clientOS == 0) {
                System.out.println("iOS по ссылке");
            } else {
                System.out.println("Android по ссылке");
            }
        } else {
            System.out.print("Установите версию приложения для ");
            if (clientOS == 0) {
                System.out.println("iOS по ссылке");
            } else {
                System.out.println("Android по ссылке");
            }
        }

        // Задача 3
        int year = 2000;
        if (((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) && year > 1584) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        // Задача 4
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("На такую дистанцию доставки нет");
        }

        // Задача 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
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
                System.out.println("Номер месяца введен неправильно");
        }
    }
}