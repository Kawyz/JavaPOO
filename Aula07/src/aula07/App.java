package aula07;

public class App {

    public static void main(String[] args) {
        Lutador[] L = new Lutador[5];
        
        L[0] = new Lutador("Pretty Boy", "Franca", 31, 1.75, 68.9, 11, 3, 1);
        
        L[1] = new Lutador("Putscript", "Brasil", 28,1.68, 57.8, 14, 2, 3);
        
        L[2] = new Lutador("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);
        
        L[3] = new Lutador("Dead Code", "Australia", 28, 1.93, 81.6, 13, 0, 2);
        
        L[0].apresentar();
        L[2].status();
        L[3].getCategoria();
        L[1].ganharLuta();
        L[0].empatarLuta();
    }
    
}
