import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class SSPicture extends SimplePicture 
{
	///////////////////// constructors //////////////////////////////////

	/**
	 * Constructor that takes no arguments 
	 */
	public SSPicture ()
	{
		/* not needed but use it to show students the implicit call to super()
		 * child constructors always call a parent constructor 
		 */
		super();  
	}

	/**
	 * Constructor that takes a file name and creates the picture 
	 * @param fileName the name of the file to create the picture from
	 */
	public SSPicture(String fileName)
	{
		// let the parent class handle this fileName
		super(fileName);
	}

	/**
	 * Constructor that takes the width and height
	 * @param height the height of the desired picture
	 * @param width the width of the desired picture
	 */
	public SSPicture(int height, int width)
	{
		// let the parent class handle this width and height
		super(width,height);
	}

	/**
	 * Constructor that takes a picture and creates a 
	 * copy of that picture
	 * @param copyPicture the picture to copy
	 */
	public SSPicture(SSPicture copyPicture)
	{
		// let the parent class do the copy
		super(copyPicture);
	}

	/**
	 * Constructor that takes a buffered image
	 * @param image the buffered image to use
	 */
	public SSPicture(BufferedImage image)
	{
		super(image);
	}

	////////////////////// methods ///////////////////////////////////////

	/**
	 * Method to return a string with information about this picture.
	 * @return a string with information about the picture such as fileName,
	 * height and width.
	 */
	public String toString()
	{
		String output = "Picture, filename " + getFileName() + 
				" height " + getHeight() 
				+ " width " + getWidth();
		return output;

	}

	/** Method to set the blue to 0 */
	public void zeroBlue()
	{
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels)
		{
			for (Pixel pixelObj : rowArray)
			{
				pixelObj.setBlue(0);
			}
		}
	}

	/**
	 * keep only blue by settings red and green to 0
	 */
	public void keepOnlyBlue()
	{
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels)
		{
			for (Pixel pixelObj : rowArray)
			{
				pixelObj.setRed(0);
				pixelObj.setGreen(0);
			}
		}
	}

	/**
	 * turns the piture gray
	 */
	public void grayscale() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels)
		{
			for (Pixel pixelObj : rowArray)
			{
				int ave = (pixelObj.getBlue() + pixelObj.getGreen() + pixelObj.getRed())/ 3;
				pixelObj.setRed(ave);
				pixelObj.setBlue(ave);
				pixelObj.setGreen(ave);
			}
		}
	}

	/**
	 * just turns the image black
	 */
	public void negate() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels)
		{
			for (Pixel pixelObj : rowArray)
			{
				pixelObj.setRed((255-pixelObj.getRed()));
				pixelObj.setBlue((255-pixelObj.getBlue()));
				pixelObj.setGreen((255-pixelObj.getGreen()));
			}
		}
	}

	public void fixUnderWater() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels)
		{
			for (Pixel pixelObj : rowArray)
			{
				pixelObj.setBlue((pixelObj.getBlue()-100));
				pixelObj.setGreen((pixelObj.getGreen()-75));
				pixelObj.setRed(pixelObj.getRed()+50);
			}
		} 
	}

	/** Method that mirrors the picture around a 
	 * vertical mirror in the center of the picture
	 * from left to right */
	public void mirrorVertical()
	{
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int width = pixels[0].length;
		for (int row = 0; row < pixels.length; row++)
		{
			for (int col = 0; col < width / 2; col++)
			{
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][width - 1 - col];
				rightPixel.setColor(leftPixel.getColor());
			}
		} 
	}
	/** Method that mirrors the picture around a 
	 * mirror mirror in the center of the picture
	 * from top to bottem */
	public void mirrorHorrizontal() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel topPixel = null;
		Pixel botPixel = null;
		int hight = pixels.length;
		for (int row = 0; row < pixels.length; row++)
		{
			for (int col = 0; col < hight / 2; col++)
			{
				topPixel = pixels[row][col];
				botPixel = pixels[hight - 1 - row][col];
				botPixel.setColor(topPixel.getColor());
			}
		}
	}
	/** Method that mirrors the picture around a 
	 * horrizontal mirror in the center of the picture
	 * from bottem to top*/
	public void mirrorHorrizontalBotToTop() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel topPixel = null;
		Pixel botPixel = null;
		int hight = pixels.length;
		for (int row = 0; row < pixels.length; row++)
		{
			for (int col = 0; col < hight / 2; col++)
			{
				topPixel = pixels[row][col];
				botPixel = pixels[hight - 1 - row][col];
				topPixel.setColor(botPixel.getColor());
			}
		}
	}

	/** Method that mirrors the picture around a 
	 * diagnoly mirror in the center of the picture
	 */
	public void mirrorDiagonal() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int hight = pixels.length;
		for (int row = 1; row < pixels[1].length; row++)
		{
			for (int col = 0; col < row; col++)
			{
				leftPixel = pixels[row][col];
				rightPixel = pixels[col][row];
				rightPixel.setColor(leftPixel.getColor());
			}
		} 
	}

	/** Method that mirrors the picture around a 
	 * vertical mirror in the center of the picture
	 * from right to left */
	public void mirrorVerticalRightToLeft() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int width = pixels[0].length;
		for (int row = 0; row < pixels.length; row++)
		{
			for (int col = 0; col < width / 2; col++)
			{
				rightPixel = pixels[row][col];
				leftPixel = pixels[row][width - 1 - col];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
	}

	/** Mirror just part of a picture of a temple */
	public void mirrorTemple()
	{
		int mirrorPoint = 276;
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int count = 0;
		Pixel[][] pixels = this.getPixels2D();

		// loop through the rows
		for (int row = 27; row < 97; row++)
		{
			// loop from 13 to just before the mirror point
			for (int col = 13; col < mirrorPoint; col++)
			{

				leftPixel = pixels[row][col];      
				rightPixel = pixels[row]                       
						[mirrorPoint - col + mirrorPoint];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
	}
	/** Mirror arms of the snow man to give it 4 arms*/
	public void mirrorSnowman() {
		Pixel topPixel = null;
		Pixel bottomPixel = null;
		int count = 0;
		Pixel[][] pixels = this.getPixels2D();

		// loop through the rows
		for (int row = 155; row < 191; row++)
		{
			// loop from 13 to just before the mirror point
			for (int col = 98; col < 170; col++)
			{

				topPixel = pixels[row][col];      
				bottomPixel = pixels[191 - row + 191][col];
				bottomPixel.setColor(topPixel.getColor());
			}
		}
		
		for (int row = 191; row >= 155; row--)
		{
			// loop from 13 to just before the mirror point
			for (int col = 300; col >= 240; col--)
			{

				topPixel = pixels[row][col];      
				bottomPixel = pixels[191 - row + 191][col];
				bottomPixel.setColor(topPixel.getColor());
			}
		}
	}



	/* Main method for testing - each class in Java can have a main 
	 * method 
	 */
	public static void main(String[] args) 
	{
		SSPicture beach = new SSPicture("beach.jpg");
		beach.explore();
		beach.zeroBlue();
		beach.explore();
	}

} // this } is the end of class Picture, put all new methods before this
