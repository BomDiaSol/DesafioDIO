package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição mentoria Java");
        mentoria1.setData(LocalDate.now());

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        //System.out.println(curso1);
        //System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);
        
        Dev devValeria = new Dev();
        devValeria.setNome("Valéria");
        devValeria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Valéria" + devValeria.getConteudosInscritos());
        devValeria.progredir();
        System.out.println("Conteúdos Conluidos Valéria" + devValeria.getConteudosConcluidos());
        System.out.println("XP: " + devValeria.calcularTotalXP());

        System.out.println("-------------------------------------------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("Conteúdos Concluidos João" + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXP());
    }
}
