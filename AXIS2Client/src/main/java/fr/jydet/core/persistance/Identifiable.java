package fr.jydet.core.persistance;

public interface Identifiable<Id> {
    Id getId();
    void setId(Id id);
}
