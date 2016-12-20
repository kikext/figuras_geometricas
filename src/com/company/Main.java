package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Rectangulo stucom = new Rectangulo(3.5, 2.4, "azul");
        Rectangulo asus = new Rectangulo(4, 2.3, "rojo");


        double diagonalStucom = stucom.calcularDiagonal(false);

        System.out.println(diagonalStucom);

    }
}
