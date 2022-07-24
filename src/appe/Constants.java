package appe;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Toolkit;

public class Constants {

	public static final Dimension sDimension = Toolkit.getDefaultToolkit().getScreenSize();
	
	public static Insets sInsets  = Toolkit.getDefaultToolkit().getScreenInsets(new Frame().getGraphicsConfiguration());

	public static int sWidth = sDimension.width;
	public static int sHeight = sDimension.height;

	public static int headerH = sHeight / 10;

	public static int padX = 10;

	public static int padYa = 5;
	
	public static int padYm = 20;
	
	public static int padYz = 30;
	
	public static int activeWidth = sWidth - sInsets.left - sInsets.right - padX - padX;
	public static int activeHeight = sHeight - sInsets.top - sInsets.bottom - padYa - padYz;
	
	public static int headerHeight = activeHeight / 9;

}
