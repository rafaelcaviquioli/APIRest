/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.topicos.dominio;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 1978233
 */
@Entity
@Table(name = "disco")
@SequenceGenerator(name = "disco_seq")
@XmlRootElement
public class Disco implements Serializable {

    @Id
    @GeneratedValue(generator = "disco_seq", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "idGenero", length = 10, nullable = false)
    private Long idGenero;

    @Column(name = "idGravadora", length = 10, nullable = false)
    private Long idGravadora;

    @Column(name = "idAutor", length = 10, nullable = false)
    private Long idAutor;

    @Column(name = "dataFabricacao", nullable = true)
    private Date dataFabricacao;

    @Column(name = "titulo", length = 150, nullable = true)
    private String titulo;

    @Column(name = "descricao", length = 500, nullable = true)
    private String descricao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(Long idGenero) {
        this.idGenero = idGenero;
    }

    public Long getIdGravadora() {
        return idGravadora;
    }

    public void setIdGravadora(Long idGravadora) {
        this.idGravadora = idGravadora;
    }

    public Long getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Long idAutor) {
        this.idAutor = idAutor;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
