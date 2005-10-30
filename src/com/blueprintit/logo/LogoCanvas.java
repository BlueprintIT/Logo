package com.blueprintit.logo;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;
import com.sun.image.codec.jpeg.JPEGEncodeParam;
import java.awt.image.BufferedImage;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Line2D;
import java.awt.geom.Arc2D;
import java.awt.Color;
import java.awt.RenderingHints;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.awt.Image;

public class LogoCanvas
{
	private Graphics2D g;
	private BufferedImage image;
	public static Color COLOR_BACKGROUND = Color.white;
	public static Color COLOR_WORKING = new Color((float)0.8,(float)0.8,1);
	public static Color COLOR_FINAL = Color.blue;
	private int width;
	private int height;
	
	public LogoCanvas(int width, int height)
	{
		this.width=width;
		this.height=height;
		image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
		g=image.createGraphics();
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		g.setBackground(COLOR_BACKGROUND);
		clear();
	}
	
	public void clear()
	{
		g.clearRect(0,0,width,height);
		shapeDrawn();
	}
	
	public Image getImage()
	{
		return image;
	}
	
	public void save(OutputStream out) throws Exception
	{
		save(out,(float)0.75);
	}
	
	public void save(OutputStream out, float quality) throws Exception
	{
		JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
		JPEGEncodeParam params = encoder.getDefaultJPEGEncodeParam(image);
		params.setQuality(quality,true);
		encoder.encode(image,params);
		out.flush();
	}
	
	public void save(String filename)
	{
		save(filename,(float)0.75);
	}
	
	public void save(String filename, float quality)
	{
		try
		{
			FileOutputStream out = new FileOutputStream(filename);
			save(out,quality);
			out.close();
		}
		catch (Exception e)
		{
			System.err.println("Exception saving image - "+e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void setOffset(double x, double y)
	{
		g.translate(x,y);
	}
	
	public void scale(double xscale, double yscale)
	{
		g.scale(xscale,yscale);
	}
	
	public void draw(Shape shape)
	{
		g.draw(shape);
		shapeDrawn();
	}
	
	public void line(double x1, double y1, double x2, double y2)
	{
		g.draw(new Line2D.Double(x1,y1,x2,y2));
		shapeDrawn();
	}
	
	public void arc(double x, double y, double w, double h, double start, double extent)
	{
		g.draw(new Arc2D.Double(x,y,w,h,start,extent,Arc2D.OPEN));
		shapeDrawn();
	}
	
	public void setWorking()
	{
		g.setColor(COLOR_WORKING);
	}
	
	public void setFinal()
	{
		g.setColor(COLOR_FINAL);
	}
	
	public void shapeDrawn()
	{
	}
	
	public void itemDrawn()
	{
	}
	
	public void mark()
	{
		itemDrawn();
	}
}
