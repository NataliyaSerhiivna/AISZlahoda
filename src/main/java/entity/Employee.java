package entity;

import java.math.BigDecimal;
import java.util.Objects;
import java.sql.Date;
public class Employee {
    public enum Role {
        CASHIER,
        MANAGER
    }

    private String id;
    private String surname;
    private String name;
    private String patronymic;
    private Role role;
    private BigDecimal salary;
    private Date birthdate;
    private Date startDate;
    private String phoneNumber;
    private String city;
    private String street;
    private String zipCode;
    private String password;

    public Employee(String id, String surname, String name, String password, String patronymic, Role role, BigDecimal salary, Date birthdate, Date startDate, String phoneNumber, String city, String street, String zipCode) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.role = role;
        this.salary = salary;
        this.birthdate = birthdate;
        this.startDate = startDate;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.street = street;
        this.zipCode = zipCode;
        this.password = password;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public Role getRole() {
        return role;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public Date getStartDate() {
        return startDate;
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

    public String getId() {
        return id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) && Objects.equals(surname, employee.surname) && Objects.equals(name, employee.name) && Objects.equals(password, employee.password) && Objects.equals(patronymic, employee.patronymic) && role == employee.role && Objects.equals(salary, employee.salary) && Objects.equals(birthdate, employee.birthdate) && Objects.equals(startDate, employee.startDate) && Objects.equals(phoneNumber, employee.phoneNumber) && Objects.equals(city, employee.city) && Objects.equals(street, employee.street) && Objects.equals(zipCode, employee.zipCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, surname, name, password, patronymic, role, salary, birthdate, startDate, phoneNumber, city, street, zipCode);
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Employee [id=").append(id)
                .append(", surname=").append(surname)
                .append(", name=").append(name)
                .append(", patronymic=").append(patronymic)
                .append(", role=").append(role)
                .append(", salary=").append(salary)
                .append(", birthdate=").append(birthdate)
                .append(", startDate=").append(startDate)
                .append(", phoneNumber=").append(phoneNumber)
                .append(", city=").append(city)
                .append(", street=").append(street)
                .append(", zipCode=").append(zipCode)
                .append(", password=").append(password)
                .append("]");
        return builder.toString();
    }

}
