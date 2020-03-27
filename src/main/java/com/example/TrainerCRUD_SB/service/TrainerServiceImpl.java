/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.TrainerCRUD_SB.service;

import com.example.TrainerCRUD_SB.model.Trainer;
import com.example.TrainerCRUD_SB.repos.TrainersRepositoryInterface;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainerServiceImpl implements TrainerServiceInterface {

    @Autowired
    TrainersRepositoryInterface trainersRepositoryInterface;
    
    @Override
    public List<Trainer> getAllTrainers() {
     
        return trainersRepositoryInterface.findAll();
    }

    @Override
    public Trainer saveTrainer(Trainer trainer) {
       return trainersRepositoryInterface.save(trainer);
    }

    @Override
    public Optional <Trainer> getTrainerbyId(Integer id) {
        return trainersRepositoryInterface.findById(id);
        }

    @Override
    public boolean deleteTrainerbyId(Integer id) {
        boolean deleted = false;
        Optional <Trainer> optionalTrainer = trainersRepositoryInterface.findById(id);
        if(optionalTrainer.isPresent()){
       trainersRepositoryInterface.deleteById(id);
        deleted = true;}
        return deleted;
    }

   


}