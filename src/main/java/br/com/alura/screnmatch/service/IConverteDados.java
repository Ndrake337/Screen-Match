package br.com.alura.screnmatch.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
