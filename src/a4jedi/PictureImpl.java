package a4jedi;

public class PictureImpl extends AnyPicture implements Picture {

	private int width;
	private int height;

	private Pixel[][] array;
	
	public PictureImpl(int width, int height){
		this.width = width;
		this.height = height;
		array = new Pixel[height][width];
		
		for (int i = 0; i<height; i++) {
			
			for (int k = 0; k<width; k++) {
				setPixel(k, i, new ColorPixel (1.0, 1.0, 1.0));	
			}	
		}
	}

	public int getWidth() {
		return width;
	}

	
	public int getHeight() {
		return height;
	}


	public void setPixel(int x, int y, Pixel p) {
		array[y][x] = p;
		
	}
	
	public Pixel getPixel(int x, int y) {
		return array[y][x];
		
	}
}
