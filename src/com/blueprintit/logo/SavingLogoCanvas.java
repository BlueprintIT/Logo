package com.blueprintit.logo;

public class SavingLogoCanvas extends LogoCanvas
{
	private int count=0;
	
	public SavingLogoCanvas(int width, int height)
	{
		super(width,height);
	}
	
	public void shapeDrawn()
	{
		String name = ""+count;
		while (name.length()<3)
		{
			name="0"+name;
		}
		save("frame"+name+".jpg");
		count++;
	}
}
