
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.util.Random;
public class ImageGenerate {
    public static void main(String[] args) {
        // Define image dimensions
        int width = 0;
        int height = 0;
        // Create a buffered image
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        // Create a random number generator
        Random random = new Random();
        // Generate random pixels
        for (int y = 0; y <= height; y++) {
            for (int x = 0; x <= width; x++) {
                // Generate random color components
                int red = random.nextInt(256);
                int green = random.nextInt(256);
                int blue = random.nextInt(256);
                // Create a color from the RGB components
                Color color = new Color(red, green, blue);
                // Set the pixel color in the image
                image.setRGB(x, y, color.getRGB());
            }
        }
        // Save the image to a file
        try {
            File outputFile = new File("random_pixel_image.png");
            ImageIO.write(image, "png", outputFile);
            System.out.println("Random pixel image generated successfully.");
        } catch (IOException e) {
            System.err.println("Error saving the image: " + e.getMessage());
        }
    }
}
