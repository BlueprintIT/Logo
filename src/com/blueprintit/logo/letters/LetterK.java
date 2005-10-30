package com.blueprintit.logo.letters;

import com.blueprintit.logo.Letter;
import com.blueprintit.logo.LogoCanvas;

public class LetterK extends Letter
{
	public void loadShapes()
	{
		line(0,-60,0,0);
		line(10,-60,10,-20-7.07);
		line(10,-20+7.07,10,0);
		line(0,-60,10,-60);
		line(0,0,10,0);
		
		line(30,-40,30,-40+7.07);
		line(30,-7.07,30,0);
		line(30-7.07,0,30,0);
		line(30-7.07,-40,30,-40);

		line(10,-20+7.07,30-7.07,0);
		line(10,-20-7.07,30-7.07,-40);
		line(30,-40+7.07,10+7.07,-20);
		line(10+7.07,-20,30,-7.07);
	}
}
