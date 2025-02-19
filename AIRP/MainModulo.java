class MainModulo { // Clase MainModulo
    public static void main(String[] args) { // Metodo main
        Modulo mod1 = new Modulo(); // Creamos un objeto de la clase Resta
        // Le asignamos valores a las variables de instancia
        mod1.setN1(965);
        mod1.setN2(45);
        Modulo mod2 = new Modulo(); // Creamos un segundo objeto de la clase Suma
        // Le asignamos otros valores a las variables de instancia
        mod2.setN1(258);
        mod2.setN2(5);
        // Realizamos la primera operacion
        int r1 = mod1.getN1() % mod1.getN2();
        // Imprimimos el primer resultado
        System.out.println("El primer modulo es: " + r1);
        // Realizamos la segunda operacion
        int r2 = mod2.getN1() % mod2.getN2();
        // Imprimimos el segundo resultado
        System.out.println("El segundo modulo es: " + r2);
    }
}