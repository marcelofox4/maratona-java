package fox.marcelo.maratonajava.exercises.seminars.domain;

public class Professor {

    private String name;
    private String specialty;
    private Seminar[] seminars;

    public Professor(String name, String specialty, Seminar[] seminars) {
        this.name = name;
        this.specialty = specialty;
        this.seminars = seminars;
    }

    public void print() {
        System.out.println("--- Professor ---");
        System.out.println("Nome: " + this.name);
        System.out.println("Especialidade: " + this.specialty);
        if (seminars == null) {
            return;
        }
        System.out.println("Seminários Cadastrados");
        for (Seminar seminar : seminars) {
            System.out.println("- " + seminar.getTitle());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Seminar[] getSeminars() {
        return seminars;
    }

    public void setSeminars(Seminar[] seminars) {
        this.seminars = seminars;
    }
}
