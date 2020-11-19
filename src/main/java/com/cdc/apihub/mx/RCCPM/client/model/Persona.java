package com.cdc.apihub.mx.RCCPM.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import com.cdc.apihub.mx.RCCPM.client.model.PersonaDomicilio;

public class Persona {
	@SerializedName("RFC")
	private String RFC = null;
	@SerializedName("nombre")
	private String nombre = null;
	@SerializedName("domicilio")
	private PersonaDomicilio domicilio = null;

	public Persona RFC(String RFC) {
		this.RFC = RFC;
		return this;
	}

	@ApiModelProperty(example = "ADS990201AN1", required = true, value = "RFC de la compañía. El dato es opcional cuando se reporta un acreditado con domicilio en el extranjero. Cuando se cuenta con el dato debe ser capturado, pues aplica para el proceso de búsqueda e integración de expedientes.")
	public String getRFC() {
		return RFC;
	}

	public void setRFC(String RFC) {
		this.RFC = RFC;
	}

	public Persona nombre(String nombre) {
		this.nombre = nombre;
		return this;
	}

	@ApiModelProperty(example = "EMPRESA SA DE CV", required = true, value = "Nombre de la compañía (Persona Moral) o primer nombre de la Persona Física con Actividad Empresarial.")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Persona domicilio(PersonaDomicilio domicilio) {
		this.domicilio = domicilio;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	public PersonaDomicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(PersonaDomicilio domicilio) {
		this.domicilio = domicilio;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Persona persona = (Persona) o;
		return Objects.equals(this.RFC, persona.RFC) && Objects.equals(this.nombre, persona.nombre)
				&& Objects.equals(this.domicilio, persona.domicilio);
	}

	@Override
	public int hashCode() {
		return Objects.hash(RFC, nombre, domicilio);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Persona {\n");

		sb.append("    RFC: ").append(toIndentedString(RFC)).append("\n");
		sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
		sb.append("    domicilio: ").append(toIndentedString(domicilio)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
