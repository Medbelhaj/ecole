package com.belhaj.gestiondesuivie.Services;

import com.belhaj.gestiondesuivie.Repository.AdminRepo;
import com.belhaj.gestiondesuivie.Repository.ParentsRepo;
import com.belhaj.gestiondesuivie.model.Admin;
import com.belhaj.gestiondesuivie.model.Eleve;
import com.belhaj.gestiondesuivie.model.Parents;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {
    private final AdminRepo adminRepo;
    @Autowired
    public AdminService(AdminRepo adminRepo) {
        this.adminRepo = adminRepo;
    }
    public List<Admin> getallAdmin() {
        return adminRepo.findAll();

    }

    public Admin addAdmin (Admin admin) {
        return adminRepo.save(admin);
    }

    public Admin updateAdmin (Integer id, String mdp) {
        Optional<Admin> admin = adminRepo.findById(id);
        Admin admin1 = admin.get();
        admin1.setMdp(mdp);
        return adminRepo.save(admin1);    }

    public void deleteAdmin(Integer id) {
        adminRepo.deleteById(id);
    }
}
