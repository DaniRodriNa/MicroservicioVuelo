package com.curso.service;

import java.util.List;

import com.curso.model.Vuelo;
/**
 * Interfaz service: VuelosService
 * @author Daniel Rodriguez
 * @version 1.0.0 02-06-2023
 */
public interface VuelosService {
	List<Vuelo> listaTotalVuelos();
	List<Vuelo> listaVuelos(int plazas);
	Vuelo elegirVuelo(int idVuelo, int plazas);
	void actualizarVuelo(int idVuelo,int plazas);
}
