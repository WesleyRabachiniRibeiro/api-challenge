package com.savelife.project.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_SL_ENDERECO")
@SequenceGenerator(name = "SQ_T_ENDERECO", sequenceName = "SQ_T_ENDERECO", allocationSize = 1)
public class Address {

    @Id
    @Column(name = "CD_ENDERECO", length = 3, nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_T_ENDERECO")
    private Long id;

    @Column(name = "DS_RUA", length = 120, nullable = false)
    private String street;

    @Column(name = "DS_BAIRRO", length = 120, nullable = false)
    private String district;

    @Column(name = "DS_CEP", length = 9, nullable = false)
    private String cep;

    @Column(name = "DS_ESTADO", length = 80, nullable = false)
    private String state;

    @Column(name = "DS_MUNICIPIO", length = 80, nullable = false)
    private String city;

    @OneToOne(mappedBy = "address")
    private Hospital hospital;

    public Address() {
    }

    public Address(String street, String district, String cep, String state, String city) {
        this.street = street;
        this.district = district;
        this.cep = cep;
        this.state = state;
        this.city = city;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
}
