package Test1;

import java.awt.Frame;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.imageio.ImageIO;

import net.sourceforge.javaocr.gui.meanSquareOCR.TrainingImageSpec;
import net.sourceforge.javaocr.ocrPlugins.mseOCR.CharacterRange;
import net.sourceforge.javaocr.ocrPlugins.mseOCR.OCRScanner;
import net.sourceforge.javaocr.ocrPlugins.mseOCR.TrainingImage;
import net.sourceforge.javaocr.ocrPlugins.mseOCR.TrainingImageLoader;

public class Test1 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		//트레이닝이미지 등록
		ArrayList<TrainingImageSpec> images = new ArrayList<TrainingImageSpec>();
		TrainingImageSpec newImage = new TrainingImageSpec();
		newImage.setFileLocation("./digits.jpg");
		newImage.setCharRange(new CharacterRange('0', '9'));
		images.add(newImage);


		OCRScanner ocrScanner = new OCRScanner();
		TrainingImageLoader loader = new TrainingImageLoader();
		HashMap<Character, ArrayList<TrainingImage>> trainingImages = new HashMap<Character, ArrayList<TrainingImage>>();
		Frame frame = new Frame();

		for (int i = 0; i < images.size(); i++){
		loader.load(
		        frame,
		        images.get(i).getFileLocation(),
		        images.get(i).getCharRange(),
		        trainingImages);
		}

		ocrScanner.addTrainingImages(trainingImages);
		BufferedImage targetImage = ImageIO.read(new File("./shuffledDigits.jpg"));
		String text = ocrScanner.scan(targetImage, 0, 0, 0, 0, null);

		System.out.println(text);

		
		
	}

}

