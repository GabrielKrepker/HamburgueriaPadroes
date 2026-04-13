import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PagamentoTest {

    @Test
    public void devePagarComPix() {

        Pedido pedido = new Pedido();
        pedido.pagar("pix");

        assertTrue(pedido.getPagamento().contains("Pix"));
    }

    @Test
    public void devePagarComCartao() {

        Pedido pedido = new Pedido();
        pedido.pagar("cartao");

        assertTrue(pedido.getPagamento().contains("Cartão"));
    }
}