package codeAssignTDD.TDD;

import java.util.List;

public class ScoreCalculator {
	
	List<Frame> lstFrame;
	public ScoreCalculator(List<Frame> lstFrame){
		this.lstFrame=lstFrame;
	}
	
	/*
	public int calculateScore(int frameNumber) {
		int previousScore=0;
		Frame currentFrame=lstFrame.get(frameNumber);
		if(frameNumber>0){
			previousScore=lstFrame.get(frameNumber-1).getScore();
			//For spare
			if(lstFrame.get(frameNumber-1).scoreStatus==ScoreStatus.NotSet){
				//going two steps back and fetching 2nd last frame score
				int twoPrevScore=0;
				if(lstFrame.size()>1)
					 twoPrevScore=lstFrame.get(frameNumber-2).getScore();
				
				lstFrame.get(frameNumber-1).setScore(lstFrame.get(frameNumber-1).getScore()  +currentFrame.getFirstBallScore());
			}
		}
		
		int currentFrameScore=currentFrame.getFirstBallScore()+currentFrame.getSecondBallScore();
		int totalScore=currentFrameScore+previousScore;
		
		//Spare Calculation
		if(currentFrameScore==10){
			totalScore=previousScore;
		}
		return totalScore;
	}*/
	
	public int calculateScore(int frameNumber){

		int totalScore=0;
		for(int i=0;i<lstFrame.size();i++){
			//Calculating till the frame found
			if(i>frameNumber)
				return totalScore;
			
			int previousScore=0;
			if(i>0)
				previousScore=lstFrame.get(i-1).getScore();
			
			Frame currentFrame=lstFrame.get(i);
			int currentFrameScore=currentFrame.getFirstBallScore()+currentFrame.getSecondBallScore();
			
			
			totalScore=currentFrameScore+previousScore;
			//Spare Calculation
			
			
			int tempsum=0;
			
			//Strike case for first frame and second frame
			if(i==0 && currentFrame.getFirstBallScore()==10){
				currentFrame.setScore(0);
				totalScore = 0;
			}
			
			//Strike case
			if(i>0 && lstFrame.get(i-1).getFirstBallScore()==10 ){
				//Strike case for second frame
				if(i==1 && currentFrame.getFirstBallScore()==10 && lstFrame.get(i-1).getFirstBallScore()==10){
					currentFrame.setScore(0);
					lstFrame.get(i-1).setScore(0);
					totalScore = 0;
				}
				//Strike case for 2 previous frame
				else if(i>1 && lstFrame.get(i-2).getFirstBallScore()==10){
					tempsum=lstFrame.get(i-2).getScore()+10+10+currentFrame.getFirstBallScore();
					totalScore=tempsum+currentFrameScore;
					lstFrame.get(i-2).setScore(tempsum);
					lstFrame.get(i-1).setScore(tempsum);
				}else if(i!=9){
					tempsum=lstFrame.get(i-1).getScore()+10+currentFrame.getFirstBallScore() + currentFrame.getSecondBallScore();
					totalScore=tempsum+currentFrameScore;
					lstFrame.get(i-1).setScore(tempsum);
				}
				
				//In frame 9 case, we want to enter this if statement as well as above if statement.
				if(i==9){
					tempsum=lstFrame.get(i-1).getScore()+10+currentFrame.getFirstBallScore() + currentFrame.getSecondBallScore();
					totalScore=tempsum+currentFrameScore;
					lstFrame.get(i-1).setScore(tempsum);
				}
				
			}
			
			//Spare Score
			//You have to set the previous frame score from the current frame score. Current frame score will also be updated 
			//in ths if satatement.
			else if(i>0 && (lstFrame.get(i-1).getFirstBallScore()+lstFrame.get(i-1).getSecondBallScore())==10){
				tempsum=lstFrame.get(i-1).getScore()+10+currentFrame.getFirstBallScore();
				totalScore=tempsum+currentFrameScore;
				lstFrame.get(i-1).setScore(tempsum);
			}
			if(currentFrameScore==10 && i>0){
				totalScore=lstFrame.get(i-1).getScore();
			}
			
			
			//Last frame case
			if(i==9 && (currentFrame.getFirstBallScore() + currentFrame.getSecondBallScore())>=10 ){
				totalScore=lstFrame.get(i-1).getScore()+currentFrame.getFirstBallScore() + currentFrame.getSecondBallScore() +currentFrame.getThirdBallScore();
			}
			
			
			
						
			//System.out.println("total score for fame number:"+frameNumber+" is:"+totalScore);
			currentFrame.setScore(totalScore);
			
		}
		return totalScore;
	}
	
	

}
