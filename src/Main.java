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
    }
}