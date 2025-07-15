import java.io.*;
import java.nio.file.*;

public class RemoveLinhasEmBranco {
    public static void main(String[] args) {
        String arquivoEntrada = "input.txt";
        String arquivoSaida = "output.txt";

        try (
            BufferedReader leitor = Files.newBufferedReader(Paths.get(arquivoEntrada));
            BufferedWriter escritor = Files.newBufferedWriter(Paths.get(arquivoSaida))
        ) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                if (!linha.trim().isEmpty()) {
                    escritor.write(linha);
                    escritor.newLine();
                }
            }
            System.out.println("Arquivo processado com sucesso.");
        } catch (IOException e) {
            System.err.println("Erro ao processar o arquivo: " + e.getMessage());
        }
    }
}