import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter number of students: ");
    int numberOfStudents = scanner.nextInt();

    Student[] students = new Student[numberOfStudents];

    for (int i = 0; i < numberOfStudents; i++) {
        Student newStudent = new Student();

        System.out.println("Enter student name: ");
        newStudent.name = scanner.next();

        System.out.println("Enter faculty number: ");
        newStudent.facultyNumber = Integer.parseInt(scanner.next());

        System.out.println("Enter score: ");
        newStudent.score = Float.parseFloat(scanner.next());

        students[i] = newStudent;
    }

    for (int i = 0; i < numberOfStudents; i++) {
        if (students[i].score >= 3) {
            students[i].printStudent();
        }
    }
}