public class ProgramaAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal("Bicho");
        Cachorro dog = new Cachorro("Rex");

        System.out.println("=== Animal ===");
        animal.mover();

        System.out.println("\n=== Cachorro ===");
        dog.mover();
    }
}