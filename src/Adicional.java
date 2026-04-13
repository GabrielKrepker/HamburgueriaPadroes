public abstract class Adicional implements IHamburguer {

    protected IHamburguer hamburguer;

    public Adicional(IHamburguer hamburguer) {
        this.hamburguer = hamburguer;
    }
}