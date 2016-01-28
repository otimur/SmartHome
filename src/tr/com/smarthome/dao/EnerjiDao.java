package tr.com.smarthome.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import tr.com.smarthome.model.Enerji;

public class EnerjiDao {
	
	public List<Enerji> listele(){
		String sql = "SELECT *  FROM Enerji";
		ResultSet rs = VeriTabaniBaglantisi.sorgula(sql);
		List<Enerji> liste = new ArrayList<Enerji>();
		try {
			while (rs.next()) {
				Enerji enerji = new Enerji();
				enerji.setEnerjiId(rs.getInt("enerji_id"));
				enerji.setTarih(rs.getDate("tarih"));
				enerji.setSaat(rs.getTime("saat"));
				enerji.setAkim(rs.getDouble("akim"));
				enerji.setGerilim(rs.getDouble("gerilim"));
				enerji.setGuc(rs.getDouble("guc"));
//				enerji.setSicaklik1(rs.getDouble("IC_ISIk1"));
//				enerji.setSicaklik2(rs.getDouble("sicaklik2"));
//				enerji.setSicaklik3(rs.getDouble("sicaklik3"));
//				enerji.setSicaklik4(rs.getDouble("sicaklik4"));
//				enerji.setDisSicaklik1(rs.getDouble("disSicaklik1"));
//				enerji.setDisSicaklik2(rs.getDouble("disSicaklik2"));
				liste.add(enerji);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return liste;
	}

}
