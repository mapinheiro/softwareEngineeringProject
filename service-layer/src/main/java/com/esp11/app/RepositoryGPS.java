/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esp11.app;

import org.springframework.data.repository.CrudRepository;

import com.esp11.app.FighterGPS;
import java.util.List;

/**
 *
 * @author manuel
 */
public interface RepositoryGPS extends CrudRepository<FighterGPS,Integer>{   
    
    List<FighterGPS> findByName(String name);
}