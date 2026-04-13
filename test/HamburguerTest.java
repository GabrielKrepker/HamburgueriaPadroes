import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HamburguerTest {

    @Test
    public void deveCriarHamburguerSimples() {
        IHamburguer h = new HamburguerBase();

        assertEquals("Hamburguer", h.getDescricao());
        assertEquals(10.0, h.getPreco());
    }

    @Test
    public void deveAdicionarQueijo() {
        IHamburguer h = new HamburguerBase();
        h = new Queijo(h);

        assertEquals("Hamburguer + queijo", h.getDescricao());
        assertEquals(12.0, h.getPreco());
    }

    @Test
    public void deveAdicionarBacon() {
        IHamburguer h = new HamburguerBase();
        h = new Bacon(h);

        assertEquals("Hamburguer + bacon", h.getDescricao());
        assertEquals(13.0, h.getPreco());
    }

    @Test
    public void deveAdicionarQueijoEBacon() {
        IHamburguer h = new HamburguerBase();
        h = new Queijo(h);
        h = new Bacon(h);

        assertEquals("Hamburguer + queijo + bacon", h.getDescricao());
        assertEquals(15.0, h.getPreco());
    }
}