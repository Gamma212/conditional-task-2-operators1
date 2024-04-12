public class Main {
    public static void main(String[] args) {

        int client_balanc = 100;

        int clients_mani = 1100;

        if (clients_mani > 1000) {

            int bonus =  clients_mani / 100;
            System.out.println("Бонус: " + bonus);
            int xxx =  bonus + clients_mani + client_balanc;

            System.out.println("Cчет с учетом бонуса: " + xxx + " p");


        }else{
          int result = client_balanc + clients_mani;
            System.out.println("Cчет без бонусов: " + result + " p ");
        }


    }
}
