package com.blueprintit.logo.letters;

import com.blueprintit.logo.Letter;
import com.blueprintit.logo.LogoCanvas;

public class LetterF extends Letter
{
	public void loadShapes()
	{
		arc(0,-60,40,40,90,90);
		arc(10,-50,20,20,90,90);

		line(0,-40,0,0);
		line(10,-30,10,0);
		line(20,-60,20,-50);
		line(20,-40,20,-30);
		
		line(10,-40,20,-40);
		line(10,-30,20,-30);
		line(0,0,10,0);
	}
}
