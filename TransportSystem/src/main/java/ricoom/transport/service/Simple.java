package ricoom.transport.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ricoom.transport.dao.Passanger;
import ricoom.transport.dao.Stage;
import ricoom.transport.repository.PassangerRepo;
import ricoom.transport.repository.StageRepo;


@Service
public class Simple {
	@Autowired
      private PassangerRepo passRepo;
	@Autowired
	private StageRepo stageRepo;
	
	public void CustDetails(Passanger passanger,Stage stage) {
		stage.setPassanger(passanger);
		passRepo.save(passanger);
	}
   
	public void AddPlaces(Stage stage) {
		stageRepo.save(stage);
	}
	
	public List<Stage> showStages(){
		List<Stage> allTowns=new ArrayList<Stage>();
		allTowns=stageRepo.findAll();

		return allTowns;
		
	}
}
