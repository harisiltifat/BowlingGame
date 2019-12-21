package codeAssignTDD.TDD;

public class Frame {
	private int firstBallScore;
	private int secondBallScore;
	private int thirdBallScore;
	private int frameNumber;
	private ScoreCalculator scoreCalculator;
	//-1 means score is not set
	public ScoreStatus scoreStatus=ScoreStatus.NotSet;
	private int score=-1;
	
	
	public Frame(ScoreCalculator scoreCalculator, int frameNumber){
		this.scoreCalculator=scoreCalculator;
		this.frameNumber=frameNumber;
	}
	
	public void setFristBallScore(int firstBallScore){
		this.firstBallScore=firstBallScore;
	}

	public void setSecondBallScore(int secondBallScore) {
		this.secondBallScore=secondBallScore;
	}
	
	public int getSecondBallScore(){
		return this.secondBallScore;
	}
	
	public int getFirstBallScore(){
		return this.firstBallScore;
	}

	public int getScore() {
		if(scoreStatus.equals(ScoreStatus.NotSet)){
			score=scoreCalculator.calculateScore(frameNumber);
		}
		return score;
	}
	
	public void setScore(int score){
		scoreStatus=ScoreStatus.Set;
		this.score=score;
	}
	
	public void setFrameNumber(int frameNumber){
		frameNumber=this.frameNumber;
	}

	public int getThirdBallScore() {
		return thirdBallScore;
	}

	public void setThirdBallScore(int thirdBallScore) {
		this.thirdBallScore = thirdBallScore;
	}
}
