package com.cdc.apihub.mx.RCCPM.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Consultas realizadas a la Persona Moral o Física.")
public class ConsultasInner {
  @SerializedName("fechaConsulta")
  private String fechaConsulta = null;
  @SerializedName("nombreOtorgante")
  private String nombreOtorgante = null;
  public ConsultasInner fechaConsulta(String fechaConsulta) {
    this.fechaConsulta = fechaConsulta;
    return this;
  }
   
  @ApiModelProperty(example = "2004-09-24", value = "Fecha de Consulta, en el formato especificado (por defecto yyyy-MM-dd).")
  public String getFechaConsulta() {
    return fechaConsulta;
  }
  public void setFechaConsulta(String fechaConsulta) {
    this.fechaConsulta = fechaConsulta;
  }
  public ConsultasInner nombreOtorgante(String nombreOtorgante) {
    this.nombreOtorgante = nombreOtorgante;
    return this;
  }
   
  @ApiModelProperty(example = "BANCO", value = "Indica de dónde proviene la información de cliente.")
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
    ConsultasInner consultasInner = (ConsultasInner) o;
    return Objects.equals(this.fechaConsulta, consultasInner.fechaConsulta) &&
        Objects.equals(this.nombreOtorgante, consultasInner.nombreOtorgante);
  }
  @Override
  public int hashCode() {
    return Objects.hash(fechaConsulta, nombreOtorgante);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultasInner {\n");
    
    sb.append("    fechaConsulta: ").append(toIndentedString(fechaConsulta)).append("\n");
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
