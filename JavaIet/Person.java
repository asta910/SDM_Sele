package Five_Oct_2024;

public class Person {
    private int id;
    private String name;
    private String address;

    Person(int id, String address, String name) {
        this.id = id;
        this.address = address;
        this.name = name;
    }
    Person(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Person :" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'';
    }
}
