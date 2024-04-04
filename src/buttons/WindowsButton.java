package buttons;

/**
 * Todas las familias de productos tienen las mismas variedades (MacOS/Windows).
 *
 * Esta es otra variante de un botón.
 */
public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("Has creado WindowsButton.");
    }
}