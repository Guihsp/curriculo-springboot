package br.edu.senac.curriculo.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Projeto {
    private String nome;
    private String descricao;
    private String urlDeploy;
    private String urlRepositorio;

}
