class MainM { // Clase principal para ejecutar el módulo
    public static void main(String[] args) { // Método principal
        Modulo m = new Modulo(); // Crea un objeto de la clase Modulo
        
        m.setN1(20); // Asigna el valor 20 a n1
        m.setN2(3);  // Asigna el valor 3 a n2

        System.out.println("Módulo: " + m.calcularModulo()); // Imprime el resultado del módulo
    } // Cierre del método main
} // Cierre de la clase MainModulo