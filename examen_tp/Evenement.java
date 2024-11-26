package examen_tp;

import java.util.Arrays;

public class Evenement {
    private String titre;
    private int duree;
    private String[] acteurs;
    private String realisateur;
	public Evenement(String titre, int duree, String[] acteurs, String realisateur) {
		super();
		this.titre = titre;
		this.duree = duree;
		this.acteurs = acteurs;
		this.realisateur = realisateur;
	}
	@Override
	public String toString() {
		return "Evenement [titre=" + titre + ", duree=" + duree + ", acteurs=" + Arrays.toString(acteurs)
				+ ", realisateur=" + realisateur + "]";
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	public String getRealisateur() {
		return realisateur;
	}
	public void setRealisateur(String realisateur) {
		this.realisateur = realisateur;
	}
	 public boolean acteurIn(String s) {
	        for (String acteur : acteurs) {
	            if (acteur.equals(s)) {
	                return true;
	            }
	        }
	        return false;
	    }

   
}
