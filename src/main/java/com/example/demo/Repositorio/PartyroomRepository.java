/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Repositorio;

import org.springframework.stereotype.Repository;
import com.example.demo.Modelo.Partyroom;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.Interface.PartyroomInterface;
/**
 *
 * @author USUARIO
 */

@Repository

public class PartyroomRepository {
     @Autowired
    private PartyroomInterface extencionesCrud;
    
    public List<Partyroom> getAll(){
        return (List<Partyroom>) extencionesCrud.findAll();
    }
    
    public Optional<Partyroom> getPartyroom(int id){
        return extencionesCrud.findById(id);
    }
    
    public Partyroom save(Partyroom partyroom){
        return extencionesCrud.save(partyroom);
    }

    public Optional<Partyroom> getpartyroom(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
