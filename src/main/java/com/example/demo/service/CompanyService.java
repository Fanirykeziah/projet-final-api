package com.example.demo.service;

import com.example.demo.model.Company;
import com.example.demo.repository.CompanyRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CompanyService {
  private CompanyRepository companyRepository;

  public List<Company> getAllCompany(int page,int pageSize){
      Pageable pageable = PageRequest.of(page, pageSize);
      return companyRepository.findAll(pageable).toList();
  }
  public List<Company> createCompany(List<Company> newComp){
      return companyRepository.saveAll(newComp);
  }

}
