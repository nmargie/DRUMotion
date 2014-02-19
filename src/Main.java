import java.io.File;
// based on QuickTip Slick2D tutorials
// http://www.indiedb.com/engines/slick-2d-slick-ae/tutorials/java-slick-2d-video-tutorial




import org.lwjgl.LWJGLUtil;
import org.lwjgl.opengl.Display;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

public class Main {
	public static void main (String[] args) {
		// to select the correct platform-dependent files (i.e. MACOSX, Windows, Linux)
		System.setProperty("org.lwjgl.librarypath", new File(new File(System.getProperty("user.dir"), "native"), LWJGLUtil.getPlatformName()).getAbsolutePath());
		
		try {
			// The actual window that will display and will show what's rendered in the Game class
			AppGameContainer app = new AppGameContainer( new Game());
			// set display mode 3 args: (width px, height px, fullscreen?)
			app.setDisplayMode(800, 600, false);
			//Display.setInitialBackground(255, 250, 250);
			app.setTargetFrameRate(80); // target frame rate: 60fps
			
			app.start();
		} catch (SlickException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
