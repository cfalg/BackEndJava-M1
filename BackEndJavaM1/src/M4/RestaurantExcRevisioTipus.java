package M4;

public class RestaurantExcRevisioTipus extends RestaurantException {
	
	private static final long serialVersionUID = 1L;

	
	public RestaurantExcRevisioTipus(String tipus) {
		super("Aquesta opció sel.leccionada ("+tipus+") no es correcte.");
	}
}
