package com.cdc.apihub.mx.RCCPM.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import com.cdc.apihub.mx.RCCPM.client.model.CatalogoEstados;
import com.cdc.apihub.mx.RCCPM.client.model.CatalogoPais;

public class PersonaDomicilio {
	@SerializedName("direccion")
	private String direccion = null;
	@SerializedName("CP")
	private String CP = null;
	@SerializedName("delegacionMunicipio")
	private String delegacionMunicipio = null;
	@SerializedName("coloniaPoblacion")
	private String coloniaPoblacion = null;
	@SerializedName("ciudad")
	private String ciudad = null;
	@SerializedName("estado")
	private CatalogoEstados estado = null;
	@SerializedName("estadoExtranjero")
	private String estadoExtranjero = null;
	@SerializedName("pais")
	private CatalogoPais pais = null;

	public PersonaDomicilio direccion(String direccion) {
		this.direccion = direccion;
		return this;
	}

	@ApiModelProperty(example = "CALLE INDUSTRIA ZAPATERA   66", required = true, value = "Campo de dirección en que se ubica el domicilio.")
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public PersonaDomicilio CP(String CP) {
		this.CP = CP;
		return this;
	}

	@ApiModelProperty(example = "45145", required = true, value = "Para domicilios en México se validará la correcta correspondencia del código postal contra el estado ingresado. En el caso de domicilios en el extranjero debe reportarse un dato válido. No rellenar espacio.")
	public String getCP() {
		return CP;
	}

	public void setCP(String CP) {
		this.CP = CP;
	}

	public PersonaDomicilio delegacionMunicipio(String delegacionMunicipio) {
		this.delegacionMunicipio = delegacionMunicipio;
		return this;
	}

	@ApiModelProperty(example = "DEL VALLE", required = true, value = "Delegación o municipio en que se ubica el domicilio.")
	public String getDelegacionMunicipio() {
		return delegacionMunicipio;
	}

	public void setDelegacionMunicipio(String delegacionMunicipio) {
		this.delegacionMunicipio = delegacionMunicipio;
	}

	public PersonaDomicilio coloniaPoblacion(String coloniaPoblacion) {
		this.coloniaPoblacion = coloniaPoblacion;
		return this;
	}

	@ApiModelProperty(example = "DESARROLLO ZAPOPAN NORTE", required = true, value = "Colonia o población en que se ubica el domicilio.")
	public String getColoniaPoblacion() {
		return coloniaPoblacion;
	}

	public void setColoniaPoblacion(String coloniaPoblacion) {
		this.coloniaPoblacion = coloniaPoblacion;
	}

	public PersonaDomicilio ciudad(String ciudad) {
		this.ciudad = ciudad;
		return this;
	}

	@ApiModelProperty(example = "ZAPOPAN", required = true, value = "Ciudad en que se ubica el domicilio.")
	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public PersonaDomicilio estado(CatalogoEstados estado) {
		this.estado = estado;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	public CatalogoEstados getEstado() {
		return estado;
	}

	public void setEstado(CatalogoEstados estado) {
		this.estado = estado;
	}

	public PersonaDomicilio estadoExtranjero(String estadoExtranjero) {
		this.estadoExtranjero = estadoExtranjero;
		return this;
	}

	@ApiModelProperty(example = "ALB", value = "Cuando se solicita el Reporte de Crédito de un Acreditado con domicilio en el extranjero debe ingresarse el nombre completo del estado, provincia, distrito o población donde está el domicilio.")
	public String getEstadoExtranjero() {
		return estadoExtranjero;
	}

	public void setEstadoExtranjero(String estadoExtranjero) {
		this.estadoExtranjero = estadoExtranjero;
	}

	public PersonaDomicilio pais(CatalogoPais pais) {
		this.pais = pais;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	public CatalogoPais getPais() {
		return pais;
	}

	public void setPais(CatalogoPais pais) {
		this.pais = pais;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PersonaDomicilio personaDomicilio = (PersonaDomicilio) o;
		return Objects.equals(this.direccion, personaDomicilio.direccion)
				&& Objects.equals(this.CP, personaDomicilio.CP)
				&& Objects.equals(this.delegacionMunicipio, personaDomicilio.delegacionMunicipio)
				&& Objects.equals(this.coloniaPoblacion, personaDomicilio.coloniaPoblacion)
				&& Objects.equals(this.ciudad, personaDomicilio.ciudad)
				&& Objects.equals(this.estado, personaDomicilio.estado)
				&& Objects.equals(this.estadoExtranjero, personaDomicilio.estadoExtranjero)
				&& Objects.equals(this.pais, personaDomicilio.pais);
	}

	@Override
	public int hashCode() {
		return Objects.hash(direccion, CP, delegacionMunicipio, coloniaPoblacion, ciudad, estado, estadoExtranjero,
				pais);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PersonaDomicilio {\n");

		sb.append("    direccion: ").append(toIndentedString(direccion)).append("\n");
		sb.append("    CP: ").append(toIndentedString(CP)).append("\n");
		sb.append("    delegacionMunicipio: ").append(toIndentedString(delegacionMunicipio)).append("\n");
		sb.append("    coloniaPoblacion: ").append(toIndentedString(coloniaPoblacion)).append("\n");
		sb.append("    ciudad: ").append(toIndentedString(ciudad)).append("\n");
		sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
		sb.append("    estadoExtranjero: ").append(toIndentedString(estadoExtranjero)).append("\n");
		sb.append("    pais: ").append(toIndentedString(pais)).append("\n");
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
