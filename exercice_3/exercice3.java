public class StockManager {

    // gere le stock
    public void gererStock(String typeOperation, String produit, int quantite, int stock) {
        // Ajout au stock
        if (typeOperation.equals("ajout")) {

           
            afficheAjout(produit,calculAjout(quantite,stock));

        // Retrait du stock
        } else if (typeOperation.equals("retrait")) {

            Retrait(quantite,stock,produit);

        // Si l'action est inconnu
        } else {

            afficheOpInconnu();

        }
    }
    
    /**
     * affiche les info après ajout
     */
    public void afficheAjout(tring produit, int stock){
        System.out.println("Produit : " + produit + ", Stock après ajout : " + stock);
    }
    
    /**
     * affiche les info après retrait
     */
    public void afficheRetrait(tring produit, int stock){
        System.out.println("Produit : " + produit + ", Stock après retrait : " + stock);
    }
    
    /**
     * affiche que le stock est inssuffisant
     */
    public void afficheInsuffisant(String produit){
        System.out.println("Stock insuffisant pour le produit : " + produit);
    }
    
    /**
     * affiche que la commande est inconnu
     */
    public void afficheOpInconnu(){
        System.out.println("Opération inconnue.");
    }
    
    /**
     * calcul  le stock apres ajout
     */
    public int calculAjout(int quantite, int stock){
       return stock+quantite;
    }

    /**
     * calcul  le stock apres retrait
     */
    public int calculRetrait(int quantite, int stock){
        return stock-quantite;
     }
    
    /**
     * fait les operation necessaire pendant et apres un retrait dans le stock
     */
    public void Retrait(int quantite, int stock, String produit){
        if (stock >= quantite) {

            
            afficheRetrait(produit,calculRetrait(quantite,produit));

        } else {

           afficheInsuffisant(produit);

        }
     }
}
