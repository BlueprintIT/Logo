package com.blueprintit.logo.letters;

import com.blueprintit.logo.Letter;
import com.blueprintit.logo.LogoCanvas;

public class LetterG extends Letter
{
	public void loadShapes()
	{
		line(40,-40,40,0);
		line(30,-40,30,-20-17.32);
		line(30,0,30,-20+17.32);
		line(30,-40,40,-40);
		line(0,0,10,0);
			
		arc(0,-40,40,40,60,60+180);
		arc(10,-30,20,20,0,360);
		arc(0,-20,40,40,180,180);
		arc(10,-10,20,20,180,180);
	}
}
