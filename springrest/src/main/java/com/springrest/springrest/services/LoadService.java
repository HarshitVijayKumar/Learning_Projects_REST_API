package com.springrest.springrest.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Loads;

@Service
public interface LoadService {
	
	public List<Loads> getLoads();
	
	public Loads getParticularLoad(Long loadId);
	
	public String AddLoads(Loads load);
	
	public Loads updateLoad(Long loadId,Loads load);
	
	public String DeleteLoad(Long loadId);
}
