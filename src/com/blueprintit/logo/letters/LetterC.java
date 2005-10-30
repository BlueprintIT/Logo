package com.blueprintit.logo.letters;

import com.blueprintit.logo.Letter;
import com.blueprintit.logo.LogoCanvas;

public class LetterC extends Letter
{
	public void loadShapes()
	{
		line(20+7.07,-20+7.07,20+14.14,-20+14.14);
		line(20+7.07,-20-7.07,20+14.14,-20-14.14);
			
		arc(0,-40,40,40,45,270);
		arc(10,-30,20,20,45,270);
	}
}
