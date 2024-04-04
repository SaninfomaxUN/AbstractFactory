# Ejemplo de Abstract Factory para crear elementos de una interfaz de usuario (UI)

**Presentado Por:** David Santiago Cruz Hernandez [G2 - E4]

> Tomado y adaptado de: https://refactoring.guru/es/design-patterns/abstract-factory/java/example

![Diagrama de clases](https://refactoring.guru/images/patterns/diagrams/abstract-factory/example.png)

En este ejemplo, los botones y las casillas actuarán como productos. Tienen dos variantes: macOS y Windows.

La fábrica abstracta define una interfaz para crear botones y casillas. Hay dos fábricas concretas, que devuelven ambos productos en una única variante.

El código cliente funciona con fábricas y productos utilizando interfaces abstractas. Esto permite al código cliente funcionar con cualquier variante de producto creada por el objeto de fábrica.
