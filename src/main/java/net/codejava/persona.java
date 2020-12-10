package net.codejava;
import java.util.Date;

public class persona {
	
	private int ID;
	private String NOMBRE;
	private String APELLIDO_PATERNO;
	private String APELLIDO_MATERNO;
	private Date FECHA_DE_NACIMIENTO;
	private Date FECHA_DE_FIN;
	
	protected persona() {
	}
	
	protected persona(int ID, String NOMBRE, String APELLIDO_PATERNO, String APELLIDO_MATERNO, Date FECHA_DE_NACIMIENTO, Date FECHA_DE_FIN){
        this.ID = ID;
        this.NOMBRE = NOMBRE;
        this.APELLIDO_PATERNO = APELLIDO_PATERNO;
        this.APELLIDO_MATERNO = APELLIDO_MATERNO;
        this.FECHA_DE_NACIMIENTO = FECHA_DE_NACIMIENTO;
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

	public String getAPELLIDO_PATERNO() {
		return APELLIDO_PATERNO;
	}

	public void setAPELLIDO_PATERNO(String APELLIDO_PATERNO) {
		this.APELLIDO_PATERNO = APELLIDO_PATERNO;
	}

	public String getAPELLIDO_MATERNO() {
		return APELLIDO_MATERNO;
	}

	public void setAPELLIDO_MATERNO(String APELLIDO_MATERNO) {
		this.APELLIDO_MATERNO = APELLIDO_MATERNO;
	}

	public Date getFECHA_DE_NACIMIENTO() {
		return FECHA_DE_NACIMIENTO;
	}

	public void setFECHA_DE_NACIMIENTO(Date FECHA_DE_NACIMIENTO) {
		this.FECHA_DE_NACIMIENTO = FECHA_DE_NACIMIENTO;
	}

	public Date getFECHA_DE_FIN() {
		return FECHA_DE_FIN;
	}

	public void setFECHA_DE_FIN(Date FECHA_DE_FIN) {
		this.FECHA_DE_FIN = FECHA_DE_FIN;
	}

	
	
	
}
