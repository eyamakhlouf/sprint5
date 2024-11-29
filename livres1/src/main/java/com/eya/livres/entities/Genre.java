package com.eya.livres.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class Genre {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idGen;
	private String nomGen;
	private String descriptionGen;
	@OneToMany(mappedBy = "genre")
	@JsonIgnore
	private List<Livre> livres;
	/*
	 * public Genre() {} public Genre(String nomGen, String descriptionGen,
	 * List<Livre> livres) { super(); this.nomGen = nomGen; this.descriptionGen =
	 * descriptionGen; this.livres = livres; } public Long getIdGen() { return
	 * idGen; } public void setIdGen(Long idGen) { this.idGen = idGen; } public
	 * String getNomGen() { return nomGen; } public void setNomGen(String nomGen) {
	 * this.nomGen = nomGen; } public String getDescriptionGen() { return
	 * descriptionGen; } public void setDescriptionGen(String descriptionGen) {
	 * this.descriptionGen = descriptionGen; } public List<Livre> getLivres() {
	 * return livres; } public void setLivres(List<Livre> livres) { this.livres =
	 * livres; }
	 */
	

}