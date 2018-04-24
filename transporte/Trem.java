package transporte;

public class Trem extends Transporte implements ITransporte {

    public Trem(int id, String linha, String sentidoItinerario, String partida, String chegada) {
        super(id, linha, sentidoItinerario, partida, chegada);
    }

    @Override
    public void getInfo() {
        System.out.println("Aew segue infos do Trem: ");
        System.out.println("Linha: " + getLinha());
        System.out.println("Sentido do itinerario: " + getSentidoItinerario());
        System.out.println("partida: " + getPartida());
        System.out.println("chegada: " + getChegada());
    }

}
