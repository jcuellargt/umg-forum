package com.umg.bs;

import com.umg.bs.dao.InformationDao;

public class InformationService {

	private InformationDao informationDao=new InformationDao();
	
	public boolean existeAlumno(String carne){
		Long carneLong = Long.valueOf(carne.replaceAll("-", ""));
		return informationDao.existeAlumno(carneLong);
	}
	
}
