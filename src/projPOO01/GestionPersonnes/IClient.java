package projPOO01.GestionPersonnes;

import java.util.List;

import projPOO01.GestionAchat.Achat;

public interface IClient {
	public void achete(List<Achat> listachat);

	/**
	 * @return retourne faux par défaut
	 */
	public default boolean paie() {
		return false;
	}

	/**
	 * Pour savoir si client
	 * 
	 * @return retourne faux par défaut
	 */
	public default boolean isClient() {
		return false;
	}
}
