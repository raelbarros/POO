package provapoo;

public class Exames extends Prontuario implements iProntuario {

    private String nomeExame;
    private String instrucoesPrep;

    public Exames(String nomeExame, String instrucoesPrep, int id, String data, String hora, String unidade) {
        super(id, data, hora, unidade);
        this.nomeExame = nomeExame;
        this.instrucoesPrep = instrucoesPrep;
    }

    public String getNomeExame() {
        return nomeExame;
    }

    public void setNomeExame(String nomeExame) {
        this.nomeExame = nomeExame;
    }

    public String getInstrucoesPrep() {
        return instrucoesPrep;
    }

    public void setInstrucoesPrep(String instrucoesPrep) {
        this.instrucoesPrep = instrucoesPrep;
    }

    public void getInfo() {
        System.out.println("-- Exame --");
        System.out.println("Nome do Exame: " + getNomeExame());
        System.out.println("Instruções de preparo: " + getInstrucoesPrep());
        System.out.println("Data: " + getData());
        System.out.println("Hora: " + getHora());
        System.out.println("Unidade: " + getUnidade());
    }
}
