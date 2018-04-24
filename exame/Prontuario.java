package provapoo;
public abstract class Prontuario implements iProntuario {
    protected int id;
    private String data;
    private String hora;
    private String unidade;

    public Prontuario(int id, String data, String hora, String unidade) {
        this.id = id;
        this.data = data;
        this.hora = hora;
        this.unidade = unidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }
    
    
}
