/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spring2explore.repository;

import com.mycompany.spring2explore.entities.MPerson;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 *
 * @author juang
 */
@Component
@Repository
public interface PersonRepository extends JpaRepository<MPerson, Integer>{
    
    @Query("select p from MPerson p")
    public List<MPerson> listPerson();

}
