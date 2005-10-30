package com.blueprintit.logo;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.Shape;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Arc2D;

public abstract class LogoItem
{
	private List shapes;
	private final double crosshair_size = 4;
	private final double line_extension = 5;
	
	public LogoItem()
	{
		shapes = new ArrayList();
		loadShapes();
	}
	
	private double sqrt(double value)
	{
		return Math.sqrt(value);
	}
	
	private double sqr(double value)
	{
		return value*value;
	}
	
	private void drawWorkingLine(Line2D line, LogoCanvas g)
	{
		double length = sqrt(sqr(line.getY2()-line.getY1())+sqr(line.getX2()-line.getX1()));
		double diff = length/line_extension;
		double xdist = (line.getX2()-line.getX1())/diff;
		double ydist = (line.getY2()-line.getY1())/diff;
		g.draw(new Line2D.Double(line.getX1()-xdist,line.getY1()-ydist,line.getX2()+xdist,line.getY2()+ydist));
	}
	
	private void drawWorkingArc(Arc2D arc, LogoCanvas g)
	{
		Arc2D copy = (Arc2D)arc.clone();
		copy.setAngleExtent(360);
		copy.setAngleStart(0);
		double ch = crosshair_size/2;
		Rectangle2D bounds = copy.getBounds2D();
		g.draw(new Line2D.Double(bounds.getCenterX(),bounds.getCenterY()-ch,bounds.getCenterX(),bounds.getCenterY()+ch));
		g.draw(new Line2D.Double(bounds.getCenterX()-ch,bounds.getCenterY(),bounds.getCenterX()+ch,bounds.getCenterY()));
		g.draw(copy);
	}
	
	public void drawWorking(LogoCanvas g)
	{
		g.setWorking();
		
		Iterator loop = shapes.iterator();
		while (loop.hasNext())
		{
			Object shape = loop.next();
			if (shape instanceof Line2D)
			{
				drawWorkingLine((Line2D)shape,g);
			}
			else if (shape instanceof Arc2D)
			{
				drawWorkingArc((Arc2D)shape,g);
			}
			else
			{
				g.draw((Shape)shape);
				System.out.println("Unknown shape: "+shape.getClass().getName());
			}
		}

		g.itemDrawn();
	}
	
	public Iterator getIterator()
	{
		return shapes.iterator();
	}
	
	public void drawFinal(LogoCanvas g)
	{
		g.setFinal();
		
		Iterator loop = shapes.iterator();
		while (loop.hasNext())
		{
			g.draw((Shape)loop.next());
		}
		
		g.itemDrawn();
	}
	
	public void drawWorking(LogoCanvas g, double x, double y)
	{
		g.setOffset(x,y);
		drawWorking(g);
		g.setOffset(-x,-y);
	}
	
	public void drawFinal(LogoCanvas g, double x, double y)
	{
		g.setOffset(x,y);
		drawFinal(g);
		g.setOffset(-x,-y);
	}
	
	private void addShape(Shape shape)
	{
		shapes.add(shape);
	}
	
	protected void line(double x1, double y1, double x2, double y2)
	{
		addShape(new Line2D.Double(x1,y1,x2,y2));
	}
	
	protected void arc(double x, double y, double w, double h, double start, double extent)
	{
		addShape(new Arc2D.Double(x,y,w,h,start,extent,Arc2D.OPEN));
	}
	
	public abstract void loadShapes();
}
