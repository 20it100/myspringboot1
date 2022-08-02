package in.ac.charusat.studentmgmtsystem.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
public class Result {


    @Id
    private Integer id;
    private Double percentage;
    private Integer semester;

    public Integer getId() {
        return id;
    }

    public Result(Integer id, Double percentage, Integer semester) {
        this.id = id;
        this.percentage = percentage;
        this.semester = semester;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }
}
