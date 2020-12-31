import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

class TestJunit {

	@Test
	 public void TestCGLBoardOne() {
	 Board b = new Board();
	 System.out.println("----TEST ONE EXECUTED----");
	 System.out.println(b.printBoard(null)); 
	 Assertions.assertEquals("Board is printed",b.printBoard(null));
	}

	 @Test
	 public void TestCGLBoardTwo() {
	 Board b = new Board();
	 System.out.println("----TEST TWO EXECUTED----");
	 Assertions.assertSame(false,b.createboard(-5,null));
	 
	 
	 }
	@Test
	 public void TestCGLBoardThree() {
	 Board b = new Board();
	 System.out.println("----TEST THREE EXECUTED----");
	 Assertions.assertSame(true,b.createboard(5,null));
	 }
	@Test
	public void TestCGLBoardFour() {
		Board b = new Board();
		System.out.println("----TEST FOUR EXECUTED----");
		int [][] i = {{1,1},{2,2},{3,3},{4,4}};
		Assertions.assertSame(true, b.createboard(5,i));
	}
	@Test
	public void TestCGLBoardFive() {
		NextGeneration c = new NextGeneration();
		System.out.println("----TEST FIVE EXECUTED----");
		Assertions.assertSame(null,c.nextgen(null));
	}
	@Test
	public void TestCGLBoardSix() {
		NextGeneration c = new NextGeneration();
		System.out.println("----TEST SIX EXECUTED----");
		Assertions.assertSame(0,c.countlivecells(4,4,null));
	}
	@Test
	public void TestCGLBoardSeven() {
		NextGeneration c = new NextGeneration();
		boolean [][]b={{false,false,false,false,false},{false,true,false,false,false},{false,false,true,false,false},{false,false,false,true,false},{false,false,false,false,true}};
	    boolean [][]s=c.nextgen(b);
	    System.out.println("----TEST SEVEN EXECUTED----");
	    Assertions.assertSame(true,s[2][2]);
	}
	@Test
	 public void TestCGLBoardEIGHT() {
	 System.out.println("======TEST EIGHT EXECUTED=======");
	 Game c=new Game();
	 Assertions.assertEquals("Board and next generation is created",c.sample());
	}  
	
}