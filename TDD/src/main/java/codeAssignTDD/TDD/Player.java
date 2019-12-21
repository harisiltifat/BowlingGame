package codeAssignTDD.TDD;

import java.util.ArrayList;
import java.util.List;

public class Player {

	List<Frame> lstFrame=new ArrayList<Frame>();
	ScoreCalculator scoreCalculator=new ScoreCalculator(lstFrame); 
	public Player(){
		for(int i=0;i<10;i++){
			lstFrame.add(new Frame(scoreCalculator,i));
		}
	}
	
	
	public Frame getFrame(int i) {
		return lstFrame.get(i);
	}

}
