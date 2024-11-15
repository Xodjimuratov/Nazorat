package pdp;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    List<String> list = new ArrayList<>();
    private String name;
    private String role;

    public Employee() {
    }

    public Employee(List<String> list, String name, String role) {
        this.list = list;
        this.name = name;
        this.role = role;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "list=" + list +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}