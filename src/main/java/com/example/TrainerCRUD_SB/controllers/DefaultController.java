package com.example.TrainerCRUD_SB.controllers;

import com.example.TrainerCRUD_SB.model.Trainer;
import com.example.TrainerCRUD_SB.service.TrainerServiceInterface;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DefaultController {

    @Autowired
    TrainerServiceInterface trainerServiceInterface;

    // get all trainers:
    @GetMapping("/")
    public String getAllTrainers(ModelMap modelmap) {
        List<Trainer> trainers = trainerServiceInterface.getAllTrainers();
        modelmap.addAttribute("trainers", trainers);
        return "alltrainers";
    }

    //add and save trainer: 
    @GetMapping("/addtrainer")
    public String addTrainer(ModelMap modelmap) {
        Trainer trainer = new Trainer();
        modelmap.addAttribute("trainer", trainer);
        return "addTrainerForm";
    }

    @PostMapping("/saveTrainer")
    public String saveTrainer(@ModelAttribute("trainer") Trainer trainer,
            ModelMap modelmap) {
        trainerServiceInterface.saveTrainer(trainer);
         return "redirect:/";
    }

    //edit:
    @GetMapping("/edittrainer-{id}")
    public String editTrainer(@PathVariable Integer id,
            ModelMap modelmap) {
        Optional<Trainer> trainerOptional = trainerServiceInterface.getTrainerbyId(id);
        if (trainerOptional.isPresent()) {
            modelmap.addAttribute("trainer", trainerOptional.get());
            return "editTrainerForm";
        }
        String msg = "** Trainer not found. Please try again **";
        modelmap.addAttribute("message", msg);
        return "forward:/";
    }

    //delete:
    @GetMapping("/deletetrainer-{id}")
    public String deleteTrainer(@PathVariable Integer id,
            ModelMap modelmap) {
        boolean deleted = trainerServiceInterface.deleteTrainerbyId(id);
        System.out.println(deleted);
        if (deleted) {
                return "redirect:/";
        }
        String msg = "** Something went wrong, please try again **";
        modelmap.addAttribute("message", msg);
        return "forward:/";
    }

}
