package com.blueprintit.logo.letters;

import com.blueprintit.logo.Letter;
import com.blueprintit.logo.LogoCanvas;

public class LetterM extends Letter
{
	public void loadShapes()
	{
		line(0,-40,0,0);
		line(10,-20,10,0);
		line(10,-20-17.32,10,-40);
		line(30,-20,30,0);
		line(40,-20,40,0);
		line(60,-20,60,0);
		line(70,-20,70,0);
		line(0,-40,10,-40);
		line(0,0,10,0);
		line(30,0,40,0);
		line(60,0,70,0);
			
		arc(0,-40,40,40,41.14,120-41.14);
		arc(30,-40,40,40,0,180-41.14);
		arc(10,-30,20,20,0,180);
		arc(40,-30,20,20,0,180);
	}
}
