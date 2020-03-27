/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.TrainerCRUD_SB.repos;

import com.example.TrainerCRUD_SB.model.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainersRepositoryInterface extends JpaRepository<Trainer, Integer> {
    
}
