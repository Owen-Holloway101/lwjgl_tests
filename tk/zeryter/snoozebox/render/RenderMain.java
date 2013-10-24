package tk.zeryter.snoozebox.render;

//Owen Holloway Zeryter ZerytSoft 2013

import tk.zeryter.snoozebox.SnoozeBoxMain;

import org.lwjgl.*;
import org.lwjgl.opengl.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.util.glu.GLU.gluPerspective;

public class RenderMain implements Runnable {

    DisplayMode window;

    @Override
    public void run() {

        window = new DisplayMode(SnoozeBoxMain.Variables.displayX,SnoozeBoxMain.Variables.displayY);

        try {
            Display.setDisplayMode(window);  //This creates a new windows for OpenGL to be drawn on
            Display.create();
            Display.setTitle("SnoozeBox");
        } catch (LWJGLException e) {
            e.printStackTrace();
            System.exit(10);

        }

        //Display.setResizable(true);

        SnoozeBoxMain.Variables.displayCreated = true;

        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        gluPerspective(30f,(float) SnoozeBoxMain.Variables.displayX/SnoozeBoxMain.Variables.displayY,0.001f,100);
        glMatrixMode(GL_MODELVIEW);

        RenderInit();

        while (!Display.isCloseRequested()) {

            glClear(GL_COLOR_BUFFER_BIT|GL_DEPTH_BUFFER_BIT);

            GL11.glLoadIdentity();

            KeyCheck();

            RenderLoop();

            //Update the display window
            Display.update();
            Display.sync(60);

        }

        Display.destroy();
        SnoozeBoxMain.Variables.running = false;
    }

    public void RenderInit() {

    }

    public void RenderLoop() {

    }

    public void KeyCheck() {

    }

}
