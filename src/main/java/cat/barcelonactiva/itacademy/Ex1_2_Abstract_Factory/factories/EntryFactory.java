package cat.barcelonactiva.itacademy.Ex1_2_Abstract_Factory.factories;

import cat.barcelonactiva.itacademy.Ex1_2_Abstract_Factory.models.Entry;

public interface EntryFactory {
    Entry createEntry (String address, String number);
}
