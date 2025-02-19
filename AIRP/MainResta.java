class MainResta { // Clase MainResta
    public static void main(String[] args) { // Metodo main
        Resta r1 = new Resta(); // Creamos un objeto de la clase Resta
        // Le asignamos valores a las variables de instancia
        r1.setN1(90);
        r1.setN2(45);
        Suma r2 = new Suma(); // Creamos un segundo objeto de la clase Suma
        // Le asignamos otros valores a las variables de instancia
        r2.setN1(123);
        r2.setN2(52);
        // Realizamos la primera operacion
        int res = r1.getN1() - r1.getN2();
        // Imprimimos el primer resultado
        System.out.println("El resultado de la primera resta es: " + res);
        // Realizamos la segunda operacion
        int res2 = r2.getN1() - r2.getN2();
        // Imprimimos el segundo resultado
        System.out.println("El resultado de la segunda resta es: " + res2);
    }
}