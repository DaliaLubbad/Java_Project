
package finalproject;

import Forms.logIn;

public class FinalProject implements Runnable{

    public FinalProject() {
    }
    
    public void run(){
        logIn a = new logIn();
        a.setVisible(true);
    }
    
    public static void main(String[] args) {
        if (args.length > 0) {
            if (args[0].equals("Check_con")) {
                ConnectToDB c = new ConnectToDB();
                c.connect();
            } else {
                System.out.println("not supported");
            }
        } else {
            for (int i = 0; i < 1; i++) {
                FinalProject finalProject = new FinalProject();
                Thread myThread = new Thread((Runnable) finalProject);
                myThread.start();
            }
        }
    }
}
