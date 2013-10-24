package tk.zeryter.snoozebox.render;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class RenderMain implements Runnable {

    DisplayMode window;

    @Override
    public void run() {

        window = new DisplayMode(1080,720);

        try {
            Display.setDisplayMode(window);  //This creates a new windows for OpenGL to be drawn on
            Display.create();
            Display.setTitle("SnoozeBox");
        } catch (LWJGLException e) {
            e.printStackTrace();
            System.exit(10);

        }

        while (!Display.isCloseRequested()) {

            try {
                Thread.sleep(8);    //Pause for 8ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //Update the display window
            Display.update();

        }

    }
}
