import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Floodfill_A1 {
	public static void main(String[] args) throws IOException {
		BufferedImage img_toProcess = ImageIO.read(new File("Floodfill - Image.png"));
		ImageIO.write(img_toProcess, "png", new File("Floodfill - Processed.png"));
		System.out.println("Hello");

	}
}
