package com.example.demo.Controller;

import com.example.demo.model.Offers;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.OfferService;

import java.util.List;
import java.util.Optional;


@RestController
@AllArgsConstructor
@CrossOrigin
public class OffersController {

    private OfferService offerService;

    @GetMapping("/offers")
    public List<Offers> getAllAboutOffers(
            @RequestParam("page") int page,
            @RequestParam("page_size") int pageSize
    ){
        return offerService.getAll(page,pageSize) ;
    }

    @PostMapping("/offers")
    public List<Offers> createNewOffers(@RequestBody List<Offers> offre){
        return offerService.createNewOffers(offre);
    }

    @PutMapping("/offers")
    public String updateOffers(
            @RequestBody Offers toUpdate){
        offerService.updateOffer(toUpdate);
        return "Offers update";
    }
}
