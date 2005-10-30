package com.blueprintit.logo;

public class Logo
{
	public static void main(String[] args)
	{
		System.setProperty("java.awt.headless","true");
		StringWriter s = new StringWriter(args[0]);
		LogoCanvas g = new SavingLogoCanvas(((int)s.getWidth()+41),120);
		s.write(g,0,0);
		g.save("final.jpg");
	}
}
