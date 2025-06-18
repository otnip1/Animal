public class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void mover() {
        super.mover();
        System.out.println(nome + " está correndo feliz!");
    }
}