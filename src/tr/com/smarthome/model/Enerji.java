package tr.com.smarthome.model;

import java.util.Date;

public class Enerji {

	private Integer enerjiId;
	private Date tarih;
	private Date saat;
	private Double akim;
	private Double gerilim;
	private Double guc;
	private Double sicaklik1;
	private Double sicaklik2;
	private Double sicaklik3;
	private Double sicaklik4;
	private Double disSicaklik1;
	private Double disSicaklik2;
	
	public Date getTarih() {
		return tarih;
	}
	public void setTarih(Date tarih) {
		this.tarih = tarih;
	}
	public Date getSaat() {
		return saat;
	}
	public void setSaat(Date saat) {
		this.saat = saat;
	}
	public Double getAkim() {
		return akim;
	}
	public void setAkim(Double akim) {
		this.akim = akim;
	}
	public Double getGerilim() {
		return gerilim;
	}
	public void setGerilim(Double gerilim) {
		this.gerilim = gerilim;
	}
	public Double getGuc() {
		return akim*gerilim;
	}
	public void setGuc(Double guc) {
		this.guc = guc;
	}
	public Double getSicaklik1() {
		return sicaklik1;
	}
	public void setSicaklik1(Double sicaklik1) {
		this.sicaklik1 = sicaklik1;
	}
	public Double getSicaklik2() {
		return sicaklik2;
	}
	public void setSicaklik2(Double sicaklik2) {
		this.sicaklik2 = sicaklik2;
	}
	public Double getSicaklik3() {
		return sicaklik3;
	}
	public void setSicaklik3(Double sicaklik3) {
		this.sicaklik3 = sicaklik3;
	}
	public Double getSicaklik4() {
		return sicaklik4;
	}
	public void setSicaklik4(Double sicaklik4) {
		this.sicaklik4 = sicaklik4;
	}
	public Double getDisSicaklik1() {
		return disSicaklik1;
	}
	public void setDisSicaklik1(Double disSicaklik1) {
		this.disSicaklik1 = disSicaklik1;
	}
	public Double getDisSicaklik2() {
		return disSicaklik2;
	}
	public void setDisSicaklik2(Double disSicaklik2) {
		this.disSicaklik2 = disSicaklik2;
	}
	public Integer getEnerjiId() {
		return enerjiId;
	}
	public void setEnerjiId(Integer enerjiId) {
		this.enerjiId = enerjiId;
	}
	
}
