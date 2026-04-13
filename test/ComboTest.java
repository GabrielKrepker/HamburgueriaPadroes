import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComboTest {

    @Test
    public void deveCriarComboPadrao() {
        Combo combo = Combo.criarComboSimples();

        assertEquals("Hamburguer + Refrigerante + batata", combo.getDescricao());
        assertEquals(15.0, combo.getPreco());
    }

    @Test
    public void comboComQueijo() {
        Combo combo = Combo.criarComboSimples();
        combo.adicionarQueijo();

        assertTrue(combo.getDescricao().contains("queijo"));
        assertEquals(17.0, combo.getPreco());
    }

    @Test
    public void comboComBacon() {
        Combo combo = Combo.criarComboSimples();
        combo.adicionarBacon();

        assertTrue(combo.getDescricao().contains("bacon"));
        assertEquals(18.0, combo.getPreco());
    }

    @Test
    public void comboComQueijoEBacon() {
        Combo combo = Combo.criarComboSimples();
        combo.adicionarQueijo();
        combo.adicionarBacon();

        assertTrue(combo.getDescricao().contains("queijo"));
        assertTrue(combo.getDescricao().contains("bacon"));
        assertEquals(20.0, combo.getPreco());
    }
}