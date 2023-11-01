public class Main {
    public static void main(String[] args) {
        int clientOS = 1;
        int year=2016;
        task(clientOS);
        task(clientOS,year);

    }

    public static void task(int clientOS){
        String version = switch (clientOS) {
            case 0 -> "iOS";
            case 1 -> "Android";
            default -> null;
        };
        if (version != null) System.out.println("Установите версию приложения для "+version+" по ссылке");
    }

    public static void task(int clientOS,int year){
        String strOut="Установите";
        if (year<=2015)
            strOut+=" облегченную";

        String version = switch (clientOS) {
            case 0 -> "iOS";
            case 1 -> "Android";
            default -> null;
        };
        if (version != null) System.out.println(strOut+" версию приложения для "+version+" по ссылке");
    }
}