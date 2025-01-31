package atividades;

import com.google.gson.annotations.SerializedName;

public record AnalisaCotacao(@SerializedName("USDBRL") CotacaoAtual usdbrl) {
}
