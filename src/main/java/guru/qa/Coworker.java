package guru.qa;

public class Coworker {
    String firstName;
    String lastName;
    int age;
    String position;
    String project;

    public Coworker(String name, String secondName, int age, String position, String project){
        this.firstName = name;
        this.lastName = secondName;
        this.age = age;
        this.position = position;
        this.project = project;
    }

    void getFullName(){
        System.out.println("\nFull name: " + firstName + " " + lastName);
    }

    void addAge(){
        age++;
        System.out.println("\nCurrent age: " + age);
    }

    void changePosition(String newPosition) {
        position = newPosition;
        System.out.println("\nNew position: " + position);
    }

    void changeProject(String newProject) {
        project = newProject;
        System.out.println("\nNew project: " + project);
    }

    void infoAboutCoworker() {
        System.out.println("\nCoworker: " + firstName + " " + lastName
                + "\nAge: " + age
                + "\nCurrent position: " + position
                + "\nCurrent project: " + project);
    }
}
