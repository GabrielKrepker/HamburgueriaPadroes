import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SistemaPedidoTest {

    @Test
    public void deveSerMesmaInstancia() {

        SistemaPedidos s1 = SistemaPedidos.getInstance();
        SistemaPedidos s2 = SistemaPedidos.getInstance();

        assertSame(s1, s2);
    }

    @Test
    public void deveArmazenarPedidos() {

        SistemaPedidos sistema = SistemaPedidos.getInstance();
        sistema.getPedidos().clear();

        sistema.adicionarPedido("Pedido 1");

        assertEquals(1, sistema.getPedidos().size());
    }
}