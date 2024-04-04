package factories;

import buttons.Button;
import checkboxes.Checkbox;

/**
 * La fábrica abstracta conoce todos los tipos de productos (abstractos).
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
