package aula07;

public class App {

    public static void main(String[] args) {
        
        Lutador[] L = new Lutador[6];
        
        L[0] = new Lutador("Pretty Boy", "Franca", 31, 1.75, 68.9, 11, 2, 1);
        
        L[1] = new Lutador("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);
        
        L[2] = new Lutador("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);
        
        L[3] = new Lutador("Dead Code", "Australia", 28, 1.93, 81.6, 13, 0, 2);
        
        L[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70, 119.3, 5, 4, 3);
        
        L[5] = new Lutador("Nerdaart", "EUA", 30, 1.81, 105.7, 12, 2, 4);
        
        L[3].apresentar();
        L[3].ganharLuta();
        L[3].status();
    }
    
}
