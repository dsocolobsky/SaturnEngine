import org.lwjgl.opengl.GL11;


public class cube {
	
	public cube()
	{
		
	}
	
	public static void renderCube()
	{
		GL11.glBegin(GL11.GL_QUADS);
        GL11.glVertex2f(100,100);
        GL11.glVertex2f(100+200,100);
        GL11.glVertex2f(100+200,100+200);
        GL11.glVertex2f(100,100+200);
        
        GL11.glEnd();
	}
	
	public void changeColor(float color1, float color2, float color3)
	{
		GL11.glColor3f(color1,color2,color3);
	}
	
	
	
	
}
