public class Acessorio extends Material{

    private String descricaoAcessorio;

    public Acessorio(String descricao, String descricaoAcessorio) {
        super(descricao);
        this.descricaoAcessorio = descricaoAcessorio;
    }

    public String getDescricaoAcessorio() {
        return descricaoAcessorio;
    }

    public void setDescricaoAcessorio(String descricaoAcessorio) {
        this.descricaoAcessorio = descricaoAcessorio;
    }

    public String getMaterial() {
        return "Acessorio: " + this.getDescricao() + " - descricao: " + this.getDescricaoAcessorio() + "\n";
    }


}
