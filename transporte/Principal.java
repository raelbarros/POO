package transporte;

public class Principal {

    public static void main(String[] args) {
        Onibus onibus = new Onibus(1, "Santo Amaro - Jabaquara", "Centro", "10:00AM", "12:00PM");

        onibus.getInfo();
        System.out.println("");
        Metro metro = new Metro(2, "Jabaquara - Tucuruvi", "Norte", "10:00AM", "12:00PM");

        metro.getInfo();
        
        System.out.println("");
        Trem trem = new Trem(3, "Grajau - Osaco", "Sul", "10:00AM", "12:00PM");

        trem.getInfo();
    }
}
