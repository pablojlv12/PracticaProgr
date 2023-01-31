package examenProg;

public class Carta {

	String valor;
	private boolean enBaraja;
    Baraja Carta;
	
	public Carta(String valor,boolean enBaraja) {
	
		for (int i = 0; i < 54; i++) {
	
		
			valor = i + "corazones";
			if (i > 13 && i < 26) valor = i + "picas";
			else if (i > 26 && i < 39) valor = i + "treboles";
			else if (i > 39 && i < 52) valor = i + "treboles"; 
			else if (i > 52) valor = "joker";
			
		}
		enBaraja = true;
	}

	public String toString() {
		return "Carta [valor= " + valor + ", enBaraja= " + enBaraja + "]";
	
	}
	
}
