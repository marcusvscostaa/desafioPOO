package desafioPOO;

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
        mentoria.setCargaHoraria(15);
        System.out.println(mentoria);


    }
}
