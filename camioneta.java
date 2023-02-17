package prueba1;

public class camioneta {
	private int ruedas;
	private int puertas;
	private int cilindros;
	private String color;
	private boolean cuatroporcuatro;
	private boolean cajon;
	private boolean transmision;
	private int precio;
	
	public camioneta() {
		ruedas=4;
		cilindros=8;
		puertas=4;
	}
	
	public String resumen() {
		return"El vehiculo es una camioneta con "+ruedas+" ruedas. Tiene "+cilindros+" cilindros y "+puertas+" puertas. ";
	}
	public void setColor(String colorCamioneta) {
		color=colorCamioneta; 
	}
	public String getColor() {
		return "Color de la camioneta: "+color; 
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
	public void cajonConfig(String cajon) {
		if(cajon.equalsIgnoreCase("si")) {
			this.cajon=true;
		}else {
			this.cajon=false;
		}
	}
	public String getCajon() {
		if(cajon == true) {
			return"La camioneta lleva cajon";
		}else {
			return"La camioneta no lleva cajon";
		}
	}
	public void cuatroxcuatroConfig(String cuatroporcuatro) {
		if(cuatroporcuatro.equalsIgnoreCase("si")) {
			this.cuatroporcuatro=true;
		}else {
			this.cuatroporcuatro=false;
		}
	}
	public String getCuatroporcuatro() {
		if(cajon == true) {
			return"es 4x4";
		}else {
			return"no es 4x4";
		}
	}
	public int precioCamioneta() {
		int precio=8500;
		if(transmision) {
			precio-=500;
		}if(cuatroporcuatro) {
			precio+=2000;
		}if(cajon) {
			precio+=1000;
		}
		return precio;
	}
	public static void main (String[] args) {
		camioneta c1 = new camioneta ();
		c1.setColor("azul claro");
		c1.transmisionConfig("sincronica");
		c1.cuatroxcuatroConfig("si");
		c1.cajonConfig("si");
		System.out.println(c1.resumen()+""
		+c1.getColor() +". "+c1.getCajon() +", "+c1.getCuatroporcuatro() +" y tiene transmision "+c1.getTransmision()+". Costo total: "+c1.precioCamioneta()+".");
				
				
	}
	
}
