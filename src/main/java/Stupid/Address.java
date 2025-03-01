package org.utils.Stupid;

public class Address {
    private Long personId;
    private String street;
    private String city;

    public Address(Long personId, String street, String city) {
        this.personId = personId;
        this.street = street;
        this.city = city;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
