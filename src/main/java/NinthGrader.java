public class NinthGrader extends Student {
    public NinthGrader(String firstName, String lastName) {
        super(firstName, lastName, 2024);
    }
    public NinthGrader() {
        super("John", "Smith", 2024);
    }
    public void doSomething() {
        System.out.println("I am preparing for a harkness discussion!");
    }
    public String toString() {
        return this.getFirstName() + " " + this.getLastName() + ", " + this.getClassYear() + ". 9th grader";
    }
}