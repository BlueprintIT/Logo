package com.blueprintit.logo.letters;

import com.blueprintit.logo.Letter;
import com.blueprintit.logo.LogoCanvas;

public class LetterE extends Letter
{
	public void loadShapes()
	{
		line(20-9.4,-20+3.42,40,-20+3.42);
		line(40,-20,40,-20+3.42);
		line(20-7.53,-20-6.38,20+7.53,-20-6.58);
		line(20+7.07,-20+7.07,20+14.14,-20+14.14);
			
		arc(0,-40,40,40,0,360-45);
		arc(10,-30,20,20,200,70+45);
		arc(10,-30,20,20,41.15,180-(2*41.15));
	}
}
