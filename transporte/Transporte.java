package transporte;

public abstract class Transporte implements ITransporte{

    protected int id;
    private String linha;
    private String sentidoItinerario;
    private String chegada;
    private String partida;

    public Transporte(int id, String linha, String sentidoItinerario, String partida, String chegada) {
        this.id = id;
        this.linha = linha;
        this.sentidoItinerario = sentidoItinerario;
        this.chegada = chegada;
        this.partida = partida;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLinha() {
        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }

    public String getSentidoItinerario() {
        return sentidoItinerario;
    }

    public void setsentidoItinerario(String sentidoItinerario) {
        this.sentidoItinerario = sentidoItinerario;
    }

    public String getChegada() {
        return chegada;
    }

    public void setChegada(String chegada) {
        this.chegada = chegada;
    }

    public String getPartida() {
        return partida;
    }

    public void setPartida(String partida) {
        this.partida = partida;
    }
    
}
