package cat.barcelonactiva.itacademy.Ex1_2_Abstract_Factory.models;

public record Entry(String address, String phoneNumber) {
    @Override
    public String toString() {
        return "{ Address: '" + address + '\'' +
                "; Phone Number: '" + phoneNumber + '\'' +
                " }";
    }
}
