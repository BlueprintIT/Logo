package com.blueprintit.logo.letters;

import com.blueprintit.logo.Letter;
import com.blueprintit.logo.LogoCanvas;

public class LetterR extends Letter
{
	public void loadShapes()
	{
		line(10,-20,10,0);
		line(0,-40,0,0);
		line(10,-40,10,-20-17.32);
		line(0,-40,10,-40);
		line(0,0,10,0);

		line(20+7.07,-20-7.07,20+14.14,-20-14.14);
			
		arc(0,-40,40,40,45,75);
		arc(10,-30,20,20,45,135);
	}
}
