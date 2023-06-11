package cat.barcelonactiva.itacademy.Ex1_2_Abstract_Factory.factories;

import cat.barcelonactiva.itacademy.Ex1_2_Abstract_Factory.models.Entry;

public class EsEntryFactory implements EntryFactory {

    public Entry createEntry (String address, String number) {
        return new Entry(
                address + ", Spain",
                "+34 " + number
        );
    }
}
