package com.cdc.apihub.mx.RCCPM.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

public class CalificacionCarteraRespuesta {
	@SerializedName("calificacion")
	private String calificacion = null;
	@SerializedName("nombreOtorgante")
	private String nombreOtorgante = null;

	public CalificacionCarteraRespuesta calificacion(String calificacion) {
		this.calificacion = calificacion;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(String calificacion) {
		this.calificacion = calificacion;
	}

	public CalificacionCarteraRespuesta nombreOtorgante(String nombreOtorgante) {
		this.nombreOtorgante = nombreOtorgante;
		return this;
	}

	@ApiModelProperty(example = "BANCO", value = "Nombre del otorgante que envían la calificacio.́n")
	public String getNombreOtorgante() {
		return nombreOtorgante;
	}

	public void setNombreOtorgante(String nombreOtorgante) {
		this.nombreOtorgante = nombreOtorgante;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CalificacionCarteraRespuesta calificacionCarteraRespuesta = (CalificacionCarteraRespuesta) o;
		return Objects.equals(this.calificacion, calificacionCarteraRespuesta.calificacion)
				&& Objects.equals(this.nombreOtorgante, calificacionCarteraRespuesta.nombreOtorgante);
	}

	@Override
	public int hashCode() {
		return Objects.hash(calificacion, nombreOtorgante);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CalificacionCarteraRespuesta {\n");

		sb.append("    calificacion: ").append(toIndentedString(calificacion)).append("\n");
		sb.append("    nombreOtorgante: ").append(toIndentedString(nombreOtorgante)).append("\n");
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
