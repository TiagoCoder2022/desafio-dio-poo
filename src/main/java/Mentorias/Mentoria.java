package Mentorias;

import Conteudo.Conteudo;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate duracao;

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {
    }


    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", duracao=" + duracao +
                '}';
    }


    public LocalDate getDuracao() {
        return duracao;
    }

    public void setDuracao(LocalDate duracao) {
        this.duracao = duracao;
    }

}
