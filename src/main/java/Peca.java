import java.util.ArrayList;
import java.util.List;

public class Peca extends Material{

    private List<Material> materiais;

    public Peca(String descricao) {
        super(descricao);
        this.materiais = new ArrayList<Material>();
    }

    public void addMaterial(Material material) {
        this.materiais.add(material);
    }

    public String getMaterial() {
        String saida = "";
        saida = "Peça: " + this.getDescricao() + "\n";
        for (Material conteudo : materiais) {
            saida += conteudo.getMaterial();
        }
        return saida;
    }

}
