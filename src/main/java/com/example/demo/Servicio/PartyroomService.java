/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Servicio;

import com.example.demo.Repositorio.PartyroomRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Modelo.Partyroom;
/**
 *
 * @author USUARIO
 */

@Service

public class PartyroomService {
    @Autowired
    private PartyroomRepository partyroomRepository;
    
    public List<Partyroom> getAll(){
        return partyroomRepository.getAll();
    }
    
    public Optional<Partyroom> getPartyroom(int id){
        return partyroomRepository.getPartyroom(id);
    }
    
    public Partyroom save (Partyroom partyroom){
        if (partyroom.getId() == null){
            return partyroomRepository.save(partyroom);
        } else {
            Optional<Partyroom> partyroom1 = partyroomRepository.getPartyroom(partyroom.getId());
            if(partyroom1.isEmpty()){
                return partyroomRepository.save(partyroom);
            } else {
                return partyroom;
            }
        }
    }
}
