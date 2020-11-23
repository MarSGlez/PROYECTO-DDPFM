package net.codejava;

import java.util.Date;


public class Sale {

	private int ID;
	private String  TIPO_DE_PERSONA;
	private int ID_DE_PERSONA;
	private int ID_DE_DOMICILIO;
	private String TIPO_DE_DOMICILIO;
	private Date FECHA_DE_INICIO;
	private Date FECHA_DE_FIN;

	protected Sale() {
	}

	protected Sale(int ID, String TIPO_DE_PERSONA, int ID_DE_PERSONA, int ID_DE_DOMICILIO,
    		String TIPO_DE_DOMICILIO, Date FECHA_DE_INICIO, Date FECHA_DE_FIN) {
        this.ID = ID;
        this.TIPO_DE_PERSONA = TIPO_DE_PERSONA;
        this.ID_DE_PERSONA = ID_DE_PERSONA;
        this.ID_DE_DOMICILIO = ID_DE_DOMICILIO;
        this.TIPO_DE_DOMICILIO = TIPO_DE_DOMICILIO;
        this.FECHA_DE_INICIO = FECHA_DE_INICIO;
        this.FECHA_DE_FIN =  FECHA_DE_FIN;
    }

	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public String getTIPO_DE_PERSONA() {
		return TIPO_DE_PERSONA;
	}
	public void setTIPO_DE_PERSONA(String TIPO_DE_PERSONA) {
		this.TIPO_DE_PERSONA = TIPO_DE_PERSONA;
	}
	public int getID_DE_PERSONA() {
		return ID_DE_PERSONA;
	}
	public void setID_DE_PERSONA(int ID_DE_PERSONA) {
		this.ID_DE_PERSONA = ID_DE_PERSONA;
	}
	public int getID_DE_DOMICILIO() {
		return ID_DE_DOMICILIO;
	}
	public void setID_DE_DOMICILIO(int ID_DE_DOMICILIO) {
		this.ID_DE_DOMICILIO = ID_DE_DOMICILIO;
	}
	public String getTIPO_DE_DOMICILIO() {
		return TIPO_DE_DOMICILIO;
	}
	public void setTIPO_DE_DOMICILIO(String TIPO_DE_DOMICILIO) {
		this.TIPO_DE_DOMICILIO = TIPO_DE_DOMICILIO;
	}
	public Date getFECHA_DE_INICIO() {
		return FECHA_DE_INICIO;
	}
	public void setFECHA_DE_INICIO(Date FECHA_DE_INICIO) {
		this.FECHA_DE_INICIO = FECHA_DE_INICIO;
	}
	public Date getFECHA_DE_FIN() {
		return FECHA_DE_FIN;
	}
	public void setFECHA_DE_FIN(Date FECHA_DE_FIN) {
		this.FECHA_DE_FIN = FECHA_DE_FIN;
	}
	/*
	@Override
	public String toString() {
		return "Sale [id=" + id + ", item=" + item + ", quantity=" + quantity + ", amount=" + amount + "]";
	}*/

	
}
