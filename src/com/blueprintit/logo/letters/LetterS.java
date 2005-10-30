package com.blueprintit.logo.letters;

import com.blueprintit.logo.Letter;
import com.blueprintit.logo.LogoCanvas;

public class LetterS extends Letter
{
	public void loadShapes()
	{
		arc(0,-40,25,25,90,180);
		arc(10,-30,5,5,90,180);
		arc(5,-25,25,25,270,180);
		arc(15,-15,5,5,270,180);
		line(12.5,-40,30,-40);
		line(12.5,-30,30,-30);
		line(12.5,-25,17.5,-25);
		line(12.5,-15,17.5,-15);
		line(17.5,-10,0,-10);
		line(17.5,0,0,0);
		line(0,0,0,-10);
		line(30,-40,30,-30);
	}
}
