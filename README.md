# Ejemplo de Abstract Factory para crear elementos de una interfaz de usuario (UI)

**Presentado Por:** David Santiago Cruz Hernandez [G2 - E4]
> El codigo se encuentra en el siguiente Repositorio: https://github.com/SaninfomaxUN/AbstractFactory

El patrón de diseño _Abstract Factory_ se utiliza para crear familias de objetos relacionados o dependientes sin especificar sus clases concretas. En lugar de crear objetos directamente utilizando sus constructores, el patrón define una interfaz para crear objetos, y las implementaciones concretas de esta interfaz se encargan de instanciar los objetos específicos.
Esto permite que el sistema sea flexible y extensible, ya que se pueden agregar nuevas variantes de productos creando nuevas implementaciones de la fábrica abstracta sin modificar el código que utiliza estas fábricas.


![Diagrama de clases](https://refactoring.guru/images/patterns/diagrams/abstract-factory/example.png)

Este ejemplo implementa una estructura de creación de interfaces de usuario (UI) para diferentes sistemas operativos (Windows y Mac) utilizando el patrón de diseño _Abstract Factory_. Este patrón permite crear familias de objetos relacionados (botones y checkboxes) sin especificar sus clases concretas.

Las interfaces _**GUIFactory, Button**_, y _**Checkbox**_ usan la abstracción para definir contratos generales, lo que permite que el sistema sea extensible. Este enfoque cumple con el _OCP (Open/Closed Principle)_ porque se pueden agregar nuevas fábricas y productos concretos sin modificar el código existente que depende de estas interfaces abstractas. Así, el sistema puede extenderse para soportar nuevos tipos de productos (como una nueva fábrica para Linux) sin cambiar el código que utiliza estas fábricas.

> Tomado y adaptado de: https://refactoring.guru/es/design-patterns/abstract-factory/java/example
