class MainR { // Clase principal para ejecutar la resta
    public static void main(String[] args) { // Método principal
        Resta r = new Resta(); // Crea un objeto de la clase Resta
        
        r.setN1(15); // Asigna el valor 15 a n1
        r.setN2(5);  // Asigna el valor 5 a n2

        System.out.println("Resta: " + r.restar()); // Imprime el resultado de la resta
    } // Cierre del método main
} // Cierre de la clase MainResta