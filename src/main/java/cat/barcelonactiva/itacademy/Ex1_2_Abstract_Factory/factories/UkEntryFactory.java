package cat.barcelonactiva.itacademy.Ex1_2_Abstract_Factory.factories;

import cat.barcelonactiva.itacademy.Ex1_2_Abstract_Factory.models.Entry;

public class UkEntryFactory implements EntryFactory {

    public Entry createEntry (String address, String number) {
        return new Entry(
                address + ", United Kingdom",
                "+44 " + number
        );
    }
}