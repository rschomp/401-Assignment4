package a4adept;

public class VerticalStackPicture extends AnyPicture{
	
	private Picture top;
	private Picture bottom;
	
	public VerticalStackPicture(Picture top, Picture bottom) {
		if (top == null) {throw new IllegalArgumentException ("cannot be null");}
		if (bottom == null) {throw new IllegalArgumentException ("cannot be null");}
		if (top.getWidth() != bottom.getWidth()) {throw new IllegalArgumentException ("widths must be the same");}
		this.top = top;
		this.bottom = bottom;
	}


	public int getWidth() {
		return top.getWidth();
	}


	public int getHeight() {
		return top.getHeight() + bottom.getHeight();
		
	}

	
	public void setPixel(int x, int y, Pixel p) {
	
		if (top.getHeight() > y) {
			top.setPixel(x, y, p);
		}
		else {
			bottom.setPixel(x, y- top.getHeight(),p);
		}
	}


	public Pixel getPixel(int x, int y) {
		
		if (top.getHeight() > y) {
			return top.getPixel(x, y);
		}
		else {
			return bottom.getPixel(x, y- top.getHeight());
		}
	}

}
