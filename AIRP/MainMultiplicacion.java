class MainMultiplicacion { // Clase MainMultiplicacion
    public static void main(String[] args) { // Metodo main
        Multiplicacion m1 = new Multiplicacion(); // Creamos un objeto de la clase Multiplicacion
        // Le asignamos valores a las variables de instancia
        m1.setN1(68);
        m1.setN2(78);
        Multiplicacion m2 = new Multiplicacion(); // Creamos un segundo objeto de la clase Multiplicacion
        // Le asignamos otros valores a las variables de instancia
        m2.setN1(85);
        m2.setN2(63);
        // Realizamos la primera operacion
        int r = m1.getN1() * m1.getN2();
        // Imprimimos el primer resultado
        System.out.println("El resultado de la primera multiplicacion es: " + r);
        // Realizamos la segunda operacion
        int r2 = m2.getN1() * m2.getN2();
        // Imprimimos el segundo resultado
        System.out.println("El resultado de la segunda multiplicacion es: " + r2);
    }
}