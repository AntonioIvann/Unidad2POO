class Suma { // Define la clase Suma
    int n1, n2; // Variables para almacenar los números

    public Suma() { // Constructor que inicializa los valores en 0
        this.n1 = 0;
        this.n2 = 0;
    } // Cierre del constructor

    public int getN1() { // Método para obtener el valor de n1
        return n1; 
    } // Cierre del método getN1

    public void setN1(int n1) { // Método para asignar un valor a n1
        this.n1 = n1; 
    } // Cierre del método setN1

    public int getN2() { // Método para obtener el valor de n2
        return n2; 
    } // Cierre del método getN2

    public void setN2(int n2) { // Método para asignar un valor a n2
        this.n2 = n2; 
    } // Cierre del método setN2

    public int sumar() { // Método que devuelve la suma de n1 y n2
        return n1 + n2; 
    } // Cierre del método sumar
} // Cierre de la clase Suma