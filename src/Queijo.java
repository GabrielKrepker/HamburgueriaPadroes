public class Queijo extends Adicional {

    public Queijo(IHamburguer hamburguer) {
        super(hamburguer);
    }

    public String getDescricao() {
        return hamburguer.getDescricao() + " + queijo";
    }

    public double getPreco() {
        return hamburguer.getPreco() + 2.0;
    }
}