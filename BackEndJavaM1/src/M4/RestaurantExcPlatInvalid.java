package M4;

public class RestaurantExcPlatInvalid extends RestaurantException {
	
	private static final long serialVersionUID = 1L;

	
	public RestaurantExcPlatInvalid(String plat) {
		super("El plat informat (" + plat + ") no est� a la carta");
	}
}
