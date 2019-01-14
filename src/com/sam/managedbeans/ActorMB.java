package com.sam.managedbeans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.sam.dao.ActorDao;
import com.sam.entities.Actor;

@ManagedBean (name = "actorMB")
@SessionScoped
public class ActorMB {
	private List<Actor> lstActor;
	
	@PostConstruct
	public void init() {
		lstActor = new  ArrayList<Actor>();
		
		getActores();
	}
	
	public void getActores() {
		lstActor = ActorDao.listActor();
	}

	public List<Actor> getLstActor() {
		return lstActor;
	}

	public void setLstActor(List<Actor> lstActor) {
		this.lstActor = lstActor;
	}
	
}
