package com.blueprintit.logo;

import java.awt.Component;

public class RepaintingLogoCanvas extends LogoCanvas
{
	private Component c;
	public static long DELAY = 100;
	
	public RepaintingLogoCanvas(Component c, int width, int height)
	{
		super(width,height);
		this.c=c;
	}
	
	public void setComponent(Component c)
	{
		this.c=c;
	}
	
	public void shapeDrawn()
	{
		if (c!=null)
		{
			c.repaint();
			try
			{
				Thread.sleep(DELAY);
			}
			catch (Exception e)
			{
			}
		}
	}
}
