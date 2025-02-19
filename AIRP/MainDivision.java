class MainDivision { // Clase MainDivision
    public static void main(String[] args) { // Metodo main
        Division d1 = new Division(); // Creamos un objeto de la clase Division
        // Le asignamos valores a las variables de instancia
        d1.setN1(965);
        d1.setN2(56);
        Division d2 = new Division(); // Creamos un segundo objeto de la clase Division
        // Le asignamos otros valores a las variables de instancia
        d2.setN1(6587);
        d2.setN2(587);
        // Realizamos la primera operacion
        double r = d1.getN1() / d1.getN2(); 
        // Imprimimos el primer resultado
        System.out.println("El resultado de la primera división es: " + r);
        // Realizamos la segunda operacion
        double r2 = d2.getN1() / d2.getN2();
        // Imprimimos el segundo resultado
        System.out.println("El resultado de la segunda división es: " + r2);
    }
}