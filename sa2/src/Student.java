public class Student {
    String name;
    int facultyNumber;
    float score;

    public Student(){}

    public void printStudent() {
        System.out.println("Name: " + this.name);
        System.out.println("Faculty number: " + this.facultyNumber);
        System.out.println("Score: " + this.score);
    }
}