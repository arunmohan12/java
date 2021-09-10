import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.net.URL;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.*;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;

public class imgdown {
public static void main(String[] args) { 
try {
	URL url = new URL("https://m.media-amazon.com/images/I/41-SYJSrDgL.jpg");
	String destinationFile = "image.jpg";
	
	

    Image image = ImageIO.read(url); 
	int imageWidth = image.getWidth(null);
    int imageHeight = image.getHeight(null);
 
	
	
	InputStream is = url.openStream();
    OutputStream os = new FileOutputStream(destinationFile);
	
	
	byte[] b = new byte[2048];
    int length;

    while ((length = is.read(b)) != -1) {
        os.write(b, 0, length);
    }
File file = new File("image.jpg");
long fileSize = file.length();
System.out.println("Image downloaded successfully Image name is image.jpg");
System.out.println("Image size in bytes is : " + fileSize);
System.out.println("image.jpg-width :"+imageWidth);
System.out.println("image.jpg-width :"+imageHeight);

	
} catch (Exception e)
 { 	
e.printStackTrace(); 
}

	
}
}