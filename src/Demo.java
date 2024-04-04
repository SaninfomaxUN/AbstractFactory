import app.Application;
import factories.GUIFactory;
import factories.MacOSFactory;
import factories.WindowsFactory;

/**
 * Presentado Por: David Santiago Cruz Hernandez
 * Tomado y adaptado de: https://refactoring.guru/es/design-patterns/abstract-factory/java/example
 */
public class Demo {

    /**
     * La aplicación elige el tipo de fábrica y la crea en tiempo de ejecución (generalmente en
     * etapa de inicialización), dependiendo de la configuración o variables
     * de entorno.
     */
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
