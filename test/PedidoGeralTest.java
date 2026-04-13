import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PedidoGeralTest {

    @Test
    public void pedidoHamburguerSimples() {

        Pedido pedido = new Pedido();

        assertEquals("Hamburguer + Refrigerante + batata", pedido.getResumo());
        assertEquals(15.0, pedido.getPreco());
    }

    @Test
    public void pedidoComQueijo() {

        Pedido pedido = new Pedido();
        pedido.adicionarQueijo();

        assertTrue(pedido.getResumo().contains("queijo"));
    }

    @Test
    public void pedidoComBacon() {

        Pedido pedido = new Pedido();
        pedido.adicionarBacon();

        assertTrue(pedido.getResumo().contains("bacon"));
    }

    @Test
    public void pedidoComQueijoEBacon() {

        Pedido pedido = new Pedido();
        pedido.adicionarQueijo();
        pedido.adicionarBacon();

        assertTrue(pedido.getResumo().contains("queijo"));
        assertTrue(pedido.getResumo().contains("bacon"));
    }

    @Test
    public void pedidoCompletoComPagamentoERegistro() {

        SistemaPedidos.getInstance().getPedidos().clear();

        Pedido pedido = new Pedido();

        pedido.adicionarQueijo();
        pedido.adicionarBacon();

        pedido.pagar("pix");
        pedido.finalizar();

        assertTrue(pedido.getResumo().contains("queijo"));
        assertTrue(pedido.getResumo().contains("bacon"));
        assertTrue(pedido.getPagamento().contains("Pix"));
        assertEquals(1, SistemaPedidos.getInstance().getPedidos().size());
    }
}