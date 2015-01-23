/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testCrop()
  {
    Picture beach = new Picture("beach.jpg");
    Picture shrek = new Picture("snowman.jpg");
    beach.explore();
    shrek.explore();
    beach.crop( shrek, 10, 200, 10, 200, 100, 100 );
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }
  
   public static void testGrayscale()
  {
    Picture caterpillar = new Picture("beach.jpg");
    caterpillar.explore();
    caterpillar.grayscale();
    caterpillar.explore();
  }
  
  public static void testWater()
  {
    Picture caterpillar = new Picture("water.jpg");
    caterpillar.explore();
    caterpillar.water();
    caterpillar.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorHorizontal()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontalBotToTop();
    caterpillar.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorDiagonal()
  {
    Picture caterpillar = new Picture("beach.jpg");
    caterpillar.explore();
    caterpillar.mirrorDiagonal();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms()
  {
    Picture temple = new Picture("snowman.jpg");
    temple.explore();
    temple.mirrorArms();
    temple.explore();
  }
  

  /* Main method for testing - each class in Java can have a main 
     * method 
     */
    public static void createShrekCollage() 
    {
        Picture main = new Picture("Confused.jpg");
        Picture pic1 = main.scale().rotateCounterClockwise();
        Picture pic2 = main.scale().rotateCounterClockwise();
        Picture pic3 = main.scale().rotateClockwise();
        Picture pic4 = main.scale().rotateClockwise();
        pic1.grayscale();
        pic1.mirrorVertical();
        pic2.pixelate();
        pic3.sepia();
        pic3.mirrorHorizontal();
        pic4.zeroGreen();
        pic4.halfRed();
        main.copy(pic1,0,270);
        main.copy(pic2,310,270);
        main.copy(pic3,0,870);
        main.copy(pic4,310,870);
        main.explore();
        main.write("C:\\Users\\arin8_000\\Desktop\\PictureLab\\images\\MyCollage.jpg");
    }
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testScale()
  {
    Picture swan = new Picture("Confused.jpg");
    swan.explore();
    swan.scale().explore();
  }
  
  public static void testRotate()
  {
    Picture swan = new Picture("Confused.jpg");
    swan.explore();
    swan.scale().rotateCounterClockwise().explore();
    swan.scale().rotateClockwise().explore();
  }
  
 
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}