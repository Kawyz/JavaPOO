/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controleRemoto;

/**
 *
 * @author kakaw
 */
public class ControleRemoto implements Controlador {
    
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //Construtor
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    
    
    //Métodos Abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
    }
    
    @Override
    public void desligar() {
        this.setLigado(false);
    }
    
    @Override
    public void abrirMenu() {
        System.out.println(getLigado());
        System.out.println(getVolume());
        for (int i = 0; getVolume() < 10; i++) {
            System.out.println("|");
        }
        System.out.println(getTocando());
    }
    
    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }
    
    @Override
    public void maisVolume() {
        if (getLigado()) {
            setVolume(getVolume() + 1);
        }
    }
    
    @Override
    public void menosVolume() {
        if (getLigado()) {
            setVolume(getVolume() - 1);
        }
    }
    
    @Override
    public void ligarMudo() {
        if (getLigado() && getVolume() > 0) {
            setVolume(0);
        }
    }
    
    @Override
    public void desligarMudo() {
        if (getLigado() && getVolume() == 0) {
            setVolume(50);
        }
    }
    
    @Override
    public void play() {
        if (getLigado() && !getTocando()) {
            setTocando(true);
        }
    }
    
    @Override
    public void pause() {
        if (getLigado() && getTocando()) {
            setTocando(false);
        }
    } 
    
   //Métodos Especiais
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    public boolean getLigado() {
        return ligado;
    }
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
    public boolean getTocando() {
        return tocando;
    }
    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
}
