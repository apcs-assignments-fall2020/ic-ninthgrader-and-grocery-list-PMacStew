public class Student extends Person {
    // Instance variables:
    // firstName and lastName are already inheritted
    private int classYear;
    
    // Constructors
    // A constructor that takes three parameters for the
    // firstName, lastName, and classYear
    public Student(String firstName, String lastName, int classYear) {
        super(firstName, lastName);
        this.classYear = classYear;
    }

    // A default/no-argument constructor
    public Student() {
        super();
        this.classYear = 2024;
    }

    // doSomething() method
    public void doSomething() {
        System.out.println("I'm studying!");
    }

    // toString()
    public String toString() {
        String str = this.getFirstName() + " " + this.getLastName() + ", " + this.classYear;
        return str;
    }

    

    // Getters
    // We've already inheritted getFirstName() and getLastName()
    // so we only need to add getClassYear
    public int getClassYear() {
        return this.classYear;
    }
    
    // Setters
    public void setClassYear(int classYear) {
        if (classYear > 2020 && classYear <= 2025) {
            this.classYear = classYear;
        }
    }
}