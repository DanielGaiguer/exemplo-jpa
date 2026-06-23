/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exemplo.jpa.repository;

import com.exemplo.jpa.model.AutorDTO;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AutorRepository extends JpaRepository<AutorDTO, Integer>{
    
}
