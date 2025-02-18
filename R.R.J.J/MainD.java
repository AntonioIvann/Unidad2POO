class MainD { // Clase principal para ejecutar la división
    public static void main(String[] args) { // Método principal
        Division d = new Division(); // Crea un objeto de la clase Division
        
        d.setN1(20); // Asigna el valor 20 a n1
        d.setN2(4);  // Asigna el valor 4 a n2

        System.out.println("División: " + d.dividir()); // Imprime el resultado de la división
    } // Cierre del método main
} // Cierre de la clase MainDivision