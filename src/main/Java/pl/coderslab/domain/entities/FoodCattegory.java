package pl.coderslab.domain.entities;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
@Table(name="foodCattegories")
public class FoodCattegory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NotNull
    @Size(min = 2, max = 20)
    private String cattegoryName;

    @ManyToOne
    @JoinColumn(name = "food_id")
    private Food food;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCattegoryName() {
        return cattegoryName;
    }

    public void setCattegoryName(String cattegoryName) {
        this.cattegoryName = cattegoryName;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FoodCattegory foodCattegory = (FoodCattegory) o;
        return Objects.equals(id, foodCattegory.id) &&
                Objects.equals(cattegoryName, foodCattegory.cattegoryName) &&
                Objects.equals(food, foodCattegory.food);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, cattegoryName, food);
    }

    @Override
    public String toString() {
        return "FoodCattegory{" +
                "id=" + id +
                ", cattegoryName='" + cattegoryName + '\'' +
                ", food=" + food +
                '}';
    }
}
