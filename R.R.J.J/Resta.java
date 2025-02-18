class Resta { // Define la clase Resta
    int n1, n2; // Variables para los números

    public Resta() { // Constructor que inicializa en 0
        this.n1 = 0;
        this.n2 = 0;
    } // Cierre del constructor

    public int getN1() { // Método para obtener n1
        return n1; 
    } // Cierre del método getN1

    public void setN1(int n1) { // Método para asignar n1
        this.n1 = n1; 
    } // Cierre del método setN1

    public int getN2() { // Método para obtener n2
        return n2; 
    } // Cierre del método getN2

    public void setN2(int n2) { // Método para asignar n2
        this.n2 = n2; 
    } // Cierre del método setN2

    public int restar() { // Método que devuelve la resta
        return n1 - n2; 
    } // Cierre del método restar
} // Cierre de la clase Resta