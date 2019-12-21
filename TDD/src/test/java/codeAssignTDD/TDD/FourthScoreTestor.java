package codeAssignTDD.TDD;

import junit.framework.TestCase;

import static org.junit.Assert.*;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;


public class FourthScoreTestor {
	Player player1=new Player();
	
	@Test
	public void firstFrameTestScore(){
		player1.getFrame(0).setFristBallScore(10);
		player1.getFrame(0).setSecondBallScore(0);
		assertEquals(0,player1.getFrame(0).getScore());
	}
	
	
	@Test
	public void secondFrameTestScore(){
		//setting first frame
		firstFrameTestScore();
		player1.getFrame(1).setFristBallScore(10);
		player1.getFrame(1).setSecondBallScore(0);
		assertEquals(0,player1.getFrame(1).getScore());
		assertEquals(0,player1.getFrame(0).getScore());
	}

	
	@Test
	public void SpareThirdFrameTestScore(){
		secondFrameTestScore();
		player1.getFrame(2).setFristBallScore(10);
		player1.getFrame(2).setSecondBallScore(0);
		assertEquals(30,player1.getFrame(2).getScore());
		assertEquals(30,player1.getFrame(1).getScore());
		assertEquals(30,player1.getFrame(0).getScore());
	}
	
	
	@Test
	public void SpareFourthFrameTestScore(){
		SpareThirdFrameTestScore();	
		player1.getFrame(3).setFristBallScore(10);
		player1.getFrame(3).setSecondBallScore(0);
				
		assertEquals(60,player1.getFrame(3).getScore());
		assertEquals(60,player1.getFrame(2).getScore());
		assertEquals(60,player1.getFrame(1).getScore());
	}
	
	
	@Test
	public void StrikeFifthFrameTestScore(){
		SpareFourthFrameTestScore();
		player1.getFrame(4).setFristBallScore(10);
		player1.getFrame(4).setSecondBallScore(0);
		assertEquals(90,player1.getFrame(4).getScore());
		assertEquals(90,player1.getFrame(3).getScore());
		assertEquals(90,player1.getFrame(2).getScore());
	}
	
	
	@Test
	public void SixthFrameTestScore(){
		StrikeFifthFrameTestScore();
		player1.getFrame(5).setFristBallScore(10);
		player1.getFrame(5).setSecondBallScore(0);
		assertEquals(120,player1.getFrame(5).getScore());
		assertEquals(120,player1.getFrame(4).getScore());
		assertEquals(120,player1.getFrame(3).getScore());
	}
	
	@Test
	public void SeventhFrameTestScore(){
		SixthFrameTestScore();
		player1.getFrame(6).setFristBallScore(10);
		player1.getFrame(6).setSecondBallScore(0);
		assertEquals(150,player1.getFrame(6).getScore());
		assertEquals(150,player1.getFrame(5).getScore());
		assertEquals(150,player1.getFrame(4).getScore());
	}
	
	@Test
	public void EightFrameTestScore(){
		SeventhFrameTestScore();
		player1.getFrame(7).setFristBallScore(10);
		player1.getFrame(7).setSecondBallScore(0);
		assertEquals(180,player1.getFrame(7).getScore());
		assertEquals(180,player1.getFrame(6).getScore());
		assertEquals(180,player1.getFrame(5).getScore());
	}
	
	@Test
	public void NinthFrameTestScore(){
		EightFrameTestScore();
		player1.getFrame(8).setFristBallScore(10);
		player1.getFrame(8).setSecondBallScore(0);
		assertEquals(210,player1.getFrame(8).getScore());
		assertEquals(210,player1.getFrame(7).getScore());
		assertEquals(210,player1.getFrame(6).getScore());
	}
	
	@Test
	public void TenthFrameTestScore(){
		NinthFrameTestScore();
		player1.getFrame(9).setFristBallScore(10);
		player1.getFrame(9).setSecondBallScore(10);
		player1.getFrame(9).setThirdBallScore(10);
		
		assertEquals(300,player1.getFrame(9).getScore());

		
	}
	
	
}
