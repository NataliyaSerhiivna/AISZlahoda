package entity;

import java.util.Objects;

public class CustomerCard {
    private String number;
    private String surname;
    private String name;
    private String patronymic;
    private String phoneNumber;
    private String city;
    private String street;
    private String zipCode;
    private int percent;

    public CustomerCard(String number, String surname, String name, String patronymic, String phoneNumber, String city, String street, String zipCode, int percent) {
        this.number = number;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.street = street;
        this.zipCode = zipCode;
        this.percent = percent;
    }

    public String getNumber() {
        return number;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public int getPercent() {
        return percent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerCard that = (CustomerCard) o;
        return percent == that.percent &&
                Objects.equals(number, that.number) &&
                Objects.equals(name, that.name) &&
                Objects.equals(surname, that.surname) &&
                Objects.equals(patronymic, that.patronymic) &&
                Objects.equals(city, that.city) &&
                Objects.equals(street, that.street) &&
                Objects.equals(phoneNumber, that.phoneNumber) &&
                Objects.equals(zipCode, that.zipCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name, surname, patronymic, city, street, phoneNumber, zipCode, percent);
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("CustomerCard [number=").append(number)
                .append(", surname=").append(surname)
                .append(", name=").append(name)
                .append(", patronymic=").append(patronymic)
                .append(", phoneNumber=").append(phoneNumber)
                .append(", city=").append(city)
                .append(", street=").append(street)
                .append(", zipCode=").append(zipCode)
                .append(", percent=").append(percent)
                .append("]");
        return builder.toString();
    }

}