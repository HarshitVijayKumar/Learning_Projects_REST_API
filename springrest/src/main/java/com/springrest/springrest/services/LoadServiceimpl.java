package com.springrest.springrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.LoadDao;
import com.springrest.springrest.entities.Loads;

@Service
public class LoadServiceimpl implements LoadService {
	
	//List<Load> list;
	
	@Autowired
	private LoadDao loadDao;
	
	public LoadServiceimpl() {
	}

	@Override
	public List<Loads> getLoads() {
		return loadDao.findAll();
	}

	@Override
	public Loads getParticularLoad(Long loadId) {
		//Load l = null;
		//for (Load i:list) {
		//	if(i.getLoadId()==loadId){
		//		l = i;
		//		break;
		//	}
		//}
		return loadDao.findById(loadId).get();
	}

	@Override
	public String AddLoads(Loads load) {
		//list.add(load);
		loadDao.save(load);
		return "Load Details Added Successfully!";
	}

	@Override
	public String DeleteLoad(Long loadId) {
		//Load l = null;
		//int index=0;
		//for(Load i:list) {
		//	if(i.getLoadId()==loadId) {
		//		l=i;
		//		list.remove(index);
		//		break;
		//	}
		//	index++;
		//}
		Loads entity = loadDao.getOne(loadId);
		loadDao.delete(entity);
		return "Load Successfully Deleted !";
	}

	@Override
	public Loads updateLoad(Long loadId, Loads load) {
		//Load l = null;
		//for (Load i:list) {
		//	if(i.getLoadId()==loadId){
		//		i.setLoadingPoint(load.getLoadingPoint());
		//		i.setUnloadingPoint(load.getUnloadingPoint());
		//		i.setProductType(load.getProductType());
		//		i.setTruckType(load.getTruckType());
		//		i.setNoOfTrucks(load.getNoOfTrucks());
		//		i.setWeight(load.getWeight());
		//		i.setComment(load.getComment());
		//		i.setDate(load.getDate());
		//		l = i;
		//		break;
		//	}
		//}
		loadDao.save(load);
		return load;
	}

}
