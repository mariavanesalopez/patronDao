package main.model;

public class Dentist {
    private Integer id;
    private String name;
    private String lastname;
    private  String tuition;


    public Dentist() {
    }

    public Dentist(Integer id, String name, String lastname, String tuition) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.tuition = tuition;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getTuition() {
        return tuition;
    }

    public void setTuition(String tuition) {
        this.tuition = tuition;
    }

    public boolean tuitionValid(){
        return this.tuition.length()==6;
    }
}
