package br.edu.senac.curriculo.controller;

import br.edu.senac.curriculo.model.Curriculo;
import br.edu.senac.curriculo.model.Tecnologia;
import br.edu.senac.curriculo.model.Projeto;
import br.edu.senac.curriculo.model.Formacao;
import br.edu.senac.curriculo.model.Idioma;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.Arrays;

@Controller
public class CurriculoController {

    @GetMapping("/curriculo")
    public String getCurriculo(Model model) {
        Curriculo curriculo = new Curriculo();
        curriculo.setNome("Guilherme Henrique Silva Pereira");
        curriculo.setEndereco("Rua Condé de Fontalva, 20");
        curriculo.setTelefone("(11) 99312-3958");
        curriculo.setEmail("Guilhermehsp26@gmail.com");
        curriculo.setProfissao("Desenvolvedor Full Stack");
        curriculo.setResumo("Sou um estudante de Análise e Desenvolvimento de Sistemas no 4º semestre do Senac, com um forte\n" +
                "interesse em desenvolvimento Full-Stack. Possuo habilidades em Java, JavaScript,\n" +
                "React, TypeScript, Node.js, banco de dados NoSQL e SQL e consumo de APIs REST, adquiridas através de\n" +
                "projetos acadêmicos e pessoais. Também possuo experiência em projetos gerenciados por\n" +
                "metodologias ágeis. Procuro uma oportunidade de estágio que me permita aplicar meus\n" +
                "conhecimentos na criação de soluções completas e integradas, aprimorando minha capacidade de\n" +
                "desenvolvimento tanto no front-end quanto no back-end.\n");

        curriculo.setTecnologias(Arrays.asList(
                new Tecnologia("Java"),
                new Tecnologia("JavaScript"),
                new Tecnologia("React"),
                new Tecnologia("TypeScript"),
                new Tecnologia("Node.js"),
                new Tecnologia("Spring Boot"),
                new Tecnologia("Angular"),
                new Tecnologia("HTML"),
                new Tecnologia("CSS"),
                new Tecnologia("Sass"),
                new Tecnologia("Tailwind"),
                new Tecnologia("Express"),
                new Tecnologia("MongoDB"),
                new Tecnologia("MySQL")
        ));

        curriculo.setFormacao(Arrays.asList(
                new Formacao("Centro Universitário Senac", "Análise e Desenvolvimento de Sistemas", "Fevereiro 2023 - Julho 2025", "Cursando o 4º semestre"),
                new Formacao("Centro Universitário Senac", "Técnico em Informática", "Fevereiro 2020 - Dezembro 2022", "Concluído"),
                new Formacao("Centro Universitário Senac", "Ensino Médio", "Fevereiro 2020 - Dezembro 2022", "Concluído")
        ));

        curriculo.setProjetos(Arrays.asList(
                new Projeto("Portfólio", "Exibe meus projetos de maneira dinâmica e apresenta um pouco sobre mim.", "https://guilherme-dev-portfolio.vercel.app/", "https://github.com/guihsp/Portfolio"),
                new Projeto("Climate View", "Exibe o clima de uma cidade a partir de sua localização.", "https://climate-view.vercel.app/", "https://github.com/guihsp/climate-view"),
                new Projeto("Lista de Tarefas", "Permite adicionar, editar e excluir tarefas.", "https://lista-de-tarefas-guihsp.netlify.app/", "https://github.com/Guihsp/Lista-de-Tarefas")
        ));

        curriculo.setIdiomas(Arrays.asList(
                new Idioma("Inglês", "Básico"),
                new Idioma("Português", "Fluente")
        ));

        model.addAttribute("curriculo", curriculo);
        return "curriculo";

    }
}