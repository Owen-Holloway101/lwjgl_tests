package tk.zeryter.snoozebox;

//Owen Holloway [zeryter] ZerytSoft 2013 [all rights reserved]

import tk.zeryter.snoozebox.control.MouseMain;
import tk.zeryter.snoozebox.render.*;

public class SnoozeBoxMain {

    public static void main(String[] args) {

       new Thread(Variables.renderMain).start();
       new Thread(Variables.mouseMain).start();

    }

    public static class Variables {

        //Global Variables
        public static boolean running = true;

        //Thread Main Classes (static so that they can be access globally)
        public static RenderMain renderMain = new RenderMain();
        public static MouseMain mouseMain = new MouseMain();

    }

}