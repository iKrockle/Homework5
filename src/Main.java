public class Main {
    public static void main(String[] args) {
        int clientOS = 1;
        int year=1800;
        int deliveryDistance = 105;
        int monthNumber = 13;
        task(clientOS);
        task(clientOS,year);
        task3(year);
        task4(deliveryDistance);
        task5(monthNumber);
    }

    public static void task(int clientOS){
        String version;

        if(clientOS == 0)version = "iOS";
        else if (clientOS == 1) version ="Android";
        else return;

        System.out.println("Установите версию приложения для "+version+" по ссылке");
    }

    public static void task(int clientOS,int year){
        String strOut="Установите";
        if (year<=2015)
            strOut+=" облегченную";

        String version;

        if(clientOS == 0)version = "iOS";
        else if (clientOS == 1) version ="Android";
        else return;

        System.out.println(strOut+" версию приложения для "+version+" по ссылке");
    }

    public static void task3(int year){
        int startYear = 1584;

        if (year%400 == 0||(year%100 != 0&&(year-startYear)%4==0))
            System.out.println(year+"г - високосный");
        else if (year<startYear)
            System.out.println("Високосный год еще не ввели");
        else
            System.out.println(year+"г - не високосный");
    }

    public static void task4(int deliveryDistance){
        int d;
        if (deliveryDistance <= 0 ) {
            System.out.println("Некорректное расстояние");
            return;
        }
        else if (deliveryDistance<=20) d=1;
        else if (deliveryDistance<=60) d=2;
        else if (deliveryDistance<=100) d=3;
        else {
            System.out.println("Свыше 100 км доставки нет");
            return;
        }

        System.out.println("Потребуется дней: "+d);

    }

    public static void task5(int monthNumber){
        String strOut = switch (monthNumber) {
            case 1, 2, 12 -> "Зима";
            case 3, 4, 5 -> "Весна";
            case 6, 7, 8 -> "Лето";
            case 9, 10, 11 -> "Осень";
            default -> "Указан некорректный номер месяца";
        };
        System.out.println(strOut);
    }
}