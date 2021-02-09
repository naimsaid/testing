package de.ahus1.bdd.calculator.adapter.jpa;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Alexander Schwartz 2017
 */
@Entity
@Data
public class CalculatorJpa {

    @Id
    @SequenceGenerator(name = "calculator_id_seq", sequenceName = "calculator_id_seq")
    @Column(name = "calculator_id")
    private long id;

    @Version
    private long version;

    private long state;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the version
	 */
	public long getVersion() {
		return version;
	}

	/**
	 * @param version the version to set
	 */
	public void setVersion(long version) {
		this.version = version;
	}

	/**
	 * @return the state
	 */
	public long getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(long state) {
		this.state = state;
	}
    
    
    
    
}
