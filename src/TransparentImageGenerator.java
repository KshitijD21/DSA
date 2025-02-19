import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class TransparentImageGenerator {
    public static void main(String[] args) {
        // Define image dimensions (1px × 1px)
        int width = 1;
        int height = 1;

        // Create a BufferedImage with an alpha channel (transparency)
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

        // Set the single pixel to fully transparent
        Color transparent = new Color(0, 0, 0, 0); // (R=0, G=0, B=0, A=0 -> fully transparent)
        image.setRGB(0, 0, transparent.getRGB());

        // Save the image as a PNG file
        try {
            File outputFile = new File("transparent_1px.png");
            ImageIO.write(image, "png", outputFile);
            System.out.println("Transparent 1×1 image generated successfully.");
        } catch (IOException e) {
            System.err.println("Error saving the image: " + e.getMessage());
        }
    }
}
