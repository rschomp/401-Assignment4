package a4adept;

public abstract class AnyPicture implements Picture {
	
	
	public int countRange(double low, double high) {
		int count = 0;
		int width = getWidth();
		int height = getHeight();
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
		int width = getWidth();
		int height = getHeight();
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
