package cat.barcelonactiva.itacademy.Ex1_2_Abstract_Factory;

import cat.barcelonactiva.itacademy.Ex1_2_Abstract_Factory.services.AddressBook;

public class Main {
    public static void main(String[] args) {
        AddressBook ab = new AddressBook();

        // Note: these are random addresses generated with the python module 'faker'
        ab.addEntry("Alex", "47 High Street, Edinburgh, EH9 4BN", "131 123 4567", "UK");
        ab.addEntry("Dolors", "Carrer dels Capellans 12, 08002 Barcelona", "932 12 34 56", "ES");
        ab.addEntry("Christine", "1234 Main St, San Francisco, CA 94102", "(415) 555-1234", "US");
        ab.addEntry("Emmanuel", "15 Rue de la République, 13001 Marseille", "4 91 23 45 67", "FR");


        System.out.println(ab);
    }

}

