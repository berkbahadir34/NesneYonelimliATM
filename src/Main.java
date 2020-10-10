public class Main {
    public static void main(String[] argc)
    {
        ATM atm = new ATM();
        Hesap hesap =new Hesap("Ahmet Berk Bahadr","1234",2000);

        atm.calis(hesap);
        System.out.println("Programdan Çıkılıyor.....");
    }


}
