package com.curso.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.VuelosDao;
import com.curso.model.Vuelo;
/**
 * Clase que implementa el service: VuelosServiceImpl
 * @author Daniel Rodriguez
 * @version 1.0.0 02-06-2023
 */
@Service
public class VuelosServiceImpl implements VuelosService {
	@Autowired
	VuelosDao dao;
	@Override
	public List<Vuelo> listaVuelos(int plazas) {
		List<Vuelo> vuelos=dao.findAll();
		List<Vuelo> vuelosPlazas=new ArrayList<>();
		for(Vuelo vuelo:vuelos) {
			if(vuelo.getPlazas()>=plazas) {
				vuelosPlazas.add(vuelo);
			}
		}
		return vuelosPlazas;
	}

	@Override
	public Vuelo elegirVuelo(int idVuelo, int plazas) {
		Vuelo vuelo=new Vuelo();
		for(int i=0;i<listaVuelos(plazas).size();i++) {
			if(listaVuelos(plazas).get(i).getIdVuelo()==idVuelo) {
				vuelo=listaVuelos(plazas).get(i);
			}
		}
		return vuelo;
	}

	@Override
	public List<Vuelo> listaTotalVuelos() {
		return dao.findAll();
	}

	@Override
	public void actualizarVuelo(int idVuelo,int plazas) {
		Vuelo vuelo=dao.findById(idVuelo).orElse(null);
		vuelo.setPlazas(vuelo.getPlazas()-plazas);
		dao.save(vuelo);
	}

}
