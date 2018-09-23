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
@RequestMapping("/FoodCattegory")
public class FoodCattegoryController {

    private final FoodCattegoryRepository foodCattegoryRepository;
    private final FoodRepository foodRepository;

    public FoodCattegoryController(FoodCattegoryRepository foodCattegoryRepository, FoodRepository foodRepository) {
        this.foodCattegoryRepository = foodCattegoryRepository;
        this.foodRepository = foodRepository;
    }

    @GetMapping("/all")
    public String showAllFoodsCattegoryForm(Model model) {
        model.addAttribute("foodCattegory",foodCattegoryRepository.findAll());
        return "foodCattegory";
    }

    //AddFoodCattegory
    @GetMapping("/add")
    public String showAddFoodCattegory(Model model){
        model.addAttribute("foodCattegory", new FoodCattegory());
        return "forms/addFoodCattegory";
    }

    @PostMapping("/add")
    public String addFoodCattegory(@ModelAttribute @Valid FoodCattegory foodCattegory, BindingResult bindingResult){
        if( bindingResult.hasErrors()){
            return "forms/addFoodCattegory";
        }
        foodCattegoryRepository.save(foodCattegory);
        return "redirect:/FoodCattegory/all";
    }

    //EditFoodCattegory
    @GetMapping("/{id:\\d+}/edit")
    public String editFoodCattegoryForm(@PathVariable Long id, Model model){
        FoodCattegory foodCattegory = foodCattegoryRepository.findOne(id);
        model.addAttribute(foodCattegory);
        return "forms/editFoodCattegory";
    }

    @PostMapping("/{id:\\d+}/edit")
    public String editFoodCattegory(@PathVariable Long id, @ModelAttribute @Valid FoodCattegory foodCattegory, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "forms/editFoodCattegory";
        }
        FoodCattegory foodCattegory1 = foodCattegoryRepository.findOne(id);
        foodCattegory1.setCattegoryName(foodCattegory.getCattegoryName());
        foodCattegoryRepository.save(foodCattegory1);
        return "redirect:/foodCattegory/all";
    }

    //DeleteFoodattegory
    @GetMapping("/{id:\\d+}/delete")
    public String deleteFoodCattegory(@PathVariable Long id){
        foodCattegoryRepository.delete(id);
        return "redirect:/foodCattegory/all";
    }

    @ModelAttribute("allfoods")
    public List<Food> getAllFoods(){
        return foodRepository.findAll();
    }
}
