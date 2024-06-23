import Conteudo.Conteudo;
import Cursos.Curso;
import Mentorias.Mentoria;

import java.time.LocalDate;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Aprenda java com a Dio");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Aprenda javascript do 0 com a Dio");
        curso2.setCargaHoraria(5);

        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("Mentoria de LinkedIn");
        mentoria1.setDescricao("Domine essa ferramenta de profissao");
        mentoria1.setDuracao(LocalDate.now());

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();



//        System.out.println(curso1);
//        System.out.println(curso2);

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("BootCamp java developer");
        bootCamp.setDescricao("Descrição BootCamp Java");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria1);

        Dev devTiago = new Dev();
        devTiago.setNome("Tiago");
        devTiago.inscreverBootcamp(bootCamp);
        System.out.println("Conteudo Inscritos Tiago" + devTiago.getConteudosInscritos());
        devTiago.progredir();
        devTiago.progredir();
        devTiago.progredir();
        System.out.println("---");
        System.out.println("Conteudo Concluidos Tiago" + devTiago.getConteudosConcluidos());
        System.out.println("Conteudo Inscritos Tiago" + devTiago.getConteudosInscritos());
        System.out.println("XP" + devTiago.calcularTotalXp());

        System.out.println("-------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootCamp);
        System.out.println("Conteudo Inscritos João" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("----");
        System.out.println("Conteudo Concluidos João" + devJoao.getConteudosConcluidos());
        System.out.println("Conteudo Inscritos João" + devJoao.getConteudosInscritos());
        System.out.println("XP" + devJoao.calcularTotalXp());
    }
}
