package OwnTests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import com.sun.org.apache.xalan.internal.lib.Extensions;

import Testprogram.Factorial;
import Testprogram.Frequency;
import Testprogram.MemberVariable;
import Testprogram.NewClass;
import Testprogram.Student;
import Testprogram.TestClass;
import OwnTests.PowerOfFour;
public class Testing {
	private static Factorial fact;
	private static NewClass cl;
	private static TestClass testclass;
	private static MemberVariable member;
	private static Student student;
	private static Frequency fq;
	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		testclass = new TestClass();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		testclass= null;

	}
	@SuppressWarnings("deprecation")


	@Test
	public void testReverse(){
		
		assertEquals(121, testclass.reverse(121));

	}
	@Test
	public void testprint() {
		assertEquals(true,testclass.isPowerOfFour(64));
	}
	@Test
	public void testTestin() {
		String conv="HI HELLO";
		assertEquals( conv, testclass.convertUpper("/home/jason/Documents/something"));
		assertEquals("9.0", testclass.findLength("/home/jason/Documents/something"));
	}
	
	
	
	@Test
	public void testEvenNum(){
		assertEquals(true,testclass.Even(8));
		assertEquals(false,testclass.Even(5));
	}
	
	  @Test 
	  public void testDisplayMemberVariables() { 
		  assertArrayEquals(new String[]{"Members name:Harry Potter","member salary:2500.3","member age:30"},member.displayMemberVariables(new String[]{"Members name:","member salary:","member age:"}));
 }
    @Test
    public void testDisplayExt() {
//    	String text1= "Hi hello";
    	assertEquals("Hi hello",cl.Sanjana("/home/jason/Documents/"));
    }
	  @Test
		public void testStudent() {
			String[] expect={"81.5","65","98"};
			int[] array={86,65,98,77};
			String[] actual=student.findAvgMinMax(4,array);
			assertArrayEquals(expect,actual);
			
		}
	  @Test
	  public void testFact() {
		  


	      assertEquals("hdafadaidha", 479001600, fact.printIntFactorials(1, 1));
	      
	      assertEquals("hdafadaidha",2432902008176640000L, fact.printLongFactorials(1, 1));
	  }
	  @Test
	  public void testFreq() {
		  assertEquals("{im=2, jason=2, hello=1}" , fq.output());
	  }
}
