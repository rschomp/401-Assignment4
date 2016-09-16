package a4jedi;

public class GammaCorrect implements PixelTransformation{
	
	private double gamma;

	public GammaCorrect (double gamma){
		this.gamma = gamma;
		
	}
	public Pixel transform(Pixel p) {
		
		double red = p.getRed();
		double green = p.getGreen();
		double blue = p.getBlue();
		
		double newRed = Math.pow(red, (1.0/this.gamma));
		double newGreen = Math.pow(green, (1.0/this.gamma));
		double newBlue = Math.pow(blue, (1.0/this.gamma));
		
		return new ColorPixel(newRed,newGreen,newBlue);
	}
	

}
