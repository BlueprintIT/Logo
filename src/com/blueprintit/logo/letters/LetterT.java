package com.blueprintit.logo.letters;

import com.blueprintit.logo.Letter;
import com.blueprintit.logo.LogoCanvas;

public class LetterT extends Letter
{
	public void loadShapes()
	{
		line(0,-40,0,-30);
		line(30,-40,30,-30);
		line(20,-60,20,-40);
		line(20,-30,20,0);
		line(10,-60,10,-40);
		line(10,-30,10,0);

		line(10,-60,20,-60);
		line(10,0,20,0);
		line(0,-40,10,-40);
		line(20,-40,30,-40);
		line(0,-30,10,-30);
		line(20,-30,30,-30);
	}
}
