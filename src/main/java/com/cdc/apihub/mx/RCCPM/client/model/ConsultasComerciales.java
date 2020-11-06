package com.cdc.apihub.mx.RCCPM.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

@ApiModel(description = "Consultas realizadas por entidades comerciales.")
public class ConsultasComerciales {
	@SerializedName("ultimos3meses")
	private Integer ultimos3meses = null;
	@SerializedName("ultimos12meses")
	private Integer ultimos12meses = null;
	@SerializedName("ultimos24meses")
	private Integer ultimos24meses = null;
	@SerializedName("mas24meses")
	private BigDecimal mas24meses = null;

	public ConsultasComerciales ultimos3meses(Integer ultimos3meses) {
		this.ultimos3meses = ultimos3meses;
		return this;
	}

	@ApiModelProperty(example = "169", value = "Consultas en los últimos 13 meses.")
	public Integer getUltimos3meses() {
		return ultimos3meses;
	}

	public void setUltimos3meses(Integer ultimos3meses) {
		this.ultimos3meses = ultimos3meses;
	}

	public ConsultasComerciales ultimos12meses(Integer ultimos12meses) {
		this.ultimos12meses = ultimos12meses;
		return this;
	}

	@ApiModelProperty(example = "172", value = "Consultas en los últimos 12 meses.")
	public Integer getUltimos12meses() {
		return ultimos12meses;
	}

	public void setUltimos12meses(Integer ultimos12meses) {
		this.ultimos12meses = ultimos12meses;
	}

	public ConsultasComerciales ultimos24meses(Integer ultimos24meses) {
		this.ultimos24meses = ultimos24meses;
		return this;
	}

	@ApiModelProperty(example = "172", value = "Consultas en los últimos 24 meses.")
	public Integer getUltimos24meses() {
		return ultimos24meses;
	}

	public void setUltimos24meses(Integer ultimos24meses) {
		this.ultimos24meses = ultimos24meses;
	}

	public ConsultasComerciales mas24meses(BigDecimal mas24meses) {
		this.mas24meses = mas24meses;
		return this;
	}

	@ApiModelProperty(example = "176.0", value = "Consultas en más de 24 meses.")
	public BigDecimal getMas24meses() {
		return mas24meses;
	}

	public void setMas24meses(BigDecimal mas24meses) {
		this.mas24meses = mas24meses;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConsultasComerciales consultasComerciales = (ConsultasComerciales) o;
		return Objects.equals(this.ultimos3meses, consultasComerciales.ultimos3meses)
				&& Objects.equals(this.ultimos12meses, consultasComerciales.ultimos12meses)
				&& Objects.equals(this.ultimos24meses, consultasComerciales.ultimos24meses)
				&& Objects.equals(this.mas24meses, consultasComerciales.mas24meses);
	}

	@Override
	public int hashCode() {
		return Objects.hash(ultimos3meses, ultimos12meses, ultimos24meses, mas24meses);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConsultasComerciales {\n");

		sb.append("    ultimos3meses: ").append(toIndentedString(ultimos3meses)).append("\n");
		sb.append("    ultimos12meses: ").append(toIndentedString(ultimos12meses)).append("\n");
		sb.append("    ultimos24meses: ").append(toIndentedString(ultimos24meses)).append("\n");
		sb.append("    mas24meses: ").append(toIndentedString(mas24meses)).append("\n");
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
