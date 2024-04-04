package checkboxes;

/**
 * Todas las familias de productos tienen las mismas variedades (MacOS/Windows).
 *
 * Esta es una variante de una casilla de verificación.
 */
public class MacOSCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("Has creado MacOSCheckbox.");
    }
}