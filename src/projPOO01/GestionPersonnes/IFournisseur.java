package projPOO01.GestionPersonnes;

import java.util.List;

import projPOO01.GestionAchat.commande;

public interface IFournisseur {
	/**
	 * @return retourne faux par d�faut
	 */
	public default boolean livre() {
		return false;
	};

	/**
	 * @param listcommande retourne une liste de type commande
	 */
	public void commande(List<commande> listcommande);

	/**
	 * M�thode pour savoir si fournisseur
	 * 
	 * @return vrai par d�faut
	 */
	public default boolean isFournisseur() {
		return true;
	};
}
