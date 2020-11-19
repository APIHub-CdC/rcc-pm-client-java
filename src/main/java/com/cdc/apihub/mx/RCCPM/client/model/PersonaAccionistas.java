package com.cdc.apihub.mx.RCCPM.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import com.cdc.apihub.mx.RCCPM.client.model.PersonaAccionistasDomicilio;

public class PersonaAccionistas {
	@SerializedName("RFC")
	private String RFC = null;
	@SerializedName("CURP")
	private String CURP = null;
	@SerializedName("nombre")
	private String nombre = null;
	@SerializedName("segundoNombre")
	private String segundoNombre = null;
	@SerializedName("apellidoPaterno")
	private String apellidoPaterno = null;
	@SerializedName("apellidoMaterno")
	private String apellidoMaterno = null;
	@SerializedName("domicilio")
	private PersonaAccionistasDomicilio domicilio = null;
	@SerializedName("porcentaje")
	private Integer porcentaje = null;

	public PersonaAccionistas RFC(String RFC) {
		this.RFC = RFC;
		return this;
	}

	@ApiModelProperty(example = "MMA060515IKA", value = "En caso de Accionista o Aval con domicilio en el Extranjero podría no presentarse el dato.")
	public String getRFC() {
		return RFC;
	}

	public void setRFC(String RFC) {
		this.RFC = RFC;
	}

	public PersonaAccionistas CURP(String CURP) {
		this.CURP = CURP;
		return this;
	}

	@ApiModelProperty(example = "MMA060515IKAPESD9", value = "Código Único de Registro de Población.")
	public String getCURP() {
		return CURP;
	}

	public void setCURP(String CURP) {
		this.CURP = CURP;
	}

	public PersonaAccionistas nombre(String nombre) {
		this.nombre = nombre;
		return this;
	}

	@ApiModelProperty(example = "ARTURO", value = "Nombre de la persona.")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public PersonaAccionistas segundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
		return this;
	}

	@ApiModelProperty(example = "KLEIN", value = "Segundo nombre de la persona.")
	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public PersonaAccionistas apellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
		return this;
	}

	@ApiModelProperty(example = "VAZQUEZ", value = "Apellido paterno de la persona.")
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public PersonaAccionistas apellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
		return this;
	}

	@ApiModelProperty(example = "GARRIDO", value = "Apellido materno de la persona.")
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public PersonaAccionistas domicilio(PersonaAccionistasDomicilio domicilio) {
		this.domicilio = domicilio;
		return this;
	}

	@ApiModelProperty(value = "")
	public PersonaAccionistasDomicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(PersonaAccionistasDomicilio domicilio) {
		this.domicilio = domicilio;
	}

	public PersonaAccionistas porcentaje(Integer porcentaje) {
		this.porcentaje = porcentaje;
		return this;
	}

	@ApiModelProperty(example = "27", value = "Porcentaje de Acciones, sólo para Accionistas.")
	public Integer getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(Integer porcentaje) {
		this.porcentaje = porcentaje;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PersonaAccionistas personaAccionistas = (PersonaAccionistas) o;
		return Objects.equals(this.RFC, personaAccionistas.RFC) && Objects.equals(this.CURP, personaAccionistas.CURP)
				&& Objects.equals(this.nombre, personaAccionistas.nombre)
				&& Objects.equals(this.segundoNombre, personaAccionistas.segundoNombre)
				&& Objects.equals(this.apellidoPaterno, personaAccionistas.apellidoPaterno)
				&& Objects.equals(this.apellidoMaterno, personaAccionistas.apellidoMaterno)
				&& Objects.equals(this.domicilio, personaAccionistas.domicilio)
				&& Objects.equals(this.porcentaje, personaAccionistas.porcentaje);
	}

	@Override
	public int hashCode() {
		return Objects.hash(RFC, CURP, nombre, segundoNombre, apellidoPaterno, apellidoMaterno, domicilio, porcentaje);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PersonaAccionistas {\n");

		sb.append("    RFC: ").append(toIndentedString(RFC)).append("\n");
		sb.append("    CURP: ").append(toIndentedString(CURP)).append("\n");
		sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
		sb.append("    segundoNombre: ").append(toIndentedString(segundoNombre)).append("\n");
		sb.append("    apellidoPaterno: ").append(toIndentedString(apellidoPaterno)).append("\n");
		sb.append("    apellidoMaterno: ").append(toIndentedString(apellidoMaterno)).append("\n");
		sb.append("    domicilio: ").append(toIndentedString(domicilio)).append("\n");
		sb.append("    porcentaje: ").append(toIndentedString(porcentaje)).append("\n");
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
