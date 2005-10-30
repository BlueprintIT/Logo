package com.blueprintit.logo;

public class WebPage
{
	public static void main(String[] args)
	{
		System.setProperty("java.awt.headless","true");
		LogoCanvas g = new LogoCanvas(100,100);
		g.setWorking();
		g.line(20,10,20,60);
		g.line(10,20,60,20);
		g.line(35,37,35,33);
		g.line(37,35,33,35);
		g.setFinal();
		g.line(35,20,80,20);
		g.line(20,35,20,80);
		g.arc(20,20,30,30,180,-90);
		g.save("final.jpg");
	}
}
