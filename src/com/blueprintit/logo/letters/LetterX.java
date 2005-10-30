package com.blueprintit.logo.letters;

import com.blueprintit.logo.Letter;
import com.blueprintit.logo.LogoCanvas;

public class LetterX extends Letter
{
	public void loadShapes()
	{
		line(0,-40,0,-40+7.07);
		line(0,-7.07,0,0);
		line(40,-40,40,-40+7.07);
		line(40,-7.07,40,0);
		line(0,0,7.07,0);
		line(40-7.07,0,40,0);
		line(0,-40,7.07,-40);
		line(40-7.07,-40,40,-40);

		line(7.07,0,20,-20+7.07);
		line(20,-20+7.07,40-7.07,0);
		line(7.07,-40,20,-20-7.07);
		line(20,-20-7.07,40-7.07,-40);
		line(0,-40+7.07,20-7.07,-20);
		line(20-7.07,-20,0,-7.07);
		line(40,-40+7.07,20+7.07,-20);
		line(20+7.07,-20,40,-7.07);
	}
}
