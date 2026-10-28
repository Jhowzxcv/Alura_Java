package br.com.alura.Atividades.models;

import java.util.List;

@FunctionalInterface
public interface IOrdena {
    void ordenar(List<? extends Comparable<?>> lista);
}
