package com.blueprintit.logo.letters;

import com.blueprintit.logo.Letter;
import com.blueprintit.logo.LogoCanvas;

public class LetterP extends Letter
{
	public void loadShapes()
	{
		line(0,-40,0,20);
		line(10,-40,10,-20-17.32);
		line(10,20,10,-20+17.32);
		line(0,-40,10,-40);
		line(0,20,10,20);
			
		arc(0,-40,40,40,-90-30,60+180);
		arc(10,-30,20,20,0,360);
	}
}
