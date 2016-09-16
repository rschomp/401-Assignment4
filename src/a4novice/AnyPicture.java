package a4novice;

public abstract class AnyPicture implements Picture {
	
		int width;
		int height;
		
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	abstract public void setPixel(int x, int y, Pixel p);
	
	abstract public Pixel getPixel(int x, int y);
	
	
	public int countRange(double low, double high) {
		int count = 0;
		for (int i = 0; i<height; i++) {
			
			for (int k = 0; k<width; k++) {
				if (getPixel(i,k).getIntensity() >= low && getPixel(i,k).getIntensity() <= high) {
					count++;
				}
			}	
		
		}
		
		return count;
	}

	
	public void print() {
	
		for (int i = 0; i<height; i++) {
			
			for (int k = 0; k<width; k++) {
				System.out.print(getPixel(k,i).getChar());	
			}	
		System.out.println();
		}
		
	}


	public SubPicture extract(int xOffset, int yOffset, int width, int height) {
		return new SubPictureImpl(this, xOffset, yOffset, width, height);
	}
}
