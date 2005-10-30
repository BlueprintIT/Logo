package com.blueprintit.logo.letters;

import com.blueprintit.logo.Letter;
import com.blueprintit.logo.LogoCanvas;

public class LetterZ extends Letter
{
	public void loadShapes()
	{
		line(0,-40,0,-30);
		line(0,-30+22.93,0,0);
		line(40,-40,40,-10-22.93);
		line(40,-10,40,0);
		line(0,-40,40,-40);
		line(0,-30,22.93,-30);
		line(40-22.93,-10,40,-10);
		line(0,0,40,0);
		
		line(40-22.93,-10,40,-10-22.93);
		line(0,-30+22.93,22.93,-30);
	}
}
