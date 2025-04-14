package desafioPOO;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso = new Curso();
        curso.setTitulo("Java");
        curso.setDescricao("Aula em JAVA");
        curso.setCargaHoraria(64);

        System.out.println(curso);

        Curso cursoJS = new Curso();
        cursoJS.setTitulo("JavaScript");
        cursoJS.setDescricao("Aula em JavaScript");
        cursoJS.setCargaHoraria(40);

        System.out.println(cursoJS);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria JavaScript");
        mentoria.setDescricao("mentoria em JavaScript");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp JAVA Devloper");
        bootcamp.setDescricao("Descrição Bootcamp JAVA Devloper");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(cursoJS);
        bootcamp.getConteudos().add(mentoria);

        Dev devMarcus = new Dev();
        devMarcus.setNome("Marcus");
        devMarcus.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Marcus " + devMarcus.getConteudosInscritos());
        System.out.println("Conteudos Inscritos Marcus " + devMarcus.getConteudosConcluidos());

        devMarcus.progrendir();
        System.out.println("Conteudos Inscritos Marcus " + devMarcus.getConteudosInscritos());
        System.out.println("Conteudos Inscritos Marcus " + devMarcus.getConteudosConcluidos());
        System.out.println("XP: " + devMarcus.calcularTotalXP());

        Dev devAna =  new Dev();
        devAna.setNome("Ana");
        devAna.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Ana " + devAna.getConteudosInscritos());
        System.out.println("Conteudos Inscritos Ana " + devAna.getConteudosConcluidos());


    }
}
