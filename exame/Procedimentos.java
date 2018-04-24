package provapoo;

public class Procedimentos extends Prontuario implements iProntuario{
    private String nomeProc;
    private String obs;

    public Procedimentos(String nomeProc, String obs, int id, String data, String hora, String unidade) {
        super(id, data, hora, unidade);
        this.nomeProc = nomeProc;
        this.obs = obs;
    }

    public String getNomeProc() {
        return nomeProc;
    }

    public void setNomeProc(String nomeProc) {
        this.nomeProc = nomeProc;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
    
    public void getInfo() {
        System.out.println("-- Procedimento --");
        System.out.println("Nome do Procedimento: " + getNomeProc());
        System.out.println("Observações: " + getObs());
        System.out.println("Data: " + getData());
        System.out.println("Hora: " + getHora());
        System.out.println("Unidade: " + getUnidade());
    }
}
