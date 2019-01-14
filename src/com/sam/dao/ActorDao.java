package com.sam.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.sam.entities.Actor;
import com.sam.utilities.DoConnection;

public class ActorDao {
	public static List<Actor> listActor() {
		List<Actor> lstActor = new ArrayList<Actor>();
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM actor";
		
		try {
			con = DoConnection.doConnection();
			st = con.createStatement();
			rs = st.executeQuery(sql);
			
			while (rs.next()) {
				lstActor.add(new Actor(rs.getInt("actor_id"), rs.getString("first_name"), rs.getString("last_name")));
			}
		} catch (Exception e) {
			System.err.println("Error al listar actores");
			e.printStackTrace();
		}
		
		return lstActor;
	}
}
