class Animal {
    String food;
    String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("Such an animal is sleeping");
    }

    public void eat() {
        System.out.println("Animal is eating " + food);
    }

    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    String breed;

    public Dog(String food, String location, String breed) {
        super(food, location);
        this.breed = breed;
    }

    @Override
    public void makeNoise() {
        System.out.println("Woof!");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating " + food);
    }
}

class Cat extends Animal {
    int lives;

    public Cat(String food, String location, int lives) {
        super(food, location);
        this.lives = lives;
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow!");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating " + food);
    }
}

class Horse extends Animal {
    String breed;

    public Horse(String food, String location, String breed) {
        super(food, location);
        this.breed = breed;
    }

    @Override
    public void makeNoise() {
        System.out.println("Neigh!");
    }

    @Override
    public void eat() {
        System.out.println("Horse is eating " + food);
    }
}

class Veterinary {
    public void treatAnimal(Animal animal) {
        System.out.println("Food: " + animal.food + ", Location: " + animal.location);
    }
}

