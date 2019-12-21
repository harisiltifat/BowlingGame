package codeAssignTDD.TDD;

import junit.framework.TestCase;

import static org.junit.Assert.*;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;


public class ScoreTestor {
	Player player1=new Player();
	
	@Test
	public void firstFrameTestScore(){
		player1.getFrame(0).setFristBallScore(1);
		player1.getFrame(0).setSecondBallScore(4);
		assertEquals(5,player1.getFrame(0).getScore());
	}
	
	@Test
	public void secondFrameTestScore(){
		//setting first frame
		firstFrameTestScore();
		player1.getFrame(1).setFristBallScore(4);
		player1.getFrame(1).setSecondBallScore(2);
		assertEquals(11,player1.getFrame(1).getScore());
	}

	
	@Test
	public void SpareThirdFrameTestScore(){
		secondFrameTestScore();
		player1.getFrame(2).setFristBallScore(4);
		player1.getFrame(2).setSecondBallScore(6);
		assertEquals(player1.getFrame(1).getScore(),player1.getFrame(2).getScore());
	}
	
	@Test
	public void SpareFourthFrameTestScore(){
		SpareThirdFrameTestScore();	
		player1.getFrame(3).setFristBallScore(3);
		player1.getFrame(3).setSecondBallScore(2);
				
		assertEquals(29,player1.getFrame(3).getScore());
		assertEquals(24,player1.getFrame(2).getScore());
	}
	
	@Test
	public void StrikeFifthFrameTestScore(){
		SpareFourthFrameTestScore();
		player1.getFrame(4).setFristBallScore(10);
		player1.getFrame(4).setSecondBallScore(0);
		assertEquals(29,player1.getFrame(4).getScore());
	}
	
	@Test
	public void SixthFrameTestScore(){
		StrikeFifthFrameTestScore();
		player1.getFrame(5).setFristBallScore(3);
		player1.getFrame(5).setSecondBallScore(2);
		assertEquals(49,player1.getFrame(5).getScore());
		assertEquals(44,player1.getFrame(4).getScore());
	}
	
	@Test
	public void SeventhFrameTestScore(){
		SixthFrameTestScore();
		player1.getFrame(6).setFristBallScore(4);
		player1.getFrame(6).setSecondBallScore(5);
		assertEquals(58,player1.getFrame(6).getScore());
	}
	
	@Test
	public void EightFrameTestScore(){
		SeventhFrameTestScore();
		player1.getFrame(7).setFristBallScore(5);
		player1.getFrame(7).setSecondBallScore(5);
		assertEquals(58,player1.getFrame(7).getScore());
	}
	
	@Test
	public void NinthFrameTestScore(){
		EightFrameTestScore();
		player1.getFrame(8).setFristBallScore(2);
		player1.getFrame(8).setSecondBallScore(3);
		assertEquals(75,player1.getFrame(8).getScore());
		assertEquals(70,player1.getFrame(7).getScore());
	}
	
	@Test
	public void TenthFrameTestScore(){
		NinthFrameTestScore();
		player1.getFrame(9).setFristBallScore(6);
		player1.getFrame(9).setSecondBallScore(2);
		assertEquals(83,player1.getFrame(9).getScore());
		
	}
	
	@Test
	public void TenthFrameSpareTestScore(){
		NinthFrameTestScore();
		player1.getFrame(9).setFristBallScore(8);
		player1.getFrame(9).setSecondBallScore(2);
		player1.getFrame(9).setThirdBallScore(3);
		assertEquals(88,player1.getFrame(9).getScore());
		
	}
}
