package transporte;

public class Metro extends Transporte implements ITransporte {

    public Metro(int id, String linha, String itinerario, String partida, String chegada) {
        super(id, linha, itinerario, partida, chegada);
    }

    public void getInfo() {
        System.out.println("Aew segue infos do Metro: ");
        System.out.println("Linha: " + getLinha());
        System.out.println("Sentido do itinerario: " + getSentidoItinerario());
        System.out.println("partida: " + getPartida());
        System.out.println("chegada: " + getChegada());
    }

}
