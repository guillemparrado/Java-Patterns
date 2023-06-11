package cat.barcelonactiva.itacademy.Ex1_2_Abstract_Factory.factories;

import cat.barcelonactiva.itacademy.Ex1_2_Abstract_Factory.models.Entry;

public class UsEntryFactory implements EntryFactory {

    public Entry createEntry (String address, String number) {
        return new Entry(
                address + ", United States of America",
                "+1 " + number
        );
    }
}
