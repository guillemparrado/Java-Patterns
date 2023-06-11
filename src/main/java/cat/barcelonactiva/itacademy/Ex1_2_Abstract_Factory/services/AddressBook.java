package cat.barcelonactiva.itacademy.Ex1_2_Abstract_Factory.services;

import cat.barcelonactiva.itacademy.Ex1_2_Abstract_Factory.exceptions.InvalidCountryCodeException;
import cat.barcelonactiva.itacademy.Ex1_2_Abstract_Factory.factories.EntryFactory;
import cat.barcelonactiva.itacademy.Ex1_2_Abstract_Factory.factories.EsEntryFactory;
import cat.barcelonactiva.itacademy.Ex1_2_Abstract_Factory.factories.UkEntryFactory;
import cat.barcelonactiva.itacademy.Ex1_2_Abstract_Factory.factories.UsEntryFactory;
import cat.barcelonactiva.itacademy.Ex1_2_Abstract_Factory.models.Entry;

import java.util.HashMap;
import java.util.Map;

public class AddressBook {
    Map<String, Entry> nameEntry = new HashMap<>();

    private EntryFactory getFactory(String countryCode) throws InvalidCountryCodeException {
        switch(countryCode){
            case "ES": return new EsEntryFactory();
            case "UK": return new UkEntryFactory();
            case "US": return new UsEntryFactory();
        }
        throw new InvalidCountryCodeException();
    }

    public void addEntry(String name, String address, String phone, String countryCode){
        try {
            EntryFactory factory = getFactory(countryCode);
            nameEntry.put(name, factory.createEntry(address, phone));
        } catch (InvalidCountryCodeException e) {
            System.out.println("Error: Invalid Country Code: " + countryCode);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder()
                .append("AddressBook {\n" );

        for(String name : nameEntry.keySet()){
            sb.append("\t")
                    .append(name)
                    .append(": ")
                    .append(nameEntry.get(name))
                    .append("\n");
        }
        sb.append('}');

        return sb.toString();
    }
}
