package slick.path2glory.SimpleGame;
 
// Basic libraries stuff
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
 
// Main Game Class
public class SimpleGame extends BasicGame{
 
	// Constructor for the class
    public SimpleGame()
    {
        super("Slick2DPath2Glory - SimpleGame"); // Title of window
    }
 
    // Start Class
    @Override
    public void init(GameContainer gc) 
			throws SlickException { // Error Catching, Void ATM
 
    }
 
    // Update Class
    @Override
    public void update(GameContainer gc, int delta) 
			throws SlickException     
    {
 
    }
 
    // Render Images
    public void render(GameContainer gc, Graphics g) 
			throws SlickException 
    {
 
    }
 
    // Main Class
    public static void main(String[] args) 
			throws SlickException
    {
         AppGameContainer app = new AppGameContainer(new SimpleGame()); // Create Window
 
         app.setDisplayMode(800, 600, false); // Set resolution of Screen
         app.start(); // Start ALL THE APPS !
    }
}