package pl.coderslab.domain.entities;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="foods")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    @Size(min = 2, max = 20)
    private String foodName;

    @Column
    @NotNull
    @Size(max=600)
    private String foodDescription;

    @Column
    @NotNull
    @Max(100)
    @Min(5)
    @Digits(integer = 3, fraction = 2)
    private BigDecimal price;

    @OneToMany(mappedBy = "food")

    private List<FoodCattegory> foodCattegory;

    public List<FoodCattegory> getFoodCattegory() {
        return foodCattegory;
    }

    public void setFoodCattegory(List<FoodCattegory> foodCattegory) {
        this.foodCattegory = foodCattegory;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodDescription() {
        return foodDescription;
    }

    public void setFoodDescription(String foodDescription) {
        this.foodDescription = foodDescription;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Food food = (Food) o;
        return Objects.equals(id, food.id) &&
                Objects.equals(foodName, food.foodName) &&
                Objects.equals(foodDescription, food.foodDescription) &&
                Objects.equals(price, food.price);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, foodName, foodDescription, price);
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", foodName='" + foodName + '\'' +
                ", foodDescription='" + foodDescription + '\'' +
                ", price=" + price +
                '}';
    }
}

