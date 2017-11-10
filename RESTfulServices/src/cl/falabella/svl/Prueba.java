package cl.falabella.svl;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import com.sun.xml.txw2.annotation.XmlElement;

@XmlRootElement(name = "id")
public class Prueba implements Serializable {
	/**
	 * s
	 */
	private static final long serialVersionUID = 1L;
	
	int id;
	String value;
	
	public int getId() {
		return id;
	}
	@XmlElement
	public void setId(int id) {
		this.id = id;
	}
	public String getValue() {
		return value;
	}
	@XmlElement
	public void setValue(String value) {
		this.value = value;
	}
	
	
}
