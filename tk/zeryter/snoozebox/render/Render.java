package tk.zeryter.snoozebox.render;

import org.lwjgl.input.*;
import org.lwjgl.opengl.*;

public class Render extends RenderMain {

    float rotateX = 0f, rotateY = 0f, rotateZ = 0f;

    public void RenderInit() {


    }

    public void KeyCheck() {

        if (Keyboard.isKeyDown(Keyboard.KEY_Q)) {
            rotateZ += 1f;
        }

        if (Keyboard.isKeyDown(Keyboard.KEY_E)) {
            rotateZ -= 1f;

        }

        if (Keyboard.isKeyDown(Keyboard.KEY_A)) {
            rotateY += 1f;
        }

        if (Keyboard.isKeyDown(Keyboard.KEY_D)) {
            rotateY -= 1f;

        }

        if (Keyboard.isKeyDown(Keyboard.KEY_W)) {
            rotateX -= 1f;

        }

        if (Keyboard.isKeyDown(Keyboard.KEY_S)) {
            rotateX += 1f;

        }

    }

    public void RenderLoop() {

        super.RenderLoop();

        GL11.glTranslatef(0f,0.0f,-7f);
        GL11.glRotatef(rotateX,1.0f,0.0f,0.0f);
        GL11.glRotatef(rotateY,0.0f,1.0f,0.0f);
        GL11.glRotatef(rotateZ,0.0f,0.0f,1.0f);

        GL11.glColor3f( 0.0f, 1.0f, 0.0f);

        GL11.glBegin(GL11.GL_QUADS);

        //Top Face
        GL11.glVertex3f(-1.0f, 0.0f, 1.0f);
        GL11.glVertex3f( 1.0f, 0.0f, 1.0f);
        GL11.glVertex3f( 1.0f, 0.0f,-1.0f);
        GL11.glVertex3f(-1.0f, 0.0f,-1.0f);

        GL11.glEnd();


    }

}
