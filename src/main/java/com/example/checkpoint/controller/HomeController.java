package com.example.checkpoint.controller;

import com.example.checkpoint.entity.Destination;
import com.example.checkpoint.repository.DestinationRepository;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class HomeController {

    @Autowired
    private DestinationRepository destinationRepo ;

    @GetMapping("/")
    public String index(Model model) {

        return "index";
    }


    @GetMapping("/create-destinate")
    public String createDestination(Model model) {
        Destination destination = new Destination();
        System.out.println("SALUUUUUUUUUUUUUUUUUUT");
        model.addAttribute("destination", destination);
        return "destination";
    }


    @RequestMapping("/save")
    public String saveDestination (Model model,  @ModelAttribute Destination destination){


destinationRepo.save(destination);
        return "redirect:/create-destinate";

    }

    @GetMapping("/all-destinate")
    public String getAllDestinations(Model model) {
        List<Destination> destinations = destinationRepo.findAll();

        model.addAttribute("destinations", destinations);
        return "alldesti";
    }

    @GetMapping("/deleteDest/{id}")
    public String deletePost(@PathVariable("id") Long id) {
        destinationRepo.deleteById(id);
        return "redirect:/all-destinate";
    }

}

