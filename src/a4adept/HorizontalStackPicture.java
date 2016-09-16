package a4adept;

public class HorizontalStackPicture extends AnyPicture{
	
	private Picture left;
	private Picture right;

	public HorizontalStackPicture(Picture left, Picture right) {
		if (left == null) {throw new IllegalArgumentException ("cannot be null");}
		if (right == null) {throw new IllegalArgumentException ("cannot be null");}
		if (left.getHeight() != right.getHeight()) {throw new IllegalArgumentException ("must be same height");}
		this.left = left;
		this.right = right;
	}

	
	public void setPixel(int x, int y, Pixel p) {
		if (left.getWidth() > x) {
			left.setPixel(x, y, p);
		}
		else {
		right.setPixel(x-left.getWidth(), y,p);
		}
		
	}


	public Pixel getPixel(int x, int y) {
		if (left.getWidth() > x) {
			return left.getPixel(x, y);
		}
		else {
		return right.getPixel(x-left.getWidth(), y);
		}
		
	}


	public int getWidth() {
		return left.getWidth() + right.getWidth();
		
	}

	
	public int getHeight() {
		return left.getHeight();
	}

	
}	
