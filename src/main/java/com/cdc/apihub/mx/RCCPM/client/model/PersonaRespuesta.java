package com.cdc.apihub.mx.RCCPM.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import com.cdc.apihub.mx.RCCPM.client.model.PersonaRespuestaDomicilio;

public class PersonaRespuesta {
	@SerializedName("RFC")
	private String RFC = null;
	@SerializedName("nombre")
	private String nombre = null;
	@SerializedName("nacionalidad")
	private String nacionalidad = null;
	@SerializedName("domicilio")
	private PersonaRespuestaDomicilio domicilio = null;

	public PersonaRespuesta RFC(String RFC) {
		this.RFC = RFC;
		return this;
	}

	@ApiModelProperty(example = "ADS990201AN1", value = "RFC de la compañía. El dato es opcional cuando se reporta un acreditado con domicilio en el extranjero. Cuando se cuenta con el dato debe ser capturado, pues aplica para el proceso de búsqueda e integración de expedientes.")
	public String getRFC() {
		return RFC;
	}

	public void setRFC(String RFC) {
		this.RFC = RFC;
	}

	public PersonaRespuesta nombre(String nombre) {
		this.nombre = nombre;
		return this;
	}

	@ApiModelProperty(example = "EMPRESA SA DE CV", value = "Nombre de la compañía (Persona Moral) o primer nombre de la Persona Física con Actividad Empresarial.")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public PersonaRespuesta nacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public PersonaRespuesta domicilio(PersonaRespuestaDomicilio domicilio) {
		this.domicilio = domicilio;
		return this;
	}

	@ApiModelProperty(value = "")
	public PersonaRespuestaDomicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(PersonaRespuestaDomicilio domicilio) {
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
		PersonaRespuesta personaRespuesta = (PersonaRespuesta) o;
		return Objects.equals(this.RFC, personaRespuesta.RFC) && Objects.equals(this.nombre, personaRespuesta.nombre)
				&& Objects.equals(this.nacionalidad, personaRespuesta.nacionalidad)
				&& Objects.equals(this.domicilio, personaRespuesta.domicilio);
	}

	@Override
	public int hashCode() {
		return Objects.hash(RFC, nombre, nacionalidad, domicilio);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PersonaRespuesta {\n");

		sb.append("    RFC: ").append(toIndentedString(RFC)).append("\n");
		sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
		sb.append("    nacionalidad: ").append(toIndentedString(nacionalidad)).append("\n");
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
