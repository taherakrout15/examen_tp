package examen_tp;

public class OrgniseEvtMois {
	private int mois;
	private ThemeEvt theme ;
	private Evenement[] evenements;
	
	public OrgniseEvtMois(int mois, ThemeEvt theme) {
		super();
		this.mois = mois;
		this.theme = theme;
		this.evenements = new Evenement[nbMax()];
	}
	 public int nbMax() {
	         switch (mois) {
	         case 2:return 28;
	         case 4:return 30;
	         case 6:return 30;
	         case 9:return 30;
	         case 11:return 30;
	         default:return 31;
	    }
	}
	void ajouter (Evenement Evt, int jour) throws EvtException {
		
		if (jour < 1 || jour > nbMax()) {
	            throw new EvtException("Jour Incorrecte");
	        }
			 if(evenements[jour-1]==null) {
				 evenements[jour-1]=Evt;
			 }
			 else {
				 for(int i =0;i<evenements.length;i++) {
					 if(evenements[i]!=null) {
						 throw new EvtException("complet");
					 }
				 }
		 }
		
	}
	public void afficherCalendrierEvts() {
        for (int i = 0; i < evenements.length; i++) {
            if (evenements[i] != null) {
                System.out.println("Jour " + (i + 1) + ": " + evenements[i]);
            } 
        }
    }
	 
}
