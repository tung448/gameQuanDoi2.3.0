package army2.server;

/**
 *
 * @author ASD
 */
public class SerArmy {

    public static void main(String args[]) {
        ServerManager.log("Start server!");
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                ServerManager.log("Shutdown Server!");
                ServerManager.stop();
            }
        }));
        ServerManager.init();
        ServerManager.start();
    }
}
