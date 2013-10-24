package tk.zeryter.snoozebox.render;

import org.lwjgl.input.*;
import org.lwjgl.opengl.*;

public class Render extends RenderMain {

    float rotateX = 0f, rotateY = 0f, rotateZ = 0f;
    float positionX = 0.0f, positionY = 0.0f, positionZ = -7.0f;

    public void RenderInit() {


    }

    public void KeyCheck() {

        if (Keyboard.isKeyDown(Keyboard.KEY_SPACE)) {
            //rotateZ -= 1f;
            positionY -= 0.1f;
        }

        if (Keyboard.isKeyDown(Keyboard.KEY_A)) {
            //rotateY -= 1f;
            positionX += 0.1f;
        }

        if (Keyboard.isKeyDown(Keyboard.KEY_D)) {
            //rotateY += 1f;
            positionX -= 0.1f;

        }

        if (Keyboard.isKeyDown(Keyboard.KEY_W)) {
            //rotateX -= 1f;
            positionZ += 0.1f;
        }

        if (Keyboard.isKeyDown(Keyboard.KEY_S)) {
            //rotateX += 1f;
            positionZ -= 0.1f;
        }
    }

    public void RenderLoop() {

        super.RenderLoop();

        GL11.glTranslatef(positionX,positionY,positionZ);
        GL11.glRotatef(rotateX,1.0f,0.0f,0.0f);
        GL11.glRotatef(rotateY,0.0f,1.0f,0.0f);
        GL11.glRotatef(rotateZ,0.0f,0.0f,1.0f);

        GL11.glColor3f( 1.0f, 1.0f, 1.0f);

        GL11.glBegin(GL11.GL_QUADS);
        GL11.glVertex3f(-100.0f,-1.0f, 100.0f);
        GL11.glVertex3f( 100.0f,-1.0f, 100.0f);
        GL11.glVertex3f( 100.0f,-1.0f,-100.0f);
        GL11.glVertex3f(-100.0f,-1.0f,-100.0f);
        GL11.glEnd();


        GL11.glBegin(GL11.GL_QUADS);

        GL11.glColor3f( 0.0f, 1.0f, 0.0f);

        //Top Face
        GL11.glVertex3f( 0.0f, 2.0f, 2.0f);
        GL11.glVertex3f( 2.0f, 2.0f, 2.0f);
        GL11.glVertex3f( 2.0f, 2.0f, 0.0f);
        GL11.glVertex3f( 0.0f, 2.0f, 0.0f);

        //Bottom Face
        GL11.glVertex3f( 0.0f, 0.0f, 2.0f);
        GL11.glVertex3f( 2.0f, 0.0f, 2.0f);
        GL11.glVertex3f( 2.0f, 0.0f, 0.0f);
        GL11.glVertex3f( 0.0f, 0.0f, 0.0f);

        GL11.glColor3f( 1.0f, 0.0f, 0.0f);

        //Left Face
        GL11.glVertex3f( 0.0f, 2.0f, 2.0f);
        GL11.glVertex3f( 0.0f, 0.0f, 2.0f);
        GL11.glVertex3f( 0.0f, 0.0f, 0.0f);
        GL11.glVertex3f( 0.0f, 2.0f, 0.0f);

        //Right Face
        GL11.glVertex3f( 2.0f, 2.0f, 2.0f);
        GL11.glVertex3f( 2.0f, 0.0f, 2.0f);
        GL11.glVertex3f( 2.0f, 0.0f, 0.0f);
        GL11.glVertex3f( 2.0f, 2.0f, 0.0f);

        GL11.glColor3f( 0.0f, 0.0f, 1.0f);

        //Front Face
        GL11.glVertex3f( 2.0f, 2.0f, 2.0f);
        GL11.glVertex3f( 2.0f, 0.0f, 2.0f);
        GL11.glVertex3f( 0.0f, 0.0f, 2.0f);
        GL11.glVertex3f( 0.0f, 2.0f, 2.0f);

        //Back Face
        GL11.glVertex3f( 2.0f, 2.0f, 0.0f);
        GL11.glVertex3f( 2.0f, 0.0f, 0.0f);
        GL11.glVertex3f( 0.0f, 0.0f, 0.0f);
        GL11.glVertex3f( 0.0f, 2.0f, 0.0f);

        GL11.glEnd();


    }

}
