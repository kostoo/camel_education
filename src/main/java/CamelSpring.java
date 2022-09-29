import org.apache.camel.spring.Main;

public class CamelSpring {

    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.setApplicationContextUri("META-INF\\spring\\camel-context.xml");
        main.enableHangupSupport();
        main.run();
        main.stop();
    }
}
