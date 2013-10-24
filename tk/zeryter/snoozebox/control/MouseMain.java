package tk.zeryter.snoozebox.control;

import org.lwjgl.input.Mouse;

public class MouseMain implements Runnable {

    Mouse mouse;

    @Override
    public void run() {



        System.out.println("MouseX: " + Mouse.getX());
        System.out.println("MouseY: " + Mouse.getY());

    }
}
