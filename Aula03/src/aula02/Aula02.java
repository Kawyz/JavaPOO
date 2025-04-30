/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula02;

/**
 *
 * @author kakaw
 */
public class Aula02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Caneta c1 = new Caneta();
       c1.modelo = "BIC cristal";
       c1.cor = "Azul";
       //c1.ponta = 0.5f;
       c1.carga = 80;
       //c1.tampada = false;
       c1.destampar();
       c1.status();
       //c1.rabiscar();
    }
}
