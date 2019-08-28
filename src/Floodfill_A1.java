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
		int i[]= t.getSamples(0,0,5,5,0,new int[25]);
		for (int j = 0; j < i.length; j++) {
			int i1 = i[j];
			System.out.println(i1);
		}
	}
}
