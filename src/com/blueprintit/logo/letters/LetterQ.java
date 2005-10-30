package com.blueprintit.logo.letters;

import com.blueprintit.logo.Letter;
import com.blueprintit.logo.LogoCanvas;

public class LetterQ extends Letter
{
	public void loadShapes()
	{
		line(40,-40,40,20);
		line(30,-40,30,-20-17.32);
		line(30,20,30,-20+17.32);
		line(30,-40,40,-40);
		line(30,20,40,20);
			
		arc(0,-40,40,40,60,60+180);
		arc(10,-30,20,20,0,360);
	}
}
