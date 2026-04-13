public class Pedido {

    private Combo combo;
    private String pagamento;

    public Pedido() {
        this.combo = Combo.criarComboSimples();
    }

    public void adicionarQueijo() {
        combo.adicionarQueijo();
    }

    public void adicionarBacon() {
        combo.adicionarBacon();
    }

    public void pagar(String metodo) {
        if (metodo.equalsIgnoreCase("pix")) {
            pagamento = "Pago com Pix: " + combo.getPreco();
        } else {
            pagamento = "Pago com Cartão: " + combo.getPreco();
        }
    }

    public void finalizar() {
        SistemaPedidos.getInstance().adicionarPedido(combo.getDescricao());
    }

    public String getResumo() {
        return combo.getDescricao();
    }

    public double getPreco() {
        return combo.getPreco();
    }

    public String getPagamento() {
        return pagamento;
    }
}