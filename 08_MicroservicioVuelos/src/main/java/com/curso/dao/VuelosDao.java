package com.curso.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.model.Vuelo;
/**
 * Interfaz dao: VuelosDao
 * @author Daniel Rodriguez
 * @version 1.0.0 02-06-2023
 */
public interface VuelosDao extends JpaRepository<Vuelo, Integer> {
	
}
