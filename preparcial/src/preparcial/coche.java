package preparcial;

public class coche {

	private int ruedas;

	private int largo;

	private int ancho;

	private int motor;

	private int pesoPlataforma;

	private String color;

	int peso_total;

	boolean asientos_cuero, climatizador;

	public coche() {

		ruedas = 4;

		largo = 2000;

		ancho = 300;

		motor = 1600;

		pesoPlataforma = 500;
	}

	public String dime_datos_generales() { // GETTER

		return "La plataforma del vehiculoltiene " + ruedas + " ruedas " + ". Mide " + largo / 1000
				+ " metros con un ancho de " + ancho + "cm y un peso de plataforma de " + pesoPlataforma + " kg";
	}

	public void establece_color(String color_coche) { // SETTER

		color = color_coche;

	}

	public String dime_color() {

		return "El color del coche es " + color;
	}

	public void configura_asientos(String asientos_cuero) {// SETTER
		if (asientos_cuero.equalsIgnoreCase("si")) {
			this.asientos_cuero = true;
		} else {
			this.asientos_cuero = false;
		}
	}

	public String dime_asientos() { // GETTER
		if (asientos_cuero == true) {

			return "El coche tiene asientos de cuero";
		} else {

			return "El coche tiene asientos de serie";

		}
	}

	public void configura_climatizador(String climatizador) { // SETTER
		if (climatizador.equalsIgnoreCase("si")) {

			this.climatizador = true;
		} else {
			this.climatizador = false;
		}
	}

	public String dime_climatizador() {// GETTER

		if (climatizador == true) {

			return "El coche incorpora climatizador";
		} else {

			return "El coche lleva aire acondicionado";

		}
	}
}
