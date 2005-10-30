package com.blueprintit.logo;

public class StringWriter
{
	private String line;
	private final double letter_space = 5;
	private final double space = 20;
	
	public StringWriter(String data)
	{
		line=data;
	}
	
	public double getWidth()
	{
		if (line.length()>0)
		{
			double width = 0;
			for (int loop=0; loop<line.length(); loop++)
			{
				if (line.charAt(loop)==' ')
				{
					width+=space;
				}
				else
				{
					Letter thisletter = Letter.getInstance(line.charAt(loop));
					width+=thisletter.getWidth();
				}
				width+=letter_space;
			}
			return width-letter_space;
		}
		else
		{
			return 0;
		}
	}
	
	public void write(LogoCanvas g, double x, double y)
	{
		writeWorking(g,x,y);
		writeFinal(g,x,y);
	}

	public void writeWorking(LogoCanvas g, double x, double y)
	{
		if (line.length()>0)
		{
			double pos = 0;
			for (int loop=0; loop<line.length(); loop++)
			{
				if (line.charAt(loop)==' ')
				{
					pos+=space;
				}
				else
				{
					Letter thisletter = Letter.getInstance(line.charAt(loop));
					thisletter.drawWorking(g,x+pos,y);
					pos+=thisletter.getWidth();
				}
				pos+=letter_space;
			}
		}
	}

	public void writeFinal(LogoCanvas g, double x, double y)
	{
		if (line.length()>0)
		{
			double pos = 0;
			for (int loop=0; loop<line.length(); loop++)
			{
				if (line.charAt(loop)==' ')
				{
					pos+=space;
				}
				else
				{
					Letter thisletter = Letter.getInstance(line.charAt(loop));
					thisletter.drawFinal(g,x+pos,y);
					pos+=thisletter.getWidth();
				}
				pos+=letter_space;
			}
		}
	}
}
