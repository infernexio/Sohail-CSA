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
  /** Method to test mirror vertical right to left */
  public static void testMirrorVerticalRightToLeft() {
	  SSPicture caterpillar = new SSPicture("temple.jpg");
	    caterpillar.explore();
	    caterpillar.mirrorVerticalRightToLeft();
	    caterpillar.explore();
  }
  /** Method to test mirror vertical right to left */
  public static void testHorrizontal() {
	  SSPicture caterpillar = new SSPicture("KatieFancy.jpg");
	    caterpillar.explore();
	    caterpillar.mirrorHorrizontal();
	    caterpillar.explore();
  }
  /** Method to test mirror vertical right to left */
  public static void testHorrizontalBotToTop() {
	  SSPicture caterpillar = new SSPicture("KatieFancy.jpg");
	    caterpillar.explore();
	    caterpillar.mirrorHorrizontalBotToTop();
	    caterpillar.explore();
  }
  /** Method to test mirror vertical right to left */
  public static void testDiagonal() {
	  SSPicture caterpillar = new SSPicture("KatieFancy.jpg");
	    caterpillar.explore();
	    caterpillar.mirrorDiagonal();
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
  
  /** Method to test mirror snowman */
  public static void testMirrorSnowman()
  {
    SSPicture temple = new SSPicture("snowman.jpg");
    temple.explore();
    temple.mirrorSnowman();
    temple.explore();
  }
  /** Method to test keep only blue */
  public static void testKeepOnlyBlue() {
	  SSPicture temple = new SSPicture("beach.jpg");
	    temple.explore();
	    temple.keepOnlyBlue();
	    temple.explore();
  }
  /** Method to test negative */
  public static void testNegate() {
	  SSPicture temple = new SSPicture("beach.jpg");
	    temple.explore();
	    temple.negate();
	    temple.explore();
  }
  /** Method to test gray scale */
  public static void textGrayscale() {
	  SSPicture temple = new SSPicture("beach.jpg");
	    temple.explore();
	    temple.grayscale();
	    temple.explore();
  }
  /** Method to test fix under water */
  public static void testFixUnderWater() {
	  SSPicture temple = new SSPicture("water.jpg");
	    temple.explore();
	    temple.fixUnderWater();
	    temple.explore();
  }
  
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
	// testFixUnderWater();
    // testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
	//testMirrorVerticalRightToLeft();
	//testHorrizontal();
	//testHorrizontalBotToTop();
	//testDiagonal();
	//textGrayscale();
    //testMirrorVertical();
    //testMirrorDiagonal();
	//testMirrorTemple();
	  testMirrorSnowman();
    //testMirrorArms();
    //testMirrorGull();
  }
}