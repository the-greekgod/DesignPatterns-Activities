package net.media.training.designpattern.builder;

import java.util.List;

public class PeopleDataSource {
    public static String getPeopleXml(List<Person> persons) {
        String finalXML = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
        finalXML += "<People number=\"" + persons.size() + "\">";
        for (Person person : persons) {
            finalXML += "<Person id=\"" + person.getId() + "\" name=\"" + person.getName() + "\">" +
                    "<Address><City>" + person.getCity() + "</City><Country>" + person.getCountry() + "</Country></Address>" +
                    "</Person>";
        }
        finalXML += "</People>";
        return finalXML;
    }
}