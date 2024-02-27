public class Main {
    public static void main(String[] args) {
        System.out.println("Homework 5.");
        System.out.println("Task 1 && 2.");
        int iOS = 0;
        int android = 1;
        int clientOS = 0;
        int clientDeviceYear = 2015;
        if (clientOS == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("установите облегченную версию приложения для iOS по ссылке");
            }
        }
        if (clientOS == 1) {
            if (clientDeviceYear >= 2015) {
                System.out.println("установите версию приложения для Android по ссылке");
            } else {
                System.out.println("установите облегченную версию приложения для Android по ссылке");
            }
        }
        System.out.println("Task 3.");
        int year = 2024;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            if (year >= 1584) {
                System.out.println(year + " год является високосным");
            }} else {
            System.out.println(year + " год не является високосным.");
        }
        System.out.println("Task 4");
        int deliveryDistance = 95;
        int minDeliveryTime = 1;
        if (deliveryDistance <= 100 && deliveryDistance <=20) {
            System.out.println("Доставка будет произведена в течении " + minDeliveryTime + " суток.");
        } else if (deliveryDistance <= 100 && deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Доставка будет произведена в течении " + minDeliveryTime*2 + " суток.");
        } else if (deliveryDistance <= 100 && deliveryDistance > 60) {
            System.out.println("Доставка будет произведена в течении " + minDeliveryTime*3 + " суток.");
        } else {
            System.out.println("Доставка по указанному адресу не осуществляется.");
        }
        System.out.println("Task 5.");
        int monthNumber = 2;
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
                System.out.println("Введите корректный порядковый номер месяца.");
        }
    }
}