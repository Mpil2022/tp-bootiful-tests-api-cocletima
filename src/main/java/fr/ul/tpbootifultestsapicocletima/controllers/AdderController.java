package fr.ul.tpbootifultestsapicocletima.controllers;

import fr.ul.tpbootifultestsapicocletima.services.AdderService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author Clément Colné
 */
@RequestMapping(value = "/adder", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@RestController
public class AdderController {

    private final AdderService adderService;

    public AdderController(AdderService adderService) {
        this.adderService = adderService;
    }

    @GetMapping("/current")
    public int currentNum() {
        return adderService.getNum();
    }

    @PostMapping
    public int add(@RequestParam int num) {
        return adderService.add(num);
    }
}