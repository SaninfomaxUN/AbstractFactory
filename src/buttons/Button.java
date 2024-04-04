package buttons;

/**
 * La Fabrica Abstracta supone que tienes varias familias de productos,
 * estructurados en jerarquías de clases separadas (Botón/Casilla de verificación). Todos los productos de
 * la misma familia tiene la interfaz común.
 *
 * Esta es la interfaz común para la familia de botones.
 */
public interface Button {
    void paint();
}
