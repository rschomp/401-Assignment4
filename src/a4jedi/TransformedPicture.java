package a4jedi;

public class TransformedPicture extends AnyPicture{
	
	private Picture source;
	private PixelTransformation xform;
	
	public TransformedPicture (Picture source, PixelTransformation xform){
		this.source = source;
		this.xform = xform;
	}


	public int getWidth() {
		return source.getWidth();
	}

	
	public int getHeight() {
		return source.getHeight();
	}

	
	public void setPixel(int x, int y, Pixel p) {
		throw new UnsupportedOperationException ("cannot set pixel");
		
	}


	public Pixel getPixel(int x, int y) {
		Pixel p = source.getPixel(x, y);
		return this.xform.transform(p);
	}
	
}
