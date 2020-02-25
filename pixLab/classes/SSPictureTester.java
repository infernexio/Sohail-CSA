/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class SSPictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    SSPicture beach = new SSPicture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    SSPicture caterpillar = new SSPicture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    SSPicture temple = new SSPicture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testKeepOnlyBlue() {
	  SSPicture temple = new SSPicture("beach.jpg");
	    temple.explore();
	    temple.keepOnlyBlue();
	    temple.explore();
  }
  
  public static void testNegate() {
	  SSPicture temple = new SSPicture("beach.jpg");
	    temple.explore();
	    temple.negate();
	    temple.explore();
  }
  
  public static void textGrayscale() {
	  SSPicture temple = new SSPicture("beach.jpg");
	    temple.explore();
	    temple.grayscale();
	    temple.explore();
  }
  
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    // testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
	  textGrayscale();
    //testMirrorVertical();
    //testMirrorDiagonal();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
  }
}