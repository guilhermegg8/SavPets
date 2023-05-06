package com.fatec.scc.model.medicine;

import javax.validation.constraints.NotBlank;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Medicine {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotBlank(message = "Fornecedor requerido")
	private String provider;
	@NotBlank
	private String name;
	@NotBlank
	private String leaflet;
	@NotBlank
	private String utility;
	@NotBlank
	private String expirationDate;
	private String observation;
	@NotBlank
	private String arrivalDate;
	@NotBlank
	private Integer amount;
	@NotBlank
	private String manufacturingDate;

	public Medicine() {
		
	}

	public Medicine(String provider, String name, String leaflet,
					String utility, String expirationDate, String observation, String arrivalDate, Integer amount, String manufacturingDate) {
		this.provider = provider;
		this.name = name;
		this.leaflet = leaflet;
		this.utility = utility;
		this.expirationDate = expirationDate;
		this.observation = observation;
		this.arrivalDate = arrivalDate;
		this.amount = amount;
		this.manufacturingDate = manufacturingDate;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public String getName() {
		return name;
	}
	public void setName(String nomeMecicamento) {
		this.name = nomeMecicamento;
	}
	public String getLeaflet() {
		return leaflet;
	}
	public void setLeaflet(String leaflet) {
		this.leaflet = leaflet;
	}
	public String getUtility() {
		return utility;
	}
	public void setUtility(String utility) {
		this.utility = utility;
	}
	public String getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	public String getObservation() {
		return observation;
	}
	public void setObservation(String observation) {
		this.observation = observation;
	}
	public String getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public String getManufacturingDate() {
		return manufacturingDate;
	}
	public void setManufacturingDate(String manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}
}
