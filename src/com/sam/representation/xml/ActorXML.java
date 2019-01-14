package com.sam.representation.xml;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import com.sam.entities.Actor;

public class ActorXML {
	public static Document ActorToXML(List<Actor> lstActor) {
		Document document = DocumentHelper.createDocument();
		Element root = document.addElement("actores");
		
		for (Actor actor : lstActor) {
			Element actorE = root.addElement("actor");
			actorE.addElement("actorId").addText(actor.getActorId()+"");
			actorE.addElement("firstName").addText(actor.getFirstName());
			actorE.addElement("lastName").addText(actor.getLastName());
		}
		
		return document;
	}
}
