daniel Salvador
# Java: Apuntes Básicos 

## 1. Introducción a Java
- **Java** es un lenguaje de programación orientado a objetos desarrollado por Sun Microsystems (ahora parte de Oracle) en 1995.
- Es multiplataforma, lo que significa que el mismo código puede ejecutarse en diferentes sistemas operativos sin modificaciones (gracias a la Máquina Virtual de Java, o JVM).
- Java se utiliza en aplicaciones móviles, desarrollo web, software empresarial y sistemas embebidos.

## 2. Características de Java
- **Orientado a objetos**: Java se basa en conceptos como clases, objetos, herencia, polimorfismo y encapsulamiento.
- **Independiente de la plataforma**: Escribiendo una vez el código, puedes ejecutarlo en cualquier sistema operativo que tenga la JVM.
- **Seguridad**: Proporciona un entorno seguro mediante su gestión de memoria y su sistema de excepciones.
- **Recolección de basura**: Java gestiona automáticamente la memoria, eliminando objetos que ya no se usan.
- **Multithreading**: Soporta la ejecución de múltiples hilos de manera simultánea, permitiendo hacer varias tareas a la vez.

## 3. Estructura Básica de un Programa Java

```java
public class MiPrograma {
    public static void main(String[] args) {
        System.out.println("¡Hola, Mundo!");
    }
}
```

- `public class MiPrograma`: Define una clase llamada `MiPrograma`.
- `public static void main(String[] args)`: Es el punto de entrada principal de cualquier programa en Java. Es el método que ejecuta el programa.
- `System.out.println("¡Hola, Mundo!");`: Imprime "¡Hola, Mundo!" en la consola.

## 4. Variables y Tipos de Datos
- **Tipos de datos primitivos**:
  - `int`: Enteros (4 bytes, rango: -2^31 a 2^31-1).
  - `double`: Números decimales (8 bytes).
  - `boolean`: Valores lógicos `true` o `false`.
  - `char`: Caracteres (2 bytes).
- **Variables**:

```java
int numero = 10;
double precio = 19.99;
char letra = 'A';
boolean esJavaGenial = true;
```

## 5. Operadores
- **Aritméticos**: `+`, `-`, `*`, `/`, `%`.
- **Relacionales**: `==`, `!=`, `>`, `<`, `>=`, `<=`.
- **Lógicos**: `&&` (AND), `||` (OR), `!` (NOT).

## 6. Estructuras de Control
- **Condicionales**:

```java
if (condición) {
    // código
} else {
    // código
}
```

Ejemplo:

```java
int x = 10;
if (x > 5) {
    System.out.println("x es mayor que 5");
} else {
    System.out.println("x no es mayor que 5");
}
```

- **Bucle For**:

```java
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}
```

- **Bucle While**:

```java
int i = 0;
while (i < 10) {
    System.out.println(i);
    i++;
}
```

## 7. Clases y Objetos
- **Clases**: Definen las características y comportamientos de los objetos. Una clase es como un plano.

Ejemplo de una clase simple:

```java
public class Coche {
    // Atributos
    String marca;
    String modelo;
    
    // Constructor
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    // Método
    public void arrancar() {
        System.out.println("El coche está arrancando");
    }
}
```

- **Objetos**: Son instancias de una clase.

```java
Coche miCoche = new Coche("Toyota", "Corolla");
miCoche.arrancar();
```

## 8. Herencia
- Permite que una clase "herede" atributos y métodos de otra clase.
- Se utiliza la palabra clave `extends`.

Ejemplo:

```java
public class Vehiculo {
    public void arrancar() {
        System.out.println("El vehículo está arrancando");
    }
}

public class Moto extends Vehiculo {
    // Moto hereda el método arrancar
}

Moto miMoto = new Moto();
miMoto.arrancar(); // Salida: El vehículo está arrancando
```

## 9. Interfaces
- Una **interfaz** define un conjunto de métodos que una clase debe implementar.

```java
interface Volador {
    void volar();
}

public class Avion implements Volador {
    public void volar() {
        System.out.println("El avión está volando");
    }
}
```

## 10. Excepciones
- Se utilizan para manejar errores y situaciones excepcionales en el código.
- Se usa `try`, `catch` y `finally`.

Ejemplo:

```java
try {
    int resultado = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Error: División por cero");
} finally {
    System.out.println("Este bloque siempre se ejecuta");
}
```
