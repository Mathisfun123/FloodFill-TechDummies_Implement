import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Floodfill_A1 {
	public static void main(String[] args) throws IOException {
		BufferedImage img_toProcess = ImageIO.read(new File("Floodfill - Image.png"));
		ImageIO.write(img_toProcess, "png", new File("Floodfill - Processed.png"));
		System.out.println("Hello");
		Raster t = img_toProcess.getTile(0,0);

		int r[]= t.getSamples(0,0,66,57,0,new int[(66*57)]);
		int b[]= t.getSamples(0,0,66,57,1,new int[(66*57)]);
		int g[]= t.getSamples(0,0,66,57,2,new int[(66*57)]);
		int [][] pixels={r,b,g};
		for (int j = 0; j < pixels.length; j++) {
			for (int i = 0; i < pixels[j].length; i++) {
				System.out.println(pixels[j][i]);
			}
		}
	}
}
