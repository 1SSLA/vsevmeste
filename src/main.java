public class main {
    public static void Main(String[] args) {
        Students student1 = new Students("John", "Doe", "Group A", 4.5);
        Students student2 = new Students("Alice", "Smith", "Group B", 5.0);
        Aspirant aspirant1 = new Aspirant("Bob", "Johnson", "Group C", 4.8);
        Aspirant aspirant2 = new Aspirant("Eve", "Williams", "Group D", 5.0);

        Students[] students = {student1, student2, aspirant1, aspirant2};

        for (Students student : students) {
            System.out.println(student.firstName + " " + student.lastName + ": Scholarship amount - $" + student.getScholarship());
        }
    }
}
