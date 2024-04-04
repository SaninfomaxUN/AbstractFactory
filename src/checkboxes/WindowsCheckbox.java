package checkboxes;

/**
 * Todas las familias de productos tienen las mismas variedades (MacOS/Windows).
 *
 * Esta es otra variante de una casilla de verificación.
 */
public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("Has creado WindowsCheckbox.");
    }
}
