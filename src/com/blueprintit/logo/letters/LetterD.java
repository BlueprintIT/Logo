package com.blueprintit.logo.letters;

import com.blueprintit.logo.Letter;
import com.blueprintit.logo.LogoCanvas;

public class LetterD extends Letter
{
	public void loadShapes()
	{
		line(40,-60,40,0);
		line(30,-60,40,-60);
		line(30,0,40,0);
		line(30,-60,30,-20-17.32);
		line(30,0,30,-20+17.32);
			
		arc(0,-40,40,40,60,60+180);
		arc(10,-30,20,20,0,360);
	}
}
