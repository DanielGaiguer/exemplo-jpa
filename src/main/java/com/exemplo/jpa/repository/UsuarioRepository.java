/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.exemplo.jpa.repository;

import com.exemplo.jpa.model.UsuarioDTO;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author gaigu
 */
public interface UsuarioRepository extends JpaRepository<UsuarioDTO, Integer>{
    @Query
    Optional<UsuarioDTO> findByEmailAndPassword(String email, String senha);
}
