/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.TrainerCRUD_SB.service;

import com.example.TrainerCRUD_SB.model.Trainer;
import java.util.List;
import java.util.Optional;




public interface TrainerServiceInterface {
    
    public List<Trainer> getAllTrainers();
    
    public Trainer saveTrainer(Trainer trainer);
    
    public Optional <Trainer> getTrainerbyId (Integer id);
    
    public boolean deleteTrainerbyId (Integer id);
}
