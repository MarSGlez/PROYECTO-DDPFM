package net.codejava;

public class Domicilio {
	
	private int ID;
	private String  CALLE;
	private int NUMERO;
	private String NUMERO_INTERIOR;
	private int ID_DE_ASENTAMIENTO;
	
	protected Domicilio() {
	}
	
	protected Domicilio(int ID, String CALLE, int NUMERO, String NUMERO_INTERIOR, int ID_DE_ASENTAMIENTO){
        this.ID = ID;
        this.CALLE = CALLE;
        this.NUMERO = NUMERO;
        this.NUMERO_INTERIOR = NUMERO_INTERIOR;
        this.ID_DE_ASENTAMIENTO = ID_DE_ASENTAMIENTO;
    }

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getCALLE() {
		return CALLE;
	}

	public void setCALLE(String CALLE) {
		this.CALLE = CALLE;
	}

	public int getNUMERO() {
		return NUMERO;
	}

	public void setNUMERO(int NUMERO) {
		this.NUMERO = NUMERO;
	}

	public String getNUMERO_INTERIOR() {
		return NUMERO_INTERIOR;
	}

	public void setNUMERO_INTERIOR(String NUMERO_INTERIOR) {
		this.NUMERO_INTERIOR = NUMERO_INTERIOR;
	}

	public int getID_DE_ASENTAMIENTO() {
		return ID_DE_ASENTAMIENTO;
	}

	public void setID_DE_ASENTAMIENTO(int ID_DE_ASENTAMIENTO) {
		this.ID_DE_ASENTAMIENTO = ID_DE_ASENTAMIENTO;
	}

	
}
