package com.portfolio.portfolio.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "habilidadesDuras")
public class SkillHardModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

     int id_duras;

     int porcentaje_duras;
     String titulo_duras;
     String descripcion_duras;


	// public int getId_duras() {
	// 	return this.id_duras;
	// }

	// public void setId_duras(int id_duras) {
	// 	this.id_duras = id_duras;
	// }

	// public int getPorcentaje_duras() {
	// 	return this.porcentaje_duras;
	// }

	// public void setPorcentaje_duras(int porcentaje_duras) {
	// 	this.porcentaje_duras = porcentaje_duras;
	// }

	// public String getTitulo_duras() {
	// 	return this.titulo_duras;
	// }

	// public void setTitulo_duras(String titulo_duras) {
	// 	this.titulo_duras = titulo_duras;
	// }

	// public String getDescripcion_duras() {
	// 	return this.descripcion_duras;
	// }

	// public void setDescripcion_duras(String descripcion_duras) {
	// 	this.descripcion_duras = descripcion_duras;
	// }





}
