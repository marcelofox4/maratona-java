package fox.marcelo.maratonajava.exercises.seminars.domain;

public class Place {

    private String address;

    public Place(String address) {
        this.address = address;
    }

    public void print() {
        System.out.println("Endereço: " + this.address);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
