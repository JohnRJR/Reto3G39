/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Repositorio;

import org.springframework.stereotype.Repository;
import com.example.demo.Modelo.Cloud;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.Interface.CloudInterface;
/**
 *
 * @author USUARIO
 */

@Repository

public class CloudRepository {
     @Autowired
    private CloudInterface extencionesCrud;
    
    public List<Cloud> getAll(){
        return (List<Cloud>) extencionesCrud.findAll();
    }
    
    public Optional<Cloud> getCloud(int id){
        return extencionesCrud.findById(id);
    }
    
    public Cloud save(Cloud cloud){
        return extencionesCrud.save(cloud);
    }

    public Optional<Cloud> getcloud(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
