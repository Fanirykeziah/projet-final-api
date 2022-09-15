package com.example.demo.service;

import com.example.demo.model.Offers;
import com.example.demo.repository.OffersRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OfferService {

    private OffersRepository offeRepository;

    public List<Offers> getAll(int page, int pageSize){
        return offeRepository.findAll();
    }

    public List<Offers> createNewOffers(List<Offers> offre){
        return offeRepository.saveAll(offre);
    }

    public String updateOffer(Offers toUpdate){
        offeRepository.save(toUpdate);
        return "updating successfull";
    }
}
