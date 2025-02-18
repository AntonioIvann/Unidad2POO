class MainS { // Clase principal para ejecutar la suma
    public static void main(String[] args) { // Método principal
        Suma s = new Suma(); // Crea un objeto de la clase Suma
        
        s.setN1(10); // Asigna el valor 10 a n1
        s.setN2(5);  // Asigna el valor 5 a n2

        System.out.println("Suma: " + s.sumar()); // Imprime el resultado de la suma
    } // Cierre del método main
} // Cierre de la clase MainSuma