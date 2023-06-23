package com.ppai.demo.controller;

import com.ppai.demo.entity.Permiso;
import com.ppai.demo.repository.PermisoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class Controller {
    
    @Autowired
    PermisoRepository permisoR;
    
    @GetMapping("/listPermiso")
    @ResponseBody
    public List<Permiso> list(){
        return permisoR.findAll();
    }
    
    @PostMapping("/createPermiso")
    public ResponseEntity<?> create(@RequestBody Permiso permiso){
        permisoR.save(permiso);
        return ResponseEntity.ok().build();
    }
    
}
