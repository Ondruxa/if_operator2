public class Main {
    public static void main(String[] args) {

        //task 1 IOS Android
        System.out.println("task1");
        int clientOS = 0;

        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println();

        //task2 версия приложения
        System.out.println("task2");
        int clientDeviceYear = 2014;

        if (clientOS == 0 && clientDeviceYear<2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        System.out.println();

        //task3 високосный год
        System.out.println("task3");
        int year = 1804;

        if(year > 1584 && year % 400 == 0){
            System.out.println(year+ " год является високосным");
        } else if (year > 1584 && year % 4 == 0 && year % 100 !=0) {
            System.out.println(year+ " год является високосным");
        }
        System.out.println();

        //task4 срок доставки
        System.out.println("task4");
        int deliveryDistance = 95;

        if (deliveryDistance <= 20){
            System.out.println("Потребуется дней: " + 1);

        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + 2);

        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + 3);

        } else if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        }

        System.out.println();

        //task5 сезон года
        System.out.println("task5");
        int monthNumber = 3;
        if (monthNumber<=12) {
            switch (monthNumber) {
                case 1:
                    System.out.println("1-й месяц (он же январь) принадлежит к сезону зима");
                    break;
                case 2:
                    System.out.println("2-й месяц (он же февраль) принадлежит к сезону зима");
                    break;
                case 3:
                    System.out.println("3-й месяц (он же март) принадлежит к сезону весна");
                    break;
                case 4:
                    System.out.println("4-й месяц (он же апрель) принадлежит к сезону весна");
                    break;
                case 5:
                    System.out.println("5-й месяц (он же май) принадлежит к сезону весна");
                    break;
                case 6:
                    System.out.println("6-й месяц (он же июнь) принадлежит к сезону лето");
                    break;
                case 7:
                    System.out.println("7-й месяц (он же июль) принадлежит к сезону лето");
                    break;
                case 8:
                    System.out.println("8-й месяц (он же август) принадлежит к сезону лето");
                    break;
                case 9:
                    System.out.println("9-й месяц (он же сентябрь) принадлежит к сезону осень");
                    break;
                case 10:
                    System.out.println("10-й месяц (он же октябрь) принадлежит к сезону осень");
                    break;
                case 11:
                    System.out.println("11-й месяц (он же ноябрь) принадлежит к сезону осень");
                    break;
                case 12:
                    System.out.println("12-й месяц (он же декабрь) принадлежит к сезону зима");
                    break;
                default:
                    System.out.println("Нет такого месяца");
            }
        }
    }
}