class Students {
    String firstName;
    String lastName;
    String group;
    double averageMark;

    Students(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public double getScholarship() {
        return (averageMark == 5.0) ? 100 : 80;
    }
}

class Aspirant extends Students {

    Aspirant(String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);
    }

    @Override
    public double getScholarship() {
        return (averageMark == 5.0) ? 200 : 180;
    }
}

