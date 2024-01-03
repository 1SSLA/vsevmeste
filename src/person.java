public class person {
    public String fullName;
    public int age;

    public person() {
    }


    public person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " is moving.");
    }

    public void talk() {
        System.out.println(fullName + " is talking.");
    }

    public static void main(String[] args) {
        person person1 = new person();
        person1.fullName = "Islam";
        person1.age = 17;

        person person2 = new person("Amir", 18);

        person1.move();
        person1.talk();

        person2.move();
        person2.talk();
    }
}
