package br.com.alura.Atividades.postgres;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    LocalDate data;

    @ManyToMany(mappedBy = "pedidos", fetch = FetchType.EAGER)
    private List<Produto> produtos = new ArrayList<>();

    public Pedido() {}

    public Pedido(Long id, LocalDate data) {
        this.id = id;
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getData() {
        return data;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "id: " + id +
                ", data: " + data +
                ", produtos: " + produtos +
                '}';
    }
}
