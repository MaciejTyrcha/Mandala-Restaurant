package pl.coderslab.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.domain.entities.Food;
import pl.coderslab.domain.entities.FoodCattegory;
import pl.coderslab.domain.repositories.FoodCattegoryRepository;
import pl.coderslab.domain.repositories.FoodRepository;
import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/menu")
public class FoodController {

    private final FoodRepository foodRepository;
    private final FoodCattegoryRepository foodCattegoryRepository;

    public FoodController(FoodRepository foodRepository, FoodCattegoryRepository foodCattegoryRepository) {
        this.foodRepository = foodRepository;
        this.foodCattegoryRepository = foodCattegoryRepository;
    }

    //AddFood
    @GetMapping("/add")
    public String showAddFood(Model model){
        model.addAttribute("food", new Food());
        return "forms/addFood";
    }

    @PostMapping("/add")
    public String addFood(@ModelAttribute @Valid Food food, BindingResult bindingResult){
        if( bindingResult.hasErrors()){
            return "forms/addFood";
        }
        foodRepository.save(food);
        return "redirect:/menu";
    }

    //EditFood
    @GetMapping("/{id:\\d+}/edit")
    public String editFoodForm(@PathVariable Long id, Model model){
        Food food = foodRepository.findOne(id);
        model.addAttribute(food);
        return "forms/editFood";
    }

    @PostMapping("/{id:\\d+}/edit")
    public String editFood(@PathVariable Long id, @ModelAttribute @Valid Food food, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "forms/editFood";
        }
        Food food1 = foodRepository.findOne(id);
        food1.setFoodName(food.getFoodName());
        food1.setFoodDescription(food.getFoodDescription());
        food1.setPrice(food.getPrice());
        foodRepository.save(food1);
        return "redirect:/menu";
    }

    //DeleteFood
    @GetMapping("/{id:\\d+}/delete")
    public String deleteFood(@PathVariable Long id){
        foodRepository.delete(id);
        return "redirect:/menu";
    }

    @GetMapping("/{id:\\d+}/foodCattegory")
    public String showCattegoriesByFood(@PathVariable Long id, Model model){
        List<FoodCattegory> foodCattegories = foodCattegoryRepository.findByFoodId(id);
        model.addAttribute("foodCattegory",foodCattegories);
        return "foodCattegory";
    }

    @ModelAttribute("allfoods")
    public List<Food> getAllFoods(){
        return foodRepository.findAll();
    }
}
