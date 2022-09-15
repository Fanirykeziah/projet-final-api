package com.example.demo.service;

import com.example.demo.model.Meet;
import com.example.demo.repository.MeetRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MeetService {
    private MeetRepository meetRepository;

    public List<Meet> getAll(int page, int pageSize){
        Pageable pageable = PageRequest.of(page, pageSize);
        return meetRepository.findAll(pageable).toList();
    }

    public List<Meet> createMeet(List<Meet> tocreate){
        return meetRepository.saveAll(tocreate);
    }

    public String updateMeet(Meet meeToUpdate){
        meetRepository.save(meeToUpdate);
        return "updating successfull";
    }

    public String deleteMeetById(Long id){
        meetRepository.deleteById(id);
        return "deleted succesfull";
    }
}
