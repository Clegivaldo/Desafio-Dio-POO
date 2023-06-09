import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("descrição da mentoria java");
        mentoria1.setData(LocalDate.now());

/*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devClegivaldo = new Dev();
        devClegivaldo.setNome("Clegivaldo");
        devClegivaldo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos disponíveis: " + devClegivaldo.getConteudosInscritos());

        devClegivaldo.progredir();
        devClegivaldo.progredir();

        System.out.println("*-*");
        System.out.println("Conteúdos disponíveis Clegivaldo: " + devClegivaldo.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Clegivaldo: " + devClegivaldo.getConteudosConcluidos());
        System.out.println("XP:" + devClegivaldo.calcularxp());

        System.out.println("*----------------------*");


        Dev devJulia = new Dev();
        devJulia.setNome("Júlia");
        devJulia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos disponíveis: " + devJulia.getConteudosInscritos());

        devJulia.progredir();
        devJulia.progredir();
        devJulia.progredir();

        System.out.println("*-*");
        System.out.println("Conteúdos disponíveis Júlia: " + devJulia.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Júlia: " + devJulia.getConteudosConcluidos());
        System.out.println("XP:" + devJulia.calcularxp());
    }
}