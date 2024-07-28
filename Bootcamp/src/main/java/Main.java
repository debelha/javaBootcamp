import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso de Java");
        curso1.setCargaHoraria(80);

        Curso curso2 = new Curso();
        curso2.setTitulo("JavaScript");
        curso2.setDescricao("Curso de JavaScript");
        curso2.setCargaHoraria(60);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria TI");
        mentoria.setDescricao("Mentoria sobre tecnologia da informação");
        mentoria.setData(LocalDate.now());

     /*   System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Bootcamp sobre java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDeborah = new Dev();
        devDeborah.setNome("Deborah");
        devDeborah.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devDeborah.getConteudosInscritos());
        devDeborah.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos: " + devDeborah.getConteudosInscritos());
        System.out.println("Conteúdos concluidos: " + devDeborah.getConteudosConcluidos());
        System.out.println("XP: " + devDeborah.calcularTotalXP());

        System.out.println("--------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos: " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos concluidos: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devDeborah.calcularTotalXP());
    }
}
