package com.example.demo.Controller;

import com.example.demo.model.Meet;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.MeetService;

import java.util.List;

@RestController
@AllArgsConstructor
public class MeetController {
    private MeetService meetService;

    @GetMapping("/meet")
    public List<Meet> getAllMeet(@RequestParam("page") int page,
                                 @RequestParam("page_size") int pageSize){
        return meetService.getAll(page, pageSize);
    }

    @PostMapping("/meet")
    public List<Meet> createMeet(@RequestBody List<Meet> toCreate){

        return meetService.createMeet(toCreate);
    }

    @PutMapping("/meet")
    public String updateMeet(
            @RequestBody Meet meeToUpdate){
        meetService.updateMeet(meeToUpdate);
        return "updating meet";
    }
}
