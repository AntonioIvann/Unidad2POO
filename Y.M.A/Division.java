class Division { // Define la clase Division
    int n1, n2; // Variables para los números

    public Division() { // Constructor que inicializa n2 en 1 para evitar división por cero
        this.n1 = 0;
        this.n2 = 1;
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

    public void setN2(int n2) { // Evita que n2 sea 0
        this.n2 = (n2 == 0) ? 1 : n2; 
    } // Cierre del método setN2

    public double dividir() { // Método que devuelve la división
        return (double) n1 / n2; 
    } // Cierre del método dividir
} // Cierre de la clase Division