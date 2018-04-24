package provapoo;
public class Consultas extends Prontuario implements iProntuario{
    private String nomeMedico;
    private String especialidade;
    
    public Consultas(String nomeMedico, String especialidade, int id, String data, String hora, String unidade) {
        super(id, data, hora, unidade);
        this.nomeMedico = nomeMedico;
        this.especialidade = especialidade;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    public void getInfo(){
        System.out.println("-- Consulta --");
        System.out.println("Nome do Medico: " + getNomeMedico());
        System.out.println("Especialidade: " + getEspecialidade());
        System.out.println("Data: " + getData());
        System.out.println("Hora: " + getHora());
        System.out.println("Unidade: " + getUnidade());
    }
}
