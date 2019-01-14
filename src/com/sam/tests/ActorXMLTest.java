package com.sam.tests;

import com.sam.dao.ActorDao;
import com.sam.representation.xml.ActorXML;

public class ActorXMLTest {

	public static void main(String[] args) {
		System.out.println(ActorXML.ActorToXML(ActorDao.listActor()).asXML());

	}

}
