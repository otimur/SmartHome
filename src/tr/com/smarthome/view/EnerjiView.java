package tr.com.smarthome.view;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import tr.com.smarthome.dao.EnerjiDao;
import tr.com.smarthome.model.Enerji;

@ManagedBean
public class EnerjiView {

	private List<Enerji> enerjiListesi;
	
	@PostConstruct
	public void init(){
		 enerjiListesi =  new EnerjiDao().listele();
	}

	public List<Enerji> getEnerjiListesi() {
		return enerjiListesi;
	}	
	
}
