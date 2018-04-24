package assocsim;

public class Cpf {
    private String num;
    private String digver;
   

    public Cpf(String num, String sigver) {
        this.num = num;
        this.digver = sigver;
    }
    
    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getDigver() {
        return digver;
    }

    public void setDigver(String sigver) {
        this.digver = sigver;
    }
    
    
}
