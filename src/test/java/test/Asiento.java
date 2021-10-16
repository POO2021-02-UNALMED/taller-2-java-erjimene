package test;
import java.util.ArrayList;
public class Asiento {
	public String color;
	public int precio;
	public int registro;
	
	public void cambiarColor(String color) {
		ArrayList<String> C = new ArrayList<String>();
		C.add("rojo");
		C.add("verde");
		C.add("amarillo");
		C.add("negro");
		C.add("blanco");		
		boolean existe = C.contains(color);
		if (existe == true){
			this.color=color;			
		}				
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}
	
	
}
