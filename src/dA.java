public class dA {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Bones", "Kennel", "Labrador"),
                new Cat("Fish", "House", 9),
                new Horse("Hay", "Stable", "Thoroughbred")
        };

        Veterinary vet = new Veterinary();

        for (Animal animal : animals) {
            vet.treatAnimal(animal);
        }
    }
}