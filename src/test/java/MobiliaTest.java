import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MobiliaTest {

    @Test
    void deveRetornarMateriasDaMobilia(){
        Peca peca1 = new Peca("6 pés de ferro");

        Acessorio acessorio1 = new Acessorio("Ferro", "30 parafusos");

        peca1.addMaterial(acessorio1);

        Peca peca2 = new Peca("Tampo de madeira");
        peca2.addMaterial(peca1);

        Mobilia mobilia = new Mobilia();
        mobilia.setMaterial(peca2);

        assertEquals("Peça: Tampo de madeira\n" +
                "Peça: 6 pés de ferro\n" +
                "Acessorio: Ferro - descricao: 30 parafusos\n",
                 mobilia.getMaterial());

    }

    @Test
    void deveRetornarExecacaoMobiliaSemMaterial() {
        try {
            Mobilia mobilia = new Mobilia();
            mobilia.getMaterial();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Mobilia sem material", e.getMessage());
        }
    }

}