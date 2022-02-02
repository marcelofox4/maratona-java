package fox.marcelo.maratonajava.exercises.seminars.domain;

public class Seminar {

    private String title;
    private Place place;
    private Student[] students;

    public Seminar(String title, Place place) {
        this.title = title;
        this.place = place;
    }

    public Seminar(String title, Place place, Student[] students) {
        this.title = title;
        this.students = students;
        this.place = place;
    }

    public void print() {
        System.out.println("---- Seminário ----");
        System.out.println("Nome: " + this.title);
        System.out.println("Local: " + place.getAddress());
        if (this.students == null) {
            return;
        }
        System.out.println("Estudantes Cadastrados:");
        for (Student student : students) {
            System.out.println("Nome: " + student.getName());
            System.out.println("Idade: " + student.getAge());
            System.out.println("---------------");
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
