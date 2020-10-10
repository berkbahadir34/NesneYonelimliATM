public class Hesap {
    private String kulllaniciAdi;
    private String parola;
    private int bakiye;

    public Hesap(String kulllaniciAdi, String parola, int bakiye)
    {
        this.setKulllaniciAdi(kulllaniciAdi);
        this.setParola(parola);
        this.setBakiye(bakiye);

    }

    public String getKulllaniciAdi() {
        return kulllaniciAdi;
    }

    public void setKulllaniciAdi(String kulllaniciAdi) {
        this.kulllaniciAdi = kulllaniciAdi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    public void paraYatir(int tutar)
    {
        this.bakiye += tutar;
        System.out.println("Yeni Bakiyeniz: "+this.bakiye);
    }
    public void paraCek(int tutar)
    {
        if(tutar>1500)
        {
            System.out.println("Günlük Maksimum 1500TL Çekebilirsiniz..");
        }
        else if ((bakiye-tutar)<0)
        {
            System.out.println("Yetersiz Bakiye..");
        }
        else
        {
            this.bakiye -=tutar;
            System.out.println("Yeni Bakiyeniz: "+this.bakiye);

        }
    }
}
