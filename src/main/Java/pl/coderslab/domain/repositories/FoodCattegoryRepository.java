package pl.coderslab.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.domain.entities.FoodCattegory;
import java.util.List;

public interface FoodCattegoryRepository extends JpaRepository<FoodCattegory,Long> {

    List<FoodCattegory> findByFoodId(Long id);
}