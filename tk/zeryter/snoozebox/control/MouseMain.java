package tk.zeryter.snoozebox.control;

//Owen Holloway [Zeryter] ZerytSoft 2013

import org.lwjgl.LWJGLException;
import org.lwjgl.input.Mouse;
import tk.zeryter.snoozebox.SnoozeBoxMain;

public class MouseMain implements Runnable {

    @Override
    public void run() {

        //Wait untill the display has been created
        while (!SnoozeBoxMain.Variables.displayCreated) {
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        try {
            Mouse.create();
        } catch (LWJGLException e) {
            e.printStackTrace();
        }


        while (SnoozeBoxMain.Variables.running) {

            System.out.println("MouseX: " + (SnoozeBoxMain.Variables.displayX/2 - Mouse.getX()));
            System.out.println("MouseY: " + (SnoozeBoxMain.Variables.displayY /2 - Mouse.getY()));

            Mouse.setCursorPosition(SnoozeBoxMain.Variables.displayX/2,SnoozeBoxMain.Variables.displayY /2);

            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
