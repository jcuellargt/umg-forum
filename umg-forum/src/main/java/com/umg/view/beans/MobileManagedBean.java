package com.umg.view.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.umg.bs.InformationService;

@ManagedBean
@SessionScoped
public class MobileManagedBean {
	
	private String carne = "";
	private InformationService informationService = new InformationService();

	public String login(){
		if(getInformationService().existeAlumno(getCarne())){
			return "pm:success";
		}
		return "pm:failure";
	}

	public String getCarne() {
		return carne;
	}



	public void setCarne(String carne) {
		this.carne = carne;
	}

	public InformationService getInformationService() {
		return informationService;
	}

	public void setInformationService(InformationService informationService) {
		this.informationService = informationService;
	}
	
	
}
