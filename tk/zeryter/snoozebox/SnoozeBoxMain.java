package tk.zeryter.snoozebox;

//Owen Holloway [zeryter] ZerytSoft 2013

import tk.zeryter.snoozebox.render.*;

public class SnoozeBoxMain {

    public static void main(String[] args) {

       new Thread(Variables.renderMain).start();

    }

    public static class Variables {

        //Global Variables
        public static boolean running = true;
        public static boolean displayCreated = false;
        public static int displayX = 640;
        public static int displayY = 480;

        //Thread Main Classes (static so that they can be access globally)
        public static Render renderMain = new Render();

    }

}