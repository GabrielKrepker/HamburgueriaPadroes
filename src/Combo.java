public class Combo {

    private IHamburguer hamburguer;
    private IBebida bebida;
    private boolean batata;

    private Combo() {}

    public static Combo criarComboSimples() {
        Combo combo = new Combo();
        combo.hamburguer = new HamburguerBase();
        combo.bebida = new Refrigerante();
        combo.batata = true;
        return combo;
    }

    public void adicionarQueijo() {
        hamburguer = new Queijo(hamburguer);
    }

    public void adicionarBacon() {
        hamburguer = new Bacon(hamburguer);
    }

    public String getDescricao() {
        String desc = hamburguer.getDescricao() + " + " + bebida.getNome();
        if (batata) desc += " + batata";
        return desc;
    }

    public double getPreco() {
        double preco = hamburguer.getPreco();
        if (batata) preco += 5.0;
        return preco;
    }
}