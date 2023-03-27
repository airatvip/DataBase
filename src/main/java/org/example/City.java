package org.example;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "city_id")
    private int city_id;
    @Column(name = "city_name")
    private String city_name;

    @OneToMany(mappedBy = "city_id", cascade = CascadeType.ALL)
    private List<Employee> employeeList = new ArrayList<>();

    public City(int city_id, String city_name) {
        this.city_id = city_id;
        this.city_name = city_name;
    }

    public City(int city_id, String city_name, List<Employee> employeeList) {
        this.city_id = city_id;
        this.city_name = city_name;
        this.employeeList = employeeList;
    }

    public City() {

    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    @Override
    public String toString() {
        return "City{" +
                "city_id=" + city_id +
                ", city_name='" + city_name + '\'' +
                '}';
    }
}
