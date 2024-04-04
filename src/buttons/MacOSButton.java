package buttons;

/**
 * Todas las familias de productos tienen las mismas variedades (MacOS/Windows).
 *
 * Esta es una variante de un botón para MacOS.
 */
public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("Has creado MacOSButton.");
    }
}
