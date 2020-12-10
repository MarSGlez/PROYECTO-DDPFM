package net.codejava;
import java.util.Date;

public class organizacion {
	
	private int ID;
	private String NOMBRE;
	private Date FECHA_DE_CREACION;
	private Date FECHA_DE_FIN;
	
	protected organizacion() {
	}
	
	protected organizacion(int ID, String NOMBRE, Date FECHA_DE_CREACION, Date FECHA_DE_FIN){
        this.ID = ID;
        this.NOMBRE = NOMBRE;
        this.FECHA_DE_CREACION = FECHA_DE_CREACION;
        this.FECHA_DE_FIN = FECHA_DE_FIN;
    }

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getNOMBRE() {
		return NOMBRE;
	}

	public void setNOMBRE(String NOMBRE) {
		this.NOMBRE = NOMBRE;
	}

	public Date getFECHA_DE_CREACION() {
		return FECHA_DE_CREACION;
	}

	public void setFECHA_DE_CREACION(Date FECHA_DE_CREACION) {
		this.FECHA_DE_CREACION = FECHA_DE_CREACION;
	}

	public Date getFECHA_DE_FIN() {
		return FECHA_DE_FIN;
	}

	public void setFECHA_DE_FIN(Date FECHA_DE_FIN) {
		this.FECHA_DE_FIN = FECHA_DE_FIN;
	}

	
	
}
