package com.blueprintit.logo;

import com.blueprintit.logo.letters.*;
import java.awt.geom.Rectangle2D;
import java.awt.Shape;
import java.util.Iterator;

public abstract class Letter extends LogoItem
{
	private double width;
	
	public Letter()
	{
		super();
		width=0;
		Iterator loop = getIterator();
		while (loop.hasNext())
		{
			Rectangle2D bounds = ((Shape)loop.next()).getBounds2D();
			width=Math.max(width,bounds.getMaxX());
		}
	}
	
	public double getWidth()
	{
		return width;
	}	
	
	public static Letter getInstance(char c)
	{
		switch (c)
		{
			case 'a':	return new LetterA();
			case 'b':	return new LetterB();
			case 'c':	return new LetterC();
			case 'd':	return new LetterD();
			case 'e':	return new LetterE();
			case 'f':	return new LetterF();
			case 'g':	return new LetterG();
			case 'h':	return new LetterH();
			case 'i':	return new LetterI();
			case 'j': return new LetterJ();
			case 'k': return new LetterK();
			case 'l': return new LetterL();
			case 'm': return new LetterM();
			case 'n': return new LetterN();
			case 'o': return new LetterO();
			case 'p': return new LetterP();
			case 'q': return new LetterQ();
			case 'r': return new LetterR();
			case 's': return new LetterS();
			case 't': return new LetterT();
			case 'u': return new LetterU();
			case 'v': return new LetterV();
			case 'w': return new LetterW();
			case 'x': return new LetterX();
			case 'y': return new LetterY();
			case 'z': return new LetterZ();
			case '!': return new Exclamation();
			case '.': return new FullStop();
		}
		return null;
	}
}
