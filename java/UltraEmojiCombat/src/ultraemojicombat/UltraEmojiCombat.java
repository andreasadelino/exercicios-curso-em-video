


import ultraemojicombat.Luta;
import ultraemojicombat.Lutador;

public class UltraEmojiCombat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Lutador l[] = new Lutador[6];
        
        l[0] = new Lutador("Pretty Boy", "França",31, 1.75f, 68.9f, 11,2,1);
        l[1] = new Lutador("Putscript", "Brasil",29, 1.68f, 57f, 14, 2,3);
        l[2] = new Lutador("Nana", "Alemanha", 28, 1.63f,63f, 20, 3, 2 );
        l[3] = new Lutador("Bolt", "BR",25,1.70f, 72f,13, 3, 1 );
        l[4] = new Lutador("Livia", "Austria", 29, 1.65f,65f, 24, 5, 1 );
        l[5] = new Lutador("Tenente", "Belgica",31,1.75f, 76f,15, 4, 3 );
     
        Luta UEC01 = new Luta();
    UEC01.marcarLuta(l[4], l[5]);
    UEC01.lutar();
    l[4].status();
     l[5].status();
}
}