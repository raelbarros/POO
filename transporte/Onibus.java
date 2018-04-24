package transporte;

public class Onibus extends Transporte implements ITransporte {

    public Onibus(int id, String linha, String sentidoItinerario, String partida, String chegada) {
        super(id, linha, sentidoItinerario, partida, chegada);
    }

    @Override
    public void getInfo() {
        System.out.println("Aew , segue infos do Bus: ");
        System.out.println("Linha: " + getLinha());
        System.out.println("Sentido do itinerario: " + getSentidoItinerario());
        System.out.println("partida: " + getPartida());
        System.out.println("chegada: " + getChegada());
    }
}
