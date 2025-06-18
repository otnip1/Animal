public class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void mover() {
        System.out.println(nome + " está se movendo.");
    }
}