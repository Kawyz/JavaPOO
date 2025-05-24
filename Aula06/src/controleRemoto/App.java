package controleRemoto;

public class App {

    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        
        c.play();
        c.maisVolume();
        c.abrirMenu();
        c.fecharMenu();
    }
}
