package com.cdc.apihub.mx.RCCPM.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

public class DeclarativasRespuesta {
	@SerializedName("declarativa")
	private String declarativa = null;
	@SerializedName("fechaDeclarativa")
	private String fechaDeclarativa = null;

	public DeclarativasRespuesta declarativa(String declarativa) {
		this.declarativa = declarativa;
		return this;
	}

	@ApiModelProperty(example = "NO ESTOY DE ACUERDO CON LO QUE FUE DICTAMINADO", value = "Declarativa del acreditado en razón de su desacuerdo con el resultado del proceso de reclamación a una institución otorgante.")
	public String getDeclarativa() {
		return declarativa;
	}

	public void setDeclarativa(String declarativa) {
		this.declarativa = declarativa;
	}

	public DeclarativasRespuesta fechaDeclarativa(String fechaDeclarativa) {
		this.fechaDeclarativa = fechaDeclarativa;
		return this;
	}

	@ApiModelProperty(example = "2012-12-01", value = "Fecha de nacimiento de la persona, en el formato especificado (por defecto yyyy-MM-dd).")
	public String getFechaDeclarativa() {
		return fechaDeclarativa;
	}

	public void setFechaDeclarativa(String fechaDeclarativa) {
		this.fechaDeclarativa = fechaDeclarativa;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DeclarativasRespuesta declarativasRespuesta = (DeclarativasRespuesta) o;
		return Objects.equals(this.declarativa, declarativasRespuesta.declarativa)
				&& Objects.equals(this.fechaDeclarativa, declarativasRespuesta.fechaDeclarativa);
	}

	@Override
	public int hashCode() {
		return Objects.hash(declarativa, fechaDeclarativa);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DeclarativasRespuesta {\n");

		sb.append("    declarativa: ").append(toIndentedString(declarativa)).append("\n");
		sb.append("    fechaDeclarativa: ").append(toIndentedString(fechaDeclarativa)).append("\n");
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
