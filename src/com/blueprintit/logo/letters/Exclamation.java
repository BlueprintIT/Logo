package com.blueprintit.logo.letters;

import com.blueprintit.logo.Letter;
import com.blueprintit.logo.LogoCanvas;

public class Exclamation extends Letter
{
	public void loadShapes()
	{
		line(0,-60,0,-20);
		line(10,-60,10,-20);
		line(0,-60,10,-60);
		line(0,-20,10,-20);

		arc(0,-10,10,10,0,360);
	}
}
