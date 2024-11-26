public class GestionnaireNotes {

    // Affiche note et moyennes
    public void afficherNotesEtMoyenne(String nomEtudiant, int[] notes) {
        // Affichage des notes
        afficheEtudiant(nomEtudiant);
        afficheNote(notes);

        // Calcul de la somme des notes
        int somme = 0;
        somme=sommeNote(notes,somme);

        // Affichage de la moyenne
        double moyenne = moyenneNote(notes,somme);
        afficheMoyenne(moyenne);
    }
    
    /**
     * affiche le nom d'un etudiant
     */
    public void afficheEtudiant(string nomEtudiant){
        System.out.println("Notes de " + nomEtudiant + ":");
    }
    
    /**
     * affiche les notes d'un etudiant
     */
    public void afficheNote(int [] notes){
        System.out.println("Notes de " + nomEtudiant + ":");
    }

    /**
     * fait la somme d'un tableau d'entier
     */
    public int sommeNote(int[] notes,int somme){
        for (int note : notes) {
            somme += note;
        }
        return somme;
    }
    
    /**
     * fait la moyenne des notes
     */
    public double moyenneNote(int[] notes,int somme){
        
        return (double) somme / notes.length;;
    }
    
    /**
     * affiche la moyenne
     */
    public void afficheMoyenne(double moyenne){
        System.out.println("Moyenne : " + moyenne);
    }
}
