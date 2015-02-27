package br.com.academia.controller;

import java.util.Calendar;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.DefaultScheduleEvent;
import org.primefaces.model.DefaultScheduleModel;
import org.primefaces.model.ScheduleModel;


@ManagedBean
@ViewScoped
public class ReceitaMB {

	private ScheduleModel eventModel;

	public ReceitaMB() {
		eventModel = new DefaultScheduleModel();
		eventModel.addEvent(new DefaultScheduleEvent("R$500", new Date(), new Date()));
	}

	public ScheduleModel getEventModel() {
		return eventModel;
	}

}
