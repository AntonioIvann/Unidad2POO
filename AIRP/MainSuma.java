class MainSuma { // Clase MainSuma
    public static void main(String[] args) { // Método main
        Suma s1 = new Suma(); //Creamos un objeto de la clase Suma
        //Le asignamos valores a las variables de instancia
        s1.setN1(50);
        s1.setN2(60);
        Suma s2 = new Suma(); //Creamos un segundo objeto de la clase Suma
        //Le asignamos otros valores a las variables de instancia
        s2.setN1(30);
        s2.setN2(39);
        //Realizamos la operacion
        int r = s1.getN1() + s1.getN2();
        //Imprimimos el primer resultado
        System.out.println("El resultado de la primera suma es: " + r);
        //Realizamos otra operacion
        int r2 = s2.getN1() + s2.getN2();
        //Imprimimos el segundo resultado
        System.out.println("El resultado de la segunda suma es: " + r2);
    }
}