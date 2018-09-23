package pl.coderslab.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.domain.entities.Reservation;
import pl.coderslab.domain.repositories.ReservationRepository;
import javax.validation.Valid;

@Controller
@RequestMapping("/rezerwacja")
public class ReservationController {

   private final ReservationRepository reservationRepository;

    public ReservationController(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @GetMapping("/all")
    public String showAllReservationsForm() {
        return "rezerwacja";
    }

    //AddReservation
    @GetMapping("/add")
    public String showAddReservation(Model model){
        model.addAttribute("reservation", new Reservation());
        return "forms/addReservation";
    }

    @PostMapping("/add")
    public String addReservation(@ModelAttribute @Valid Reservation reservation, BindingResult bindingResult){
        if( bindingResult.hasErrors()){
            return "forms/addReservation";
        }
        reservationRepository.save(reservation);
        return "redirect:/rezerwacja/all";
    }

    //EditReservation
    @GetMapping("/{id:\\d+}/edit")
    public String editReservationForm(@PathVariable Long id, Model model){
        Reservation reservation = reservationRepository.findOne(id);
        model.addAttribute(reservation);
        return "forms/editReservation";
    }

    @PostMapping("/{id:\\d+}/edit")
    public String editReservation(@PathVariable Long id, @ModelAttribute @Valid Reservation reservation, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "forms/editReservation";
        }
        Reservation reservation1 = reservationRepository.findOne(id);
        reservation.setFirstName(reservation.getFirstName());
        reservation1.setReservationNote(reservation.getReservationNote());
        reservation1.setReservationPeople(reservation.getReservationPeople());
        reservation1.setReservationTelephoneNumber(reservation.getReservationTelephoneNumber());
        reservation1.setReservationTime(reservation.getReservationTime());
        reservationRepository.save(reservation1);
        return "redirect:/rezerwacja/all";
    }

    //DeleteReservation
    @GetMapping("/{id:\\d+}/delete")
    public String deleteReservation(@PathVariable Long id){
        reservationRepository.delete(id);
        return "redirect:/rezerwacja/allFood";
    }
}