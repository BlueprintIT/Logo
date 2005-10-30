package com.blueprintit.logo;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LogoApplet extends Applet implements Runnable
{
	private RepaintingLogoCanvas g;
	private int maxloop = 1;
	private boolean RELOAD = true;
	private long LOOP_DELAY = 1000;
	private boolean runonce = false;
	private StringWriter s = new StringWriter("blueprint it");
	private double scale = -1;
	
	private Color decodeColor(String s)
	{
		if (s.startsWith("#"))
		{
			s=s.substring(1);
		}
		if (s.length()!=6)
		{
			throw new IllegalArgumentException("Bad colour specified: #"+s);
		}
		int red = Integer.parseInt(s.substring(0,2),16);
		int green = Integer.parseInt(s.substring(2,4),16);
		int blue = Integer.parseInt(s.substring(4,6),16);
		return new Color(red,green,blue);
	}
	
	public void init()
	{
		addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e)
				{
					start();
				}
			});
		String color = getParameter("background_color");
		if (color!=null)
		{
			LogoCanvas.COLOR_BACKGROUND=decodeColor(color);
		}
		color = getParameter("working_color");
		if (color!=null)
		{
			LogoCanvas.COLOR_WORKING=decodeColor(color);
		}
		color = getParameter("final_color");
		if (color!=null)
		{
			LogoCanvas.COLOR_FINAL=decodeColor(color);
		}
		String delay = getParameter("delay");
		if (delay!=null)
		{
			RepaintingLogoCanvas.DELAY = Long.parseLong(delay);
		}
		String loop = getParameter("loop");
		if (loop!=null)
		{
			maxloop = Integer.parseInt(loop);
		}
		loop = getParameter("loop_delay");
		if (loop!=null)
		{
			LOOP_DELAY = Long.parseLong(loop);
		}
		String strscale = getParameter("scale");
		if (strscale!=null)
		{
			scale = Double.parseDouble(strscale);
		}
		String reload = getParameter("reload");
		if (reload!=null)
		{
			RELOAD = reload.equalsIgnoreCase("true");
		}
		String message = getParameter("message");
		if (message!=null)
		{
			s = new StringWriter(message);
		}
		setBackground(LogoCanvas.COLOR_BACKGROUND);
	}
	
	public void start()
	{
		if ((RELOAD)||(!runonce))
		{
			runonce=true;
			g = new RepaintingLogoCanvas(this,getWidth(),getHeight());
			(new Thread(this)).start();
		}
	}
	
	public void stop()
	{
		if (g!=null)
		{
			g.setComponent(null);
		}
	}
	
	public void run()
	{
		LogoCanvas g = this.g;
		int loop=0;
		double xscale;
		double yscale;
		if (scale<0)
		{
			xscale = (getWidth()*1.0)/(s.getWidth()+40);
			yscale = (getHeight()*1.0)/120;
			if (xscale>yscale)
			{
				xscale=yscale;
			}
			else
			{
				yscale=xscale;
			}
		}
		else
		{
			xscale=scale;
			yscale=scale;
		}
		System.out.println("Ideal width:  "+(int)((s.getWidth()+40)*xscale));
		System.out.println("Ideal height: "+(int)(120*yscale));
		g.scale(xscale,yscale);
		int y = (int)(((getHeight()/yscale)-80)/2)+60;
		int x = (int)(((getWidth()/xscale)-s.getWidth())/2);
		while (loop!=maxloop)
		{
			g.clear();
			s.write(g,x,y);
			try
			{
				Thread.sleep(LOOP_DELAY);
			}
			catch (Exception e)
			{
			}
			loop++;
		}
	}
	
	public void paint(Graphics g)
	{
		g.drawImage(this.g.getImage(),0,0,null);
	}
	
	public void update(Graphics g)
	{
		paint(g);
	}
}
