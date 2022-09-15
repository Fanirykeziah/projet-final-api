package com.example.demo.Controller;

import com.example.demo.model.Company;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.CompanyService;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class CompanyController {
    private CompanyService companyService;

    @GetMapping("/company")
    public List<Company> getAllAboutCompany(
            @RequestParam("page") int page,
            @RequestParam("page_size") int pageSize
    ){
        return companyService.getAllCompany(page,pageSize);
    }

    @PostMapping("/company")
    public List<Company> createNewCompany(@RequestBody List<Company> company){
        return companyService.createCompany(company);
    }
}
