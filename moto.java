package prueba1;

public class moto {
	private int ruedas;
	private String marca;
	private int cilindros;
	private String color;
	private boolean parrilla;
	private boolean transmision;
	private int precio;
	
	public moto() {
		marca="Kawasaki";
		cilindros=6;
		ruedas=2;
	}
	public String resumen() {
		return "El vehiculo es una moto con "+ruedas+" ruedas. Tiene "+cilindros+" cilindros y es de marca "+marca+". ";
	}
	public void setColor(String colorMoto) {
		color=colorMoto; 
	}
	public String getColor() {
		return "Color de la moto: "+color; 
	}
	public void transmisionConfig(String transmision) {
		if(transmision.equalsIgnoreCase("sincronica")) {
			this.transmision=true;
		}else { 
			this.transmision=false;
		}
	}
	public String getTransmision() {
		if(transmision == true) {
			return"sincronica";
		}else {
			return"automatica";
		}
	}
	public void parrillaConfig(String parrilla) {
		if(parrilla.equalsIgnoreCase("si")) {
			this.parrilla=true;
		}else { 
			this.parrilla=false;
		}
	}
	public String getParrilla() {
		if(parrilla == true) {
			return"Lleva parrilla";
		}else {
			return"No lleva parrilla";
		}
	}
	public int precioMoto() {
		int precio=3000;
		if(transmision) {
			precio-=500;
		}if(parrilla) {
			precio+=500;
		}
		return precio;
	}
	public static void main (String[] args) {
		moto m1 = new moto ();
		m1.setColor("Verde Manzana");
		m1.transmisionConfig("automatica");
		m1.parrillaConfig("si");
		System.out.println(m1.resumen()+""
		+m1.getColor() +". "+m1.getParrilla() +" y tiene transmision "+m1.getTransmision()+". Costo total: "+m1.precioMoto()+".");
}
}

