package projPOO01.GestionPersonnes;

import java.util.List;

import projPOO01.GestionAchat.commande;

public interface IFournisseur {
	/**
	 * @return retourne faux par défaut
	 */
	public default boolean livre() {
		return false;
	};

	/**
	 * @param listcommande retourne une liste de type commande
	 */
	public void commande(List<commande> listcommande);

	/**
	 * Méthode pour savoir si fournisseur
	 * 
	 * @return vrai par défaut
	 */
	public default boolean isFournisseur() {
		return true;
	};
}
