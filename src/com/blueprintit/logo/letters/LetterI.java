package com.blueprintit.logo.letters;

import com.blueprintit.logo.Letter;
import com.blueprintit.logo.LogoCanvas;

public class LetterI extends Letter
{
	public void loadShapes()
	{
		line(10,-40,10,0);
		line(0,-40,0,0);
		line(0,-40,10,-40);
		line(0,0,10,0);

		arc(0,-55,10,10,0,360);
	}
}
