public class Bacon extends Adicional {

    public Bacon(IHamburguer hamburguer) {
        super(hamburguer);
    }

    public String getDescricao() {
        return hamburguer.getDescricao() + " + bacon";
    }

    public double getPreco() {
        return hamburguer.getPreco() + 3.0;
    }
}