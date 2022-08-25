package com.belhaj.gestiondesuivie.Contoller;

import com.belhaj.gestiondesuivie.Services.AdminService;
import com.belhaj.gestiondesuivie.model.Admin;
import com.belhaj.gestiondesuivie.model.Parents;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    private final AdminService adminService;
    @Autowired
    public AdminController(AdminService adminservice) {
        this.adminService = adminservice ;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Parents>> getAllAdmin(){
        List<Admin> allAdmin = adminService.getallAdmin();
        return new ResponseEntity(allAdmin , HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Admin>addAdmin(@RequestBody Admin admin) {
        Admin newAdmin = adminService.addAdmin(admin);
        return new  ResponseEntity<>(newAdmin , HttpStatus.CREATED);
    }
    //
    @PutMapping("/update/{id}")
    public ResponseEntity<Admin>updateAdmin(@PathVariable(name = "id")Integer id, @RequestParam String mdp) {
        Admin updateAdmin = adminService.updateAdmin(id,mdp);
        return new  ResponseEntity<>(updateAdmin , HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?>deleteAdmin (@PathVariable Integer id){
        adminService.deleteAdmin(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
