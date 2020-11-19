package com.cdc.apihub.mx.RCCPM.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.cdc.apihub.mx.RCCPM.client.model.Persona;

@ApiModel(description = "Datos generales de la persona a consultar.")
public class PersonaPeticion {
	@SerializedName("folioOtorgante")
	private String folioOtorgante = null;
	@SerializedName("persona")
	private Persona persona = null;

	public PersonaPeticion folioOtorgante(String folioOtorgante) {
		this.folioOtorgante = folioOtorgante;
		return this;
	}

	@ApiModelProperty(example = "7632", required = true, value = "Identificador de la consulta, dato ingresado por el usuario.")
	public String getFolioOtorgante() {
		return folioOtorgante;
	}

	public void setFolioOtorgante(String folioOtorgante) {
		this.folioOtorgante = folioOtorgante;
	}

	public PersonaPeticion persona(Persona persona) {
		this.persona = persona;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PersonaPeticion personaPeticion = (PersonaPeticion) o;
		return Objects.equals(this.folioOtorgante, personaPeticion.folioOtorgante)
				&& Objects.equals(this.persona, personaPeticion.persona);
	}

	@Override
	public int hashCode() {
		return Objects.hash(folioOtorgante, persona);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PersonaPeticion {\n");

		sb.append("    folioOtorgante: ").append(toIndentedString(folioOtorgante)).append("\n");
		sb.append("    persona: ").append(toIndentedString(persona)).append("\n");
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
