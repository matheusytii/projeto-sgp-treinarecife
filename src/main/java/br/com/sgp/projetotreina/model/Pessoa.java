package br.com.sgp.projetotreina.model;

import  jakarta.persistence.*; // importa todas anotações do jpa "@" 
import  jakarta.validation.constraints.Email; // Ele traz a validação que email é válido
import jakarta.validation.constraints.NotBlank; // Indica de o campo não pode ser vazio.

@Entity
@Table(name = "Pessoa", uniqueConstraints = @UniqueConstraint(columnNames = "email")) // Gera automaticamente o Id.
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Gera automaticamente o Id.
    private Long id;


    @NotBlank
    private String nome;


    @NotBlank
    @Email
    @Column (nullable = false, unique = true)
    private String email;


    private String avatar;


    public Pessoa(){} //Construtor vazio é obrigatorio no jpa

        public Pessoa( String nome, String email, String avatar){
            this.nome = nome;
            this.email= email;
            this.avatar= avatar;
        }

    public Long getId () {return id;}
    public void SetId (Long id) {this.id = id;}
    public String getNome() {return nome;}
    public void setNome( String nome) {this.nome = nome;}
    public String getEmail(){ return email;}
    public void setEmail (String email) { this.email = email;}
    public String getAvatar() {return avatar;}

    
}
