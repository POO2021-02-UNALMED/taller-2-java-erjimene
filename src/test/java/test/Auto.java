package test;
import java.util.ArrayList;
public class Auto {
	public String modelo;
	public int precio;
	public Asiento asientos[];
	public String marca;
	public Motor motor;
	public int registro;
	public static int cantidadCreados;
	
	public int cantidadAsientos() {
		int cont=0;
		for (Asiento asi:asientos) {
			if (asi!=null) {
				cont++;
			}
		}
		return cont;		
	}
	
	public String verificarIntegridad() {
		for (Asiento asi:asientos) {
			if (asi!=null) {
				if (this.registro==this.motor.registro && this.registro==asi.registro) {
					continue;
				}
				else {
					return ("Las piezas no son originales");
				}
			}
		}
		return ("Auto original");		
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	

	public Asiento[] getAsientos() {
		return asientos;
	}

	public void setAsientos(Asiento[] asientos) {
		this.asientos = asientos;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}

	public static int getCantidadCreados() {
		return cantidadCreados;
	}

	public static void setCantidadCreados(int cantidadCreados) {
		Auto.cantidadCreados = cantidadCreados;
	}

}
