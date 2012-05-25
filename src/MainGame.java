import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
 
public class MainGame {
	
	cube cube1 = new cube();
 
    public void start() {
        try {
	    Display.setDisplayMode(new DisplayMode(800, 600));
	    Display.create();
	} catch (LWJGLException e) {
	    e.printStackTrace();
	    System.exit(0);
	}
        
    
 
	// init OpenGL here
        GL11.glMatrixMode(GL11.GL_PROJECTION);
    	GL11.glLoadIdentity();
    	GL11.glOrtho(0, 800, 0, 600, 1, -1);
    	GL11.glMatrixMode(GL11.GL_MODELVIEW);
 
        while (!Display.isCloseRequested()) {
 
	    // render OpenGL here
        	GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);	
        	
        	
        	// draw quad
        	cube.renderCube();
	    pollInput();
	    Display.update();
	}
 
	Display.destroy();
    }
 
    public void pollInput() {
 
        if (Mouse.isButtonDown(0)) {
	    int x = Mouse.getX();
	    int y = Mouse.getY();
 
	    System.out.println("MOUSE DOWN @ X: " + x + " Y: " + y);
	}
 
	if (Keyboard.isKeyDown(Keyboard.KEY_SPACE)) {
	    System.out.println("SPACE KEY IS DOWN");
	}
 
	while (Keyboard.next()) {
		
		// Key pressed code goes here:
	    if (Keyboard.getEventKeyState()) {
	        if (Keyboard.getEventKey() == Keyboard.KEY_W) {
		    System.out.println("W Key Pressed");
		    cube1.changeColor(2.5f,0.5f,1.0f);
		}
	        
		if (Keyboard.getEventKey() == Keyboard.KEY_A) {
		    System.out.println("A Key Pressed");
		   cube1.changeColor(0.5f,2.5f,1.0f);
		}
		
		if (Keyboard.getEventKey() == Keyboard.KEY_S) {
		    System.out.println("S Key Pressed");
		    cube1.changeColor(0.5f,4.5f,0.0f);
		}
		
		if (Keyboard.getEventKey() == Keyboard.KEY_D) {
		    System.out.println("D Key Pressed");
		    cube1.changeColor(0.5f,4.5f,0.0f);
		}
		
		
		
	   } else {
	    	// Key released code goes here:
	        if (Keyboard.getEventKey() == Keyboard.KEY_W) {
		    System.out.println("W Key Released");
		    GL11.glColor3f(2.5f,0.5f,1.0f);
	        }
	        
	    	if (Keyboard.getEventKey() == Keyboard.KEY_A) {
		    System.out.println("A Key Released");
		    GL11.glColor3f(0.5f,2.5f,1.0f);
		}
	    	
		if (Keyboard.getEventKey() == Keyboard.KEY_S) {
		    System.out.println("S Key Released");
		    GL11.glColor3f(0.5f,4.5f,0.0f);
		}
		
		if (Keyboard.getEventKey() == Keyboard.KEY_D) {
		    System.out.println("D Key Released");
		    GL11.glColor3f(0.5f,4.5f,0.0f);
		}
		
	    }
	    
	}
	
    }
 
    public static void main(String[] argv) {
        MainGame MainGame = new MainGame();
	MainGame.start();
    }
}