package pl.coderslab.mvc.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.domain.entities.User;
import pl.coderslab.domain.repositories.FoodRepository;


@Controller
@RequestMapping("")
public class HomeController {

    @Autowired
    FoodRepository foodRepository;

    @GetMapping("/home")
    public String showHome(){
        return "home";
    }

    @GetMapping("/menu")
    public String showMenu(Model model){
        model.addAttribute("allfoods", foodRepository.findAll());
        return "menu";
    }

    @GetMapping("/kontakt")
    public String showKontakt(){
        return "kontakt";
    }

    @GetMapping("/galeria")
    public String showGaleria(){
        return "galeria";
    }

    @GetMapping("/about")
    public String showONas(){
        return "about";
    }

    @GetMapping("/rezerwacja")
    public String showRezerwacja(){
        return "rezerwacja";
    }

}
