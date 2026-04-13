import java.util.ArrayList;
import java.util.List;

public class SistemaPedidos {

    private static SistemaPedidos instance = new SistemaPedidos();
    private List<String> pedidos = new ArrayList<>();

    private SistemaPedidos() {}

    public static SistemaPedidos getInstance() {
        return instance;
    }

    public void adicionarPedido(String pedido) {
        pedidos.add(pedido);
    }

    public List<String> getPedidos() {
        return pedidos;
    }
}