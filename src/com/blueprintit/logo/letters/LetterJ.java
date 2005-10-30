package com.blueprintit.logo.letters;

import com.blueprintit.logo.Letter;
import com.blueprintit.logo.LogoCanvas;

public class LetterJ extends Letter
{
	public void loadShapes()
	{
		line(10,-40,10,0);
		line(20,-40,20,0);
		line(0,20,0,10);
		line(10,-40,20,-40);
		arc(-20,-20,40,40,270,90);
		arc(-10,-10,20,20,270,90);
		arc(10,-55,10,10,0,360);
	}
}
