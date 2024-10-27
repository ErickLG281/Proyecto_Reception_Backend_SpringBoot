package com.ggs.receptionbackend.controller.login;

import com.ggs.receptionbackend.DTO.CompanyDTO;
import com.ggs.receptionbackend.DTO.ReceptionDTO;
import com.ggs.receptionbackend.entity.login.rols.Company;
import com.ggs.receptionbackend.service.login_service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("company")
@CrossOrigin("http://localhost:5173")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping("/category/{categoryId}")
    public ResponseEntity<List<ReceptionDTO>> findByCategoriesCategoryId(@PathVariable(name = "categoryId") Long categoryId) {
        List<ReceptionDTO> receptions = companyService.searchByCategoriesCategoryId(categoryId);
        if (!receptions.isEmpty()) {
            return ResponseEntity.ok(receptions);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{companyId}")
    public ResponseEntity<Company> searchCompanyById(@PathVariable(name = "companyId") Long id) {
        Company enterprise = companyService.searchCompanyById(id);
        if ( enterprise != null) {
            return ResponseEntity.ok(enterprise);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/create")
    public ResponseEntity<Company> createCompany(@RequestBody CompanyDTO companyDTO){
        Company newCompany = companyService.createCompany(companyDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(newCompany);
    }

    @PutMapping("/update/{companyId}")
    public ResponseEntity<Company> updateCompany(@PathVariable(name = "companyId") Long id, @RequestBody Company enterprise){
        Company newEnterprise = companyService.updateCompany(id, enterprise);
        if (newEnterprise != null) {
            return ResponseEntity.ok(newEnterprise);
        } else {
            return ResponseEntity.notFound().build();
        }

    }

    @DeleteMapping("/delete/{companyId}")
    public ResponseEntity<Void> deleteCompany(@PathVariable(name = "companyId") Long id){
        companyService.deleteCompany(id);
        return ResponseEntity.noContent().build();
    }


}
