package br.com;

import java.io.*;

public class Atv10 {
    public static void main(String[] args) {
        String arquivo1 = "arquivo1.txt";
        String arquivo2 = "arquivo2.txt";
        String arquivoConcatenado = "arquivo_concatenado.txt";

        try (BufferedReader reader1 = new BufferedReader(new FileReader(arquivo1));
             BufferedReader reader2 = new BufferedReader(new FileReader(arquivo2));
             FileWriter writer = new FileWriter(arquivoConcatenado)) {

            String linha;

            // Lê e escreve as linhas de arquivo1.txt
            while ((linha = reader1.readLine()) != null) {
                writer.write(linha);
                writer.write("\n"); // Adiciona uma nova linha
            }

            // Lê e escreve as linhas de arquivo2.txt
            while ((linha = reader2.readLine()) != null) {
                writer.write(linha);
                writer.write("\n"); // Adiciona uma nova linha
            }

        } catch (IOException e) {
            System.err.println("Erro ao ler ou escrever os arquivos: " + e.getMessage());
        }

        System.out.println("Arquivo concatenado criado com sucesso!");
    }
}