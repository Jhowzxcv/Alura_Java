package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.*;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(6);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> listaDeAssistidos = new ArrayList<>();
        listaDeAssistidos.add(filmeDoPaulo);
        listaDeAssistidos.add(meuFilme);
        listaDeAssistidos.add(outroFilme);
        listaDeAssistidos.add(lost);
        for (Titulo item: listaDeAssistidos){
            System.out.println(item.getNome());
            if (item instanceof Filme filme) {
                System.out.println("Classifucação " + filme.getClassificacao());
            }
        }

        List<String> buscaPorArtista = new LinkedList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação:");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de títulos ordenados");
        Collections.sort(listaDeAssistidos);
        System.out.println(listaDeAssistidos);
        listaDeAssistidos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(listaDeAssistidos);


       /* ArrayList<String> listaStrings = new ArrayList<>();
        listaStrings.add("Java");
        listaStrings.add("C++");
        listaStrings.add("Python");

        for (String elemento : listaStrings) {
            System.out.println(elemento);
        }


        Animal animal = new Cachorro();

        if (animal instanceof Animal) {
            Cachorro cachorro = (Cachorro) animal;
        }*/



        List<Integer> inteiros = new ArrayList<>();
        inteiros.add(2);
        inteiros.add(1);
        inteiros.add(5);
        inteiros.add(4);
        inteiros.add(3);

        Collections.sort(inteiros);
        System.out.println(inteiros);


        List<String> list;

            list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

            list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        System.out.println("ArrayList: " + list);
        System.out.println("LinkedList: " + list);
    }


}

