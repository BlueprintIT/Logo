package com.blueprintit.logo.letters;

import com.blueprintit.logo.Letter;
import com.blueprintit.logo.LogoCanvas;

public class LetterB extends Letter
{
	public void loadShapes()
	{
		line(0,-60,0,0);
		line(0,-60,10,-60);
		line(0,0,10,0);
		line(10,-60,10,-20-17.32);
		line(10,0,10,-20+17.32);
			
		arc(0,-40,40,40,-90-30,60+180);
		arc(10,-30,20,20,0,360);
	}
}
