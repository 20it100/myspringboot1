package in.ac.charusat.studentmgmtsystem.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {

    @Id
    private Integer id;
    private String address;
    private String title;

    public Course(String title) {
        this.title = title;
    }

    public Course(Integer id, String title, String address) {
        this.id = id;
        this.address = address;


    }

    public Course(){

    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        String Title;
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}



